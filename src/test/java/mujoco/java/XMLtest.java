package mujoco.java;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.junit.Test;
import org.mujoco.xml.BodyarchType;
import org.mujoco.MuJoCoModelManager;
import org.mujoco.MuJoCoXML;
import org.mujoco.xml.Mujoco;
import org.mujoco.xml.Mujoco.Builder;
import org.mujoco.xml.attributetypes.BuiltinType;
import org.mujoco.xml.attributetypes.CameramodeType;
import org.mujoco.xml.attributetypes.GeomtypeType;
import org.mujoco.xml.attributetypes.JointtypeType;
import org.mujoco.xml.body.LightType;

import com.kscs.util.jaxb.BoundList;

public class XMLtest {
	
	@Test
	public void marshal() throws JAXBException, IOException, InterruptedException {
		
		
		Builder<Void> builder = Mujoco.builder();
		builder.addOption()
				.withTimestep(new BigDecimal(0.005));
		builder.addVisual()
				.addMap()
					.withForce(new BigDecimal(0.1))
					.withZfar(new BigDecimal(30))
		;
		builder.addStatistic()
				.withCenter("0 0 0.7");
		Mujoco.Asset.Builder<?> asset = builder.addAsset();
		asset.addTexture()
			.withName("grid")
			.withType("2d")
			.withBuiltin(BuiltinType.CHECKER)
			.withRgb1(".1 .2 .3")
			.withRgb2(".2 .3 .4")
			.withWidth(512)
			.withHeight(512)
		;
		asset.addMaterial()
				.withName("grid")
				.withTexture("grid")
				.withTexrepeat("1 1")
				.withTexuniform(true)
				.withReflectance(BigDecimal.valueOf(0.2))
		;
//		builder.addKeyframe()
//				.addKey()
//				.withName("squat")
//				.withQpos("0 0 0.596                             0.988015 0 0.154359 0                             0 0.4 0                             -0.25 -0.5 -2.5 -2.65 -0.8 0.56                             -0.25 -0.5 -2.5 -2.65 -0.8 0.56                             0 0 0 0 0 0")
//				
//		;
		builder.addTendon()
			.addFixed()
				.addJoint()
				.withJoint("torso")
				.withCoef(BigDecimal.valueOf(-0.5))
		
		;
		builder.addContact().addExclude()
				.withBody1("torso")
				.withBody2("head")
		;
		Mujoco.Default.Builder<?> addDefault = builder.addDefault();
		addDefault
				.addMotor()
					.withCtrllimited(true)
					.withCtrlrange("-1 1")
		;
		org.mujoco.xml.DefaultType.Builder<?> addDefault2 = addDefault.addDefault();
		addDefault2
					.withClazz("body")
					.addDefault()
						.withClazz("thigh")
						.addGeom()
						.withSize("0.06")
					
		;
		addDefault2.addGeom()
			.withType(GeomtypeType.CAPSULE)
			.withCondim(1)
			.withGroup(1)
			.withMaterial("grid")
			.withFriction("0.7")
			.withSolimp("0.9 0.99 0.003")
			.withSolref("0.015 1")
		;
		Mujoco.Actuator.Builder<?> addActuator = builder.addActuator();
		//addActuator.addMuscle();
		addActuator.addMotor()
					.withName("torso")
					.withGear("100")
					.withJoint("torso")
		
		;
		Mujoco.Worldbody.Builder<?> addWorldbody = builder.addWorldbody();
		addWorldbody.addGeom()
				.withName("floor")
				.withType(GeomtypeType.PLANE)
				.withCondim(3)
				.withSize("0 0 .05")
				.withMaterial("grid")
		;
		addWorldbody.addCamera();
		
		addWorldbody.addLight()
			.withName("spotlight")
			.withMode(CameramodeType.TARGETBODYCOM)
			.withTarget("torso")
			.withPos("0 -6 4")
			.withCutoff(BigDecimal.valueOf(30))
			.withDiffuse(".8 .8 .8")
			.withSpecular(null)
		;
		BodyarchType.Builder<?> topbody = addWorldbody.addBody();
		topbody	.withName("torso")
				.withChildclass("body")
				.withPos("0 0 1.282")
				.addGeom()
					.withName("torso")
					.withSize("0.07")
					.withFromto("0 -.07 0 0 .07 0")

		;
		
		topbody.addLight()
				.withName("top")
				.withMode(CameramodeType.TRACKCOM)
				.withPos("0 0 2")
		;
		topbody.addCamera();
		topbody.addFreejoint().withName("root");
		topbody.addInertial()
		.withMass(BigDecimal.valueOf(0.01))
		.withPos(".1 .1 .1")
		;		
		//topbody.addBody();
		// In the future if this test breaks after generating code, see the solution in
		// https://github.com/CommonWealthRobotics/mujoco-java/pull/6/commits/e8d65eeec490bb935111a99f5d049991735864c0
		BodyarchType.Builder<?> head = topbody.addBody();
		head
			.withName("head")
			.withPos("0 0 2.2")
		;
		head.addInertial()
			.withMass(BigDecimal.valueOf(0.01))
			.withPos(".1 .1 .1")
		;
		head.addJoint(JointtypeType.HINGE)
				.withName("torso")
				.withAxis("2 1 1")
		;
//		topbody.addBody().withName("arm").withPos("0 1.1 0");		
		
		Mujoco m =builder.build();
		
		String marshaled = MuJoCoXML.marshal(m);
		
		System.out.println(marshaled);
		Mujoco m2 = MuJoCoXML.unmarshal(marshaled);
		if(m2==null)
			fail("unmarshal failed");
		MuJoCoModelManager mRuntime = new MuJoCoModelManager(marshaled);
		while (mRuntime.getCurrentSimulationTimeSeconds() < 1) {
			mRuntime.step();
			// sleep
			Thread.sleep(mRuntime.getTimestepMilliSeconds());
			for(String s:mRuntime.getBodyNames()) {
				//System.out.println("Body "+s+" pose "+mRuntime.getBodyPose(s));
			}
		}
		mRuntime.close();
	}

	@Test
	public void unmarshal() throws JAXBException {
		String filename = "model/humanoid/humanoid.xml";
		File file = new File(filename);
		if (!file.exists()) {
			fail("File is missing from the disk");
		}
		Mujoco m = MuJoCoXML.unmarshal(file);
	
		
		String marshaled = MuJoCoXML.marshal(m);
		
		System.out.println(marshaled);
		
	}

}
