//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.MuJoCoDefault;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="condim" type="{http://www.w3.org/2001/XMLSchema}int" default="3" />
 *       &lt;attribute name="friction" type="{attributeTypes}fiveRealsType" default="1 1 0.005 0.0001 0.0001" />
 *       &lt;attribute name="solimp" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="solref" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="margin" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="gap" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pairType")
public class PairType {

    @XmlAttribute(name = "condim")
    protected Integer condim;
    @XmlAttribute(name = "friction")
    protected String friction;
    @XmlAttribute(name = "solimp")
    protected String solimp;
    @XmlAttribute(name = "solref")
    protected String solref;
    @XmlAttribute(name = "margin")
    protected BigDecimal margin;
    @XmlAttribute(name = "gap")
    protected BigDecimal gap;

    /**
     * Gets the value of the condim property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCondim() {
        if (condim == null) {
            return  3;
        } else {
            return condim;
        }
    }

    /**
     * Sets the value of the condim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCondim(Integer value) {
        this.condim = value;
    }

    /**
     * Gets the value of the friction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriction() {
        if (friction == null) {
            return "1 1 0.005 0.0001 0.0001";
        } else {
            return friction;
        }
    }

    /**
     * Sets the value of the friction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriction(String value) {
        this.friction = value;
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
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        if (margin == null) {
            return new BigDecimal("0");
        } else {
            return margin;
        }
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargin(BigDecimal value) {
        this.margin = value;
    }

    /**
     * Gets the value of the gap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGap() {
        if (gap == null) {
            return new BigDecimal("0");
        } else {
            return gap;
        }
    }

    /**
     * Sets the value of the gap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGap(BigDecimal value) {
        this.gap = value;
    }

}