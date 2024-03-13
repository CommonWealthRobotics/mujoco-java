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
 * <p>Java class for dyntypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dyntypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="integrator"/&gt;
 *     &lt;enumeration value="filter"/&gt;
 *     &lt;enumeration value="muscle"/&gt;
 *     &lt;enumeration value="user"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
