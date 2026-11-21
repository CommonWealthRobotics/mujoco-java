package mujoco.java;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.mujoco.MuJoCoModelManager;
import org.mujoco.MuJoCoXML;
import org.mujoco.xml.Asset;
import org.mujoco.xml.Body;
import org.mujoco.xml.Default;
import org.mujoco.xml.KwBool;
import org.mujoco.xml.KwBuiltin;
import org.mujoco.xml.KwCamlight;
import org.mujoco.xml.KwFalseTrueAuto;
import org.mujoco.xml.KwGeomtype;
import org.mujoco.xml.Mujoco;
import org.mujoco.xml.Worldbody;

public class XMLtest {

	@Test
	public void marshal() throws JAXBException, IOException, InterruptedException {
		Mujoco.Builder<Void> builder = Mujoco.builder()
				.withModel("Test Robot");

		builder.addSize().withMemory("100M");
		builder.addOption().withTimestep(0.005);
		builder.addVisual().addMap().withForce(0.1f).withZfar(30f);
		builder.addStatistic().withCenter(0d, 0d, 0.7d);

		Asset.Builder<?> asset = builder.addAsset();
		asset.addTexture()
				.withName("grid")
				.withType("2d")
				.withBuiltin(KwBuiltin.CHECKER)
				.withRgb1(0.1, 0.2, 0.3)
				.withRgb2(0.2, 0.3, 0.4)
				.withWidth(512)
				.withHeight(512);
		asset.addMaterial()
				.withName("grid")
				.withTexture("grid")
				.withTexrepeat(1f, 1f)
				.withTexuniform(KwBool.TRUE)
				.withReflectance(0.2f);

		builder.addTendon().addFixed()
				.addJoint()
				.withJoint("neck")
				.withCoef(-0.5);

		builder.addContact().addExclude()
				.withBody1("torso")
				.withBody2("head");

		Default.Builder<?> addDefault = builder.addDefault();
		addDefault.addMotor()
				.withCtrllimited(KwFalseTrueAuto.TRUE)
				.withCtrlrange(-1d, 1d);

		Default.Builder<?> thigh = addDefault.addDefault()
				.withClazz("body")
				.addDefault()
				.withClazz("thigh");
		thigh.addGeom()
				.withType(KwGeomtype.CAPSULE)
				.withSize(0.06d)
				.withCondim(1)
				.withGroup(1)
				.withMaterial("grid")
				.withFriction(0.7d)
				.withSolimp(0.9d, 0.99d, 0.003d)
				.withSolref(0.015d, 1d);

		builder.addActuator().addMotor()
				.withName("neck")
				.withGear(100d)
				.withJoint("neck");

		Worldbody.Builder<?> addWorldbody = builder.addWorldbody();
		addWorldbody.addGeom()
				.withName("floor")
				.withType(KwGeomtype.PLANE)
				.withCondim(3)
				.withSize(0d, 0d, 0.05d)
				.withMaterial("grid");
		addWorldbody.addCamera();

		addWorldbody.addLight()
				.withName("spotlight")
				.withMode(KwCamlight.TARGETBODYCOM)
				.withTarget("torso")
				.withPos(0d, -6d, 4d)
				.withCutoff(30f)
				.withDiffuse(0.8f, 0.8f, 0.8f);

		Body.Builder<?> topbody = addWorldbody.addBody();
		topbody.withName("torso")
				.withChildclass("body")
				.withPos(0d, 0d, 1.282d)
				.addGeom()
				.withName("torso")
				.withType(KwGeomtype.CAPSULE)
				.withSize(0.07d)
				.withFromto(0d, -0.07d, 0d, 0d, 0.07d, 0d);

		topbody.addLight()
				.withName("top")
				.withMode(KwCamlight.TRACKCOM)
				.withPos(0d, 0d, 2d);
		topbody.addCamera();
		topbody.addFreejoint().withName("root");

		Body.Builder<?> head = topbody.addBody();
		head.withName("head")
				.withPos(0d, 0d, 2.2d);
		head.addJoint()
				.withName("neck")
				.withAxis(2d, 1d, 1d);
		head.addGeom()
				.withName("head")
				.withType(KwGeomtype.CAPSULE)
				.withSize(0.07d)
				.withFromto(0d, -0.07d, 0d, 0d, 0.07d, 0d);

		Mujoco m = builder.build();

		String marshaled = MuJoCoXML.marshal(m);
		System.out.println(marshaled);

		Mujoco m2 = MuJoCoXML.unmarshal(marshaled);
		assertNotNull("unmarshal failed", m2);

		MuJoCoModelManager mRuntime = new MuJoCoModelManager(marshaled);
		while (mRuntime.getCurrentSimulationTimeSeconds() < 1) {
			mRuntime.step();
			Thread.sleep(mRuntime.getTimestepMilliSeconds());
		}
		mRuntime.close();
	}

	@Test
	public void unmarshal() throws JAXBException, IOException, InterruptedException {
		File file = new File("model/humanoid/humanoid.xml");
		if (!file.exists()) {
			fail("File is missing from the disk");
		}
		Mujoco m = MuJoCoXML.unmarshal(file);

		String marshaled = MuJoCoXML.marshal(m);
		System.out.println(marshaled);

		MuJoCoModelManager mRuntime = new MuJoCoModelManager(marshaled);
		while (mRuntime.getCurrentSimulationTimeSeconds() < 1) {
			mRuntime.step();
			Thread.sleep(mRuntime.getTimestepMilliSeconds());
		}
		mRuntime.close();
	}

}
