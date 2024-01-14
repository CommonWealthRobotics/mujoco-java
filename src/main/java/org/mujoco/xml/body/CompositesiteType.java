//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compositesiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositesiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="size" type="{attributeTypes}upToThreeRealsType" default="0.005 0.005 0.005" />
 *       &lt;attribute name="material" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rgba" type="{attributeTypes}fourRealsType" default="0.5 0.5 0.5 1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositesiteType")
public class CompositesiteType {

    @XmlAttribute(name = "group")
    protected Integer group;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "material")
    protected String material;
    @XmlAttribute(name = "rgba")
    protected String rgba;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getGroup() {
        if (group == null) {
            return  0;
        } else {
            return group;
        }
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroup(Integer value) {
        this.group = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        if (size == null) {
            return "0.005 0.005 0.005";
        } else {
            return size;
        }
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the rgba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgba() {
        if (rgba == null) {
            return "0.5 0.5 0.5 1";
        } else {
            return rgba;
        }
    }

    /**
     * Sets the value of the rgba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgba(String value) {
        this.rgba = value;
    }

}