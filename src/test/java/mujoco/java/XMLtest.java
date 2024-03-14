package mujoco.java;

import static org.junit.Assert.*;

import java.io.File;
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
import org.mujoco.xml.body.LightType;

import com.kscs.util.jaxb.BoundList;

public class XMLtest {
	
	@Test
	public void marshal() throws JAXBException {
		
		
		Builder<Void> builder = Mujoco.builder();
		builder.addActuator().addCylinder();
		builder.addActuator().addMotor();
		org.mujoco.xml.Mujoco.Worldbody.Builder<? extends Builder<Void>> addWorldbody = builder.addWorldbody();
		org.mujoco.xml.BodyarchType.Builder<? extends Mujoco.Worldbody.Builder<?>> topbody = addWorldbody.addBody();
		topbody.withName("torso");
		topbody.withChildclass("body");
		topbody.withPos("0 0 1.282");
		
		//topbody.addBody();
		topbody.addBody().withName("Head").withPos("0 0 2.2")
		.addBody()
			.withName("mowhawk")
			.withPos("0 0 1.2")
		;
		
		
		//topbody.addBody(topbody.ge);
		//org.mujoco.xml.BodyarchType.Builder<?> lightBuilder = topbody.addLight(element );
		//lightBuilder.withName("spotlight");
		//lightBuilder.withPos("0 -6 4");
		
		
		Mujoco m =builder.build();
		
		String marshaled = MuJoCoXML.marshal(m);
		
		System.out.println(marshaled);
		
		Mujoco m2 = new Mujoco();
		
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
