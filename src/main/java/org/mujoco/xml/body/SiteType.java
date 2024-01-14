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
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.SitetypeType;


/**
 * <p>Java class for siteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{attributeTypes}sitetypeType" default="sphere" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="material" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rgba" type="{attributeTypes}fourRealsType" default="0.5 0.5 0.5 1" />
 *       &lt;attribute name="size" type="{attributeTypes}upToThreeRealsType" default="0.005 0.005 0.005" />
 *       &lt;attribute name="fromto" type="{attributeTypes}sixRealsType" />
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
@XmlType(name = "siteType")
public class SiteType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "type")
    protected SitetypeType type;
    @XmlAttribute(name = "group")
    protected Integer group;
    @XmlAttribute(name = "material")
    protected String material;
    @XmlAttribute(name = "rgba")
    protected String rgba;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "fromto")
    protected String fromto;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SitetypeType }
     *     
     */
    public SitetypeType getType() {
        if (type == null) {
            return SitetypeType.SPHERE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SitetypeType }
     *     
     */
    public void setType(SitetypeType value) {
        this.type = value;
    }

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
     * Gets the value of the fromto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromto() {
        return fromto;
    }

    /**
     * Sets the value of the fromto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromto(String value) {
        this.fromto = value;
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
