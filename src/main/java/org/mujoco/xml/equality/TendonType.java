//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.equality;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tendonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tendonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="solimp" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="solref" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="tendon1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tendon2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="polycoef" type="{attributeTypes}fiveRealsType" default="0 1 0 0 0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tendonType")
public class TendonType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "solimp")
    protected String solimp;
    @XmlAttribute(name = "solref")
    protected String solref;
    @XmlAttribute(name = "tendon1", required = true)
    protected String tendon1;
    @XmlAttribute(name = "tendon2")
    protected String tendon2;
    @XmlAttribute(name = "polycoef")
    protected String polycoef;

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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActive() {
        if (active == null) {
            return true;
        } else {
            return active;
        }
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the solimp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimp() {
        if (solimp == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimp;
        }
    }

    /**
     * Sets the value of the solimp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolimp(String value) {
        this.solimp = value;
    }

    /**
     * Gets the value of the solref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolref() {
        if (solref == null) {
            return "0.02 1";
        } else {
            return solref;
        }
    }

    /**
     * Sets the value of the solref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolref(String value) {
        this.solref = value;
    }

    /**
     * Gets the value of the tendon1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTendon1() {
        return tendon1;
    }

    /**
     * Sets the value of the tendon1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTendon1(String value) {
        this.tendon1 = value;
    }

    /**
     * Gets the value of the tendon2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTendon2() {
        return tendon2;
    }

    /**
     * Sets the value of the tendon2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTendon2(String value) {
        this.tendon2 = value;
    }

    /**
     * Gets the value of the polycoef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolycoef() {
        if (polycoef == null) {
            return "0 1 0 0 0";
        } else {
            return polycoef;
        }
    }

    /**
     * Sets the value of the polycoef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolycoef(String value) {
        this.polycoef = value;
    }

}
