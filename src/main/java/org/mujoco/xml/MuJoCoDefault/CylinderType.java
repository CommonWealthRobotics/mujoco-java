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
 * <p>Java class for cylinderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cylinderType">
 *   &lt;complexContent>
 *     &lt;extension base="{default}motorType">
 *       &lt;attribute name="timeconst" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" />
 *       &lt;attribute name="area" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" />
 *       &lt;attribute name="diameter" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bias" type="{attributeTypes}threeRealsType" default="0 0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cylinderType")
public class CylinderType
    extends MotorType
{

    @XmlAttribute(name = "timeconst")
    protected BigDecimal timeconst;
    @XmlAttribute(name = "area")
    protected BigDecimal area;
    @XmlAttribute(name = "diameter")
    protected BigDecimal diameter;
    @XmlAttribute(name = "bias")
    protected String bias;

    /**
     * Gets the value of the timeconst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeconst() {
        if (timeconst == null) {
            return new BigDecimal("1");
        } else {
            return timeconst;
        }
    }

    /**
     * Sets the value of the timeconst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeconst(BigDecimal value) {
        this.timeconst = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArea() {
        if (area == null) {
            return new BigDecimal("1");
        } else {
            return area;
        }
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiameter(BigDecimal value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the bias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBias() {
        if (bias == null) {
            return "0 0 0";
        } else {
            return bias;
        }
    }

    /**
     * Sets the value of the bias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBias(String value) {
        this.bias = value;
    }

}
