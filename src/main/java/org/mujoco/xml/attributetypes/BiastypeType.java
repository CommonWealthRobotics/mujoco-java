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
 * <p>Java class for biastypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="biastypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="affine"/&gt;
 *     &lt;enumeration value="muscle"/&gt;
 *     &lt;enumeration value="user"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "biastypeType", namespace = "attributeTypes")
@XmlEnum
public enum BiastypeType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("affine")
    AFFINE("affine"),
    @XmlEnumValue("muscle")
    MUSCLE("muscle"),
    @XmlEnumValue("user")
    USER("user");
    private final String value;

    BiastypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BiastypeType fromValue(String v) {
        for (BiastypeType c: BiastypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
