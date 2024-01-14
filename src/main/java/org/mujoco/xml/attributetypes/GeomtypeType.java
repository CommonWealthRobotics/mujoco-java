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
 * <p>Java class for geomtypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="geomtypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plane"/>
 *     &lt;enumeration value="hfield"/>
 *     &lt;enumeration value="sphere"/>
 *     &lt;enumeration value="capsule"/>
 *     &lt;enumeration value="ellipsoid"/>
 *     &lt;enumeration value="cylinder"/>
 *     &lt;enumeration value="box"/>
 *     &lt;enumeration value="mesh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "geomtypeType", namespace = "attributeTypes")
@XmlEnum
public enum GeomtypeType {

    @XmlEnumValue("plane")
    PLANE("plane"),
    @XmlEnumValue("hfield")
    HFIELD("hfield"),
    @XmlEnumValue("sphere")
    SPHERE("sphere"),
    @XmlEnumValue("capsule")
    CAPSULE("capsule"),
    @XmlEnumValue("ellipsoid")
    ELLIPSOID("ellipsoid"),
    @XmlEnumValue("cylinder")
    CYLINDER("cylinder"),
    @XmlEnumValue("box")
    BOX("box"),
    @XmlEnumValue("mesh")
    MESH("mesh");
    private final String value;

    GeomtypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeomtypeType fromValue(String v) {
        for (GeomtypeType c: GeomtypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
