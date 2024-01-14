//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.attributetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datatypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="datatypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="real"/>
 *     &lt;enumeration value="positive"/>
 *     &lt;enumeration value="axis"/>
 *     &lt;enumeration value="quaternion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "datatypeType", namespace = "attributeTypes")
@XmlEnum
public enum DatatypeType {

    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("positive")
    POSITIVE("positive"),
    @XmlEnumValue("axis")
    AXIS("axis"),
    @XmlEnumValue("quaternion")
    QUATERNION("quaternion");
    private final String value;

    DatatypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatatypeType fromValue(String v) {
        for (DatatypeType c: DatatypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}