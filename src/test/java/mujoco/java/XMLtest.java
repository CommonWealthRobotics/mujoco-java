package mujoco.java;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.mujoco.xml.MuJoCoXML;
import org.mujoco.xml.Mujoco;
import org.mujoco.xml.Mujoco.Builder;

public class XMLtest {
	
	@Test
	public void marshal() throws JAXBException {
		
		
		Builder<Void> builder = Mujoco.builder();
		builder.addActuator();
		builder.addActuator();
		
		
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
		
		//System.out.println(marshaled);
		
	}

}
