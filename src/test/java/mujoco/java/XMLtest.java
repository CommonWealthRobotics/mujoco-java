package mujoco.java;

import static org.junit.Assert.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.junit.Test;
import org.mujoco.xml.BodyarchType;
import org.mujoco.MuJoCoXML;
import org.mujoco.xml.Mujoco;
import org.mujoco.xml.Mujoco.Builder;
import org.mujoco.xml.attributetypes.CameramodeType;
import org.mujoco.xml.attributetypes.GeomtypeType;
import org.mujoco.xml.body.LightType;

import com.kscs.util.jaxb.BoundList;

public class XMLtest {
	
	@Test
	public void marshal() throws JAXBException {
		
		
		Builder<Void> builder = Mujoco.builder();
		builder.addActuator().addCylinder();
		builder.addActuator().addMotor();
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

		;
		topbody.addLight()
				.withName("top")
				.withMode(CameramodeType.TRACKCOM)
				.withPos("0 0 2")
		;
		topbody.addCamera();
		topbody.addFreejoint().withName("root");
				
		//topbody.addBody();
		// In the future if this test breaks after generating code, see the solution in
		// https://github.com/CommonWealthRobotics/mujoco-java/pull/6/commits/e8d65eeec490bb935111a99f5d049991735864c0
		topbody.addBody()
			.withName("Head")
			.withPos("0 0 2.2")
			.addBody()
				.withName("mowhawk")
				.withPos("0 0 1.2")
		;
		topbody.addBody().withName("arm").withPos("0 1.1 0");
		
		//topbody.addBody(topbody.ge);
		//org.mujoco.xml.BodyarchType.Builder<?> lightBuilder = topbody.addLight(element );
		//lightBuilder.withName("spotlight");
		//lightBuilder.withPos("0 -6 4");
		
		
		Mujoco m =builder.build();
		
		String marshaled = MuJoCoXML.marshal(m);
		
		System.out.println(marshaled);
	
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
