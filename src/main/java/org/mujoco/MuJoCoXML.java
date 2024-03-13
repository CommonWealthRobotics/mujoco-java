package org.mujoco;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import org.mujoco.xml.Mujoco;

public class MuJoCoXML {
	public static Mujoco unmarshal(File xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Mujoco.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		// We had written this file in marshalling example
		return (Mujoco) jaxbUnmarshaller.unmarshal(xml);

	}

	public static String marshal(Mujoco source) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Mujoco.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter w = new StringWriter();
		jaxbMarshaller.marshal(source, w);

		return w.toString();

	}

	public static void marshal(Mujoco source, File dest) throws JAXBException, IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(dest.getAbsolutePath(), true));

		writer.append(marshal(source));

		writer.close();
	}
}
