//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.attributetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gaintypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gaintypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fixed"/&gt;
 *     &lt;enumeration value="muscle"/&gt;
 *     &lt;enumeration value="user"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gaintypeType", namespace = "attributeTypes")
@XmlEnum
public enum GaintypeType {

    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("muscle")
    MUSCLE("muscle"),
    @XmlEnumValue("user")
    USER("user");
    private final String value;

    GaintypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GaintypeType fromValue(String v) {
        for (GaintypeType c: GaintypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
