package org.mujoco.xml;

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

public class MuJoCoXML {
	public static mujoco unmarshal(File xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(mujoco.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		// We had written this file in marshalling example
		return (mujoco) jaxbUnmarshaller.unmarshal(xml);

	}

	public static String marshal(mujoco source) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(mujoco.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter w = new StringWriter();
		jaxbMarshaller.marshal(source, w);

		return w.toString();

	}

	public static void marshal(mujoco source, File dest) throws JAXBException, IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(dest.getAbsolutePath(), true));

		writer.append(marshal(source));

		writer.close();
	}
}
