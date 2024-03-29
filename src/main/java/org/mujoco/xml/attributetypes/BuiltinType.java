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
 * <p>Java class for builtinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="builtinType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="gradient"/&gt;
 *     &lt;enumeration value="checker"/&gt;
 *     &lt;enumeration value="flat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
