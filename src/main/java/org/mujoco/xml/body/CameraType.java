//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.body;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.CameramodeType;


/**
 * <p>Java class for cameraType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cameraType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{attributeTypes}cameramodeType" default="fixed" />
 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fovy" type="{http://www.w3.org/2001/XMLSchema}decimal" default="45" />
 *       &lt;attribute name="ipd" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.068" />
 *       &lt;attribute name="pos" type="{attributeTypes}threeRealsType" default="0 0 0" />
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
@XmlType(name = "cameraType")
public class CameraType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "mode")
    protected CameramodeType mode;
    @XmlAttribute(name = "target")
    protected String target;
    @XmlAttribute(name = "fovy")
    protected BigDecimal fovy;
    @XmlAttribute(name = "ipd")
    protected BigDecimal ipd;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link CameramodeType }
     *     
     */
    public CameramodeType getMode() {
        if (mode == null) {
            return CameramodeType.FIXED;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameramodeType }
     *     
     */
    public void setMode(CameramodeType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the fovy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFovy() {
        if (fovy == null) {
            return new BigDecimal("45");
        } else {
            return fovy;
        }
    }

    /**
     * Sets the value of the fovy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFovy(BigDecimal value) {
        this.fovy = value;
    }

    /**
     * Gets the value of the ipd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIpd() {
        if (ipd == null) {
            return new BigDecimal("0.068");
        } else {
            return ipd;
        }
    }

    /**
     * Sets the value of the ipd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIpd(BigDecimal value) {
        this.ipd = value;
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
        if (pos == null) {
            return "0 0 0";
        } else {
            return pos;
        }
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
