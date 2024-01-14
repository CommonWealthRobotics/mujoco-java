//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.tendon;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coef" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jointType")
public class JointType {

    @XmlAttribute(name = "joint", required = true)
    protected String joint;
    @XmlAttribute(name = "coef", required = true)
    protected BigDecimal coef;

    /**
     * Gets the value of the joint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoint() {
        return joint;
    }

    /**
     * Sets the value of the joint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoint(String value) {
        this.joint = value;
    }

    /**
     * Gets the value of the coef property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoef() {
        return coef;
    }

    /**
     * Sets the value of the coef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoef(BigDecimal value) {
        this.coef = value;
    }

}
