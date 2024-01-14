package mujoco.java;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.mujoco.xml.MuJoCoXML;
import org.mujoco.xml.mujoco;

public class XMLtest {

	@Test
	public void unmarshal() throws JAXBException {
		String filename = "model/humanoid/humanoid.xml";
		File file = new File(filename);
		if (!file.exists()) {
			fail("File is missing from the disk");
		}
		mujoco m = MuJoCoXML.unmarshal(file);
		
		String marshaled = MuJoCoXML.marshal(m);
		
		System.out.println(marshaled);
		
	}

}
