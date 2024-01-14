//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.BodyarchType;


/**
 * <p>Java class for bodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="childclass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mocap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="pos" type="{attributeTypes}threeRealsType" />
 *       &lt;attribute name="quat" type="{attributeTypes}fourRealsType" default="1 0 0 0" />
 *       &lt;attribute name="axisangle" type="{attributeTypes}fourRealsType" />
 *       &lt;attribute name="euler" type="{attributeTypes}threeRealsType" />
 *       &lt;attribute name="xyaxes" type="{attributeTypes}sixRealsType" />
 *       &lt;attribute name="zaxis" type="{attributeTypes}threeRealsType" />
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyType")
@XmlSeeAlso({
    BodyarchType.class
})
public class BodyType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "childclass")
    protected String childclass;
    @XmlAttribute(name = "mocap")
    protected Boolean mocap;
    @XmlAttribute(name = "pos")
    protected String pos;
    @XmlAttribute(name = "quat")
    protected String quat;
    @XmlAttribute(name = "axisangle")
    protected String axisangle;
    @XmlAttribute(name = "euler")
    protected String euler;
    @XmlAttribute(name = "xyaxes")
    protected String xyaxes;
    @XmlAttribute(name = "zaxis")
    protected String zaxis;
    @XmlAttribute(name = "user")
    protected String user;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the childclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildclass() {
        return childclass;
    }

    /**
     * Sets the value of the childclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildclass(String value) {
        this.childclass = value;
    }

    /**
     * Gets the value of the mocap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMocap() {
        if (mocap == null) {
            return false;
        } else {
            return mocap;
        }
    }

    /**
     * Sets the value of the mocap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMocap(Boolean value) {
        this.mocap = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPos(String value) {
        this.pos = value;
    }

    /**
     * Gets the value of the quat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuat() {
        if (quat == null) {
            return "1 0 0 0";
        } else {
            return quat;
        }
    }

    /**
     * Sets the value of the quat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuat(String value) {
        this.quat = value;
    }

    /**
     * Gets the value of the axisangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisangle() {
        return axisangle;
    }

    /**
     * Sets the value of the axisangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisangle(String value) {
        this.axisangle = value;
    }

    /**
     * Gets the value of the euler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuler() {
        return euler;
    }

    /**
     * Sets the value of the euler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuler(String value) {
        this.euler = value;
    }

    /**
     * Gets the value of the xyaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXyaxes() {
        return xyaxes;
    }

    /**
     * Sets the value of the xyaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXyaxes(String value) {
        this.xyaxes = value;
    }

    /**
     * Gets the value of the zaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZaxis() {
        return zaxis;
    }

    /**
     * Sets the value of the zaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZaxis(String value) {
        this.zaxis = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
