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
 * <p>Java class for needstageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="needstageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pos"/&gt;
 *     &lt;enumeration value="vel"/&gt;
 *     &lt;enumeration value="acc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "needstageType", namespace = "attributeTypes")
@XmlEnum
public enum NeedstageType {

    @XmlEnumValue("pos")
    POS("pos"),
    @XmlEnumValue("vel")
    VEL("vel"),
    @XmlEnumValue("acc")
    ACC("acc");
    private final String value;

    NeedstageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NeedstageType fromValue(String v) {
        for (NeedstageType c: NeedstageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
