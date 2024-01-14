//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.compiler;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.ModeType;


/**
 * <p>Java class for lengthrangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lengthrangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mode" type="{attributeTypes}modeType" default="muscle" />
 *       &lt;attribute name="useexisting" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="uselimit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="accel" type="{http://www.w3.org/2001/XMLSchema}decimal" default="20" />
 *       &lt;attribute name="maxforce" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="timeconst" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" />
 *       &lt;attribute name="timestep" type="{http://www.w3.org/2001/XMLSchema}decimal" default=".01" />
 *       &lt;attribute name="inttotal" type="{http://www.w3.org/2001/XMLSchema}decimal" default="10" />
 *       &lt;attribute name="inteval" type="{http://www.w3.org/2001/XMLSchema}decimal" default="2" />
 *       &lt;attribute name="tolrange" type="{http://www.w3.org/2001/XMLSchema}decimal" default=".05" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lengthrangeType")
public class LengthrangeType {

    @XmlAttribute(name = "mode")
    protected ModeType mode;
    @XmlAttribute(name = "useexisting")
    protected Boolean useexisting;
    @XmlAttribute(name = "uselimit")
    protected Boolean uselimit;
    @XmlAttribute(name = "accel")
    protected BigDecimal accel;
    @XmlAttribute(name = "maxforce")
    protected BigDecimal maxforce;
    @XmlAttribute(name = "timeconst")
    protected BigDecimal timeconst;
    @XmlAttribute(name = "timestep")
    protected BigDecimal timestep;
    @XmlAttribute(name = "inttotal")
    protected BigDecimal inttotal;
    @XmlAttribute(name = "inteval")
    protected BigDecimal inteval;
    @XmlAttribute(name = "tolrange")
    protected BigDecimal tolrange;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ModeType }
     *     
     */
    public ModeType getMode() {
        if (mode == null) {
            return ModeType.MUSCLE;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeType }
     *     
     */
    public void setMode(ModeType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the useexisting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseexisting() {
        if (useexisting == null) {
            return true;
        } else {
            return useexisting;
        }
    }

    /**
     * Sets the value of the useexisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseexisting(Boolean value) {
        this.useexisting = value;
    }

    /**
     * Gets the value of the uselimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUselimit() {
        if (uselimit == null) {
            return false;
        } else {
            return uselimit;
        }
    }

    /**
     * Sets the value of the uselimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUselimit(Boolean value) {
        this.uselimit = value;
    }

    /**
     * Gets the value of the accel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccel() {
        if (accel == null) {
            return new BigDecimal("20");
        } else {
            return accel;
        }
    }

    /**
     * Sets the value of the accel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccel(BigDecimal value) {
        this.accel = value;
    }

    /**
     * Gets the value of the maxforce property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxforce() {
        if (maxforce == null) {
            return new BigDecimal("0");
        } else {
            return maxforce;
        }
    }

    /**
     * Sets the value of the maxforce property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxforce(BigDecimal value) {
        this.maxforce = value;
    }

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
     * Gets the value of the timestep property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimestep() {
        if (timestep == null) {
            return new BigDecimal(".01");
        } else {
            return timestep;
        }
    }

    /**
     * Sets the value of the timestep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimestep(BigDecimal value) {
        this.timestep = value;
    }

    /**
     * Gets the value of the inttotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInttotal() {
        if (inttotal == null) {
            return new BigDecimal("10");
        } else {
            return inttotal;
        }
    }

    /**
     * Sets the value of the inttotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInttotal(BigDecimal value) {
        this.inttotal = value;
    }

    /**
     * Gets the value of the inteval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteval() {
        if (inteval == null) {
            return new BigDecimal("2");
        } else {
            return inteval;
        }
    }

    /**
     * Sets the value of the inteval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteval(BigDecimal value) {
        this.inteval = value;
    }

    /**
     * Gets the value of the tolrange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolrange() {
        if (tolrange == null) {
            return new BigDecimal(".05");
        } else {
            return tolrange;
        }
    }

    /**
     * Sets the value of the tolrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolrange(BigDecimal value) {
        this.tolrange = value;
    }

}
