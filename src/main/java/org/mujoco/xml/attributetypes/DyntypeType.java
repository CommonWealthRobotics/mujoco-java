//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.attributetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dyntypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dyntypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="integrator"/>
 *     &lt;enumeration value="filter"/>
 *     &lt;enumeration value="muscle"/>
 *     &lt;enumeration value="user"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dyntypeType", namespace = "attributeTypes")
@XmlEnum
public enum DyntypeType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("integrator")
    INTEGRATOR("integrator"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("muscle")
    MUSCLE("muscle"),
    @XmlEnumValue("user")
    USER("user");
    private final String value;

    DyntypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DyntypeType fromValue(String v) {
        for (DyntypeType c: DyntypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
