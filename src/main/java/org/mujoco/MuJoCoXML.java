package org.mujoco;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.mujoco.xml.Mujoco;
import org.mujoco.xml.ObjectFactory;

public class MuJoCoXML {
	// the schema declares <mujoco> as a global element of a named complex type,
	// so JAXB binds the root as a JAXBElement instead of an annotated class
	private static Mujoco root(JAXBElement<Mujoco> element) {
		return element.getValue();
	}

	public static Mujoco unmarshal(File xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Mujoco.class, ObjectFactory.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		Object result = jaxbUnmarshaller.unmarshal(xml);
		return result instanceof JAXBElement ? root((JAXBElement<Mujoco>) result) : (Mujoco) result;
	}

	public static Mujoco unmarshal(String xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Mujoco.class, ObjectFactory.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		Object result = jaxbUnmarshaller.unmarshal(new StringReader(xml));
		return result instanceof JAXBElement ? root((JAXBElement<Mujoco>) result) : (Mujoco) result;
	}

	public static String marshal(Mujoco source) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Mujoco.class, ObjectFactory.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter w = new StringWriter();
		jaxbMarshaller.marshal(new ObjectFactory().createMujoco(source), w);

		return w.toString();
	}

	public static void marshal(Mujoco source, File dest) throws JAXBException, IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(dest.getAbsolutePath(), true));

		writer.append(marshal(source));

		writer.close();
	}
}
