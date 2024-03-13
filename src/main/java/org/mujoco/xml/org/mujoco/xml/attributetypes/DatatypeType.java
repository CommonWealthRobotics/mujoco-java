//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:32:01 PM EDT 
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
 * &lt;simpleType name="datatypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="positive"/&gt;
 *     &lt;enumeration value="axis"/&gt;
 *     &lt;enumeration value="quaternion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
