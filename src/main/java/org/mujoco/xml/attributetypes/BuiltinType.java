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
 * <p>Java class for builtinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="builtinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="gradient"/>
 *     &lt;enumeration value="checker"/>
 *     &lt;enumeration value="flat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "builtinType", namespace = "attributeTypes")
@XmlEnum
public enum BuiltinType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("gradient")
    GRADIENT("gradient"),
    @XmlEnumValue("checker")
    CHECKER("checker"),
    @XmlEnumValue("flat")
    FLAT("flat");
    private final String value;

    BuiltinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuiltinType fromValue(String v) {
        for (BuiltinType c: BuiltinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
