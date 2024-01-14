//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.option;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.FlagSimpleType;


/**
 * <p>Java class for flagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="constraint" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="equality" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="frictionloss" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="limit" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="contact" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="passive" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="gravity" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="clampctrl" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="warmstart" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="filterparent" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="actuation" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="refsafe" type="{attributeTypes}flagSimpleType" default="enable" />
 *       &lt;attribute name="override" type="{attributeTypes}flagSimpleType" default="disable" />
 *       &lt;attribute name="energy" type="{attributeTypes}flagSimpleType" default="disable" />
 *       &lt;attribute name="fwdinv" type="{attributeTypes}flagSimpleType" default="disable" />
 *       &lt;attribute name="sensornoise" type="{attributeTypes}flagSimpleType" default="disable" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flagType")
public class FlagType {

    @XmlAttribute(name = "constraint")
    protected FlagSimpleType constraint;
    @XmlAttribute(name = "equality")
    protected FlagSimpleType equality;
    @XmlAttribute(name = "frictionloss")
    protected FlagSimpleType frictionloss;
    @XmlAttribute(name = "limit")
    protected FlagSimpleType limit;
    @XmlAttribute(name = "contact")
    protected FlagSimpleType contact;
    @XmlAttribute(name = "passive")
    protected FlagSimpleType passive;
    @XmlAttribute(name = "gravity")
    protected FlagSimpleType gravity;
    @XmlAttribute(name = "clampctrl")
    protected FlagSimpleType clampctrl;
    @XmlAttribute(name = "warmstart")
    protected FlagSimpleType warmstart;
    @XmlAttribute(name = "filterparent")
    protected FlagSimpleType filterparent;
    @XmlAttribute(name = "actuation")
    protected FlagSimpleType actuation;
    @XmlAttribute(name = "refsafe")
    protected FlagSimpleType refsafe;
    @XmlAttribute(name = "override")
    protected FlagSimpleType override;
    @XmlAttribute(name = "energy")
    protected FlagSimpleType energy;
    @XmlAttribute(name = "fwdinv")
    protected FlagSimpleType fwdinv;
    @XmlAttribute(name = "sensornoise")
    protected FlagSimpleType sensornoise;

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getConstraint() {
        if (constraint == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return constraint;
        }
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setConstraint(FlagSimpleType value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the equality property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getEquality() {
        if (equality == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return equality;
        }
    }

    /**
     * Sets the value of the equality property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setEquality(FlagSimpleType value) {
        this.equality = value;
    }

    /**
     * Gets the value of the frictionloss property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getFrictionloss() {
        if (frictionloss == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return frictionloss;
        }
    }

    /**
     * Sets the value of the frictionloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setFrictionloss(FlagSimpleType value) {
        this.frictionloss = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getLimit() {
        if (limit == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return limit;
        }
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setLimit(FlagSimpleType value) {
        this.limit = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getContact() {
        if (contact == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return contact;
        }
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setContact(FlagSimpleType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getPassive() {
        if (passive == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return passive;
        }
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setPassive(FlagSimpleType value) {
        this.passive = value;
    }

    /**
     * Gets the value of the gravity property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getGravity() {
        if (gravity == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return gravity;
        }
    }

    /**
     * Sets the value of the gravity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setGravity(FlagSimpleType value) {
        this.gravity = value;
    }

    /**
     * Gets the value of the clampctrl property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getClampctrl() {
        if (clampctrl == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return clampctrl;
        }
    }

    /**
     * Sets the value of the clampctrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setClampctrl(FlagSimpleType value) {
        this.clampctrl = value;
    }

    /**
     * Gets the value of the warmstart property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getWarmstart() {
        if (warmstart == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return warmstart;
        }
    }

    /**
     * Sets the value of the warmstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setWarmstart(FlagSimpleType value) {
        this.warmstart = value;
    }

    /**
     * Gets the value of the filterparent property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getFilterparent() {
        if (filterparent == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return filterparent;
        }
    }

    /**
     * Sets the value of the filterparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setFilterparent(FlagSimpleType value) {
        this.filterparent = value;
    }

    /**
     * Gets the value of the actuation property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getActuation() {
        if (actuation == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return actuation;
        }
    }

    /**
     * Sets the value of the actuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setActuation(FlagSimpleType value) {
        this.actuation = value;
    }

    /**
     * Gets the value of the refsafe property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getRefsafe() {
        if (refsafe == null) {
            return FlagSimpleType.ENABLE;
        } else {
            return refsafe;
        }
    }

    /**
     * Sets the value of the refsafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setRefsafe(FlagSimpleType value) {
        this.refsafe = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getOverride() {
        if (override == null) {
            return FlagSimpleType.DISABLE;
        } else {
            return override;
        }
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setOverride(FlagSimpleType value) {
        this.override = value;
    }

    /**
     * Gets the value of the energy property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getEnergy() {
        if (energy == null) {
            return FlagSimpleType.DISABLE;
        } else {
            return energy;
        }
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setEnergy(FlagSimpleType value) {
        this.energy = value;
    }

    /**
     * Gets the value of the fwdinv property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getFwdinv() {
        if (fwdinv == null) {
            return FlagSimpleType.DISABLE;
        } else {
            return fwdinv;
        }
    }

    /**
     * Sets the value of the fwdinv property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setFwdinv(FlagSimpleType value) {
        this.fwdinv = value;
    }

    /**
     * Gets the value of the sensornoise property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSimpleType }
     *     
     */
    public FlagSimpleType getSensornoise() {
        if (sensornoise == null) {
            return FlagSimpleType.DISABLE;
        } else {
            return sensornoise;
        }
    }

    /**
     * Sets the value of the sensornoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSimpleType }
     *     
     */
    public void setSensornoise(FlagSimpleType value) {
        this.sensornoise = value;
    }

}
