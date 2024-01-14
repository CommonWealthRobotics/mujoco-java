//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.sensor;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sensorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noise" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="cuttoff" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" />
 *       &lt;attribute name="site" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensorType")
public class SensorType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "noise")
    protected BigDecimal noise;
    @XmlAttribute(name = "cuttoff")
    protected BigDecimal cuttoff;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "site", required = true)
    protected String site;

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
     * Gets the value of the noise property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoise() {
        if (noise == null) {
            return new BigDecimal("0");
        } else {
            return noise;
        }
    }

    /**
     * Sets the value of the noise property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoise(BigDecimal value) {
        this.noise = value;
    }

    /**
     * Gets the value of the cuttoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuttoff() {
        if (cuttoff == null) {
            return new BigDecimal("0");
        } else {
            return cuttoff;
        }
    }

    /**
     * Sets the value of the cuttoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuttoff(BigDecimal value) {
        this.cuttoff = value;
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

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

}
