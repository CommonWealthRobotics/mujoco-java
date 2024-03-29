//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.actuator;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mujoco.xml.actuator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mujoco.xml.actuator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralType }
     * 
     */
    public GeneralType createGeneralType() {
        return new GeneralType();
    }

    /**
     * Create an instance of {@link MotorType }
     * 
     */
    public MotorType createMotorType() {
        return new MotorType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link VelocityType }
     * 
     */
    public VelocityType createVelocityType() {
        return new VelocityType();
    }

    /**
     * Create an instance of {@link CylinderType }
     * 
     */
    public CylinderType createCylinderType() {
        return new CylinderType();
    }

    /**
     * Create an instance of {@link MuscleType }
     * 
     */
    public MuscleType createMuscleType() {
        return new MuscleType();
    }

}
