//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.MuJoCoDefault;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.BiastypeType;
import org.mujoco.xml.attributetypes.DyntypeType;
import org.mujoco.xml.attributetypes.GaintypeType;


/**
 * <p>Java class for generalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="ctrllimited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="forcelimited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ctrlrange" type="{attributeTypes}twoRealsType" default="0 0" />
 *       &lt;attribute name="forcerange" type="{attributeTypes}twoRealsType" default="0 0" />
 *       &lt;attribute name="lengthrange" type="{attributeTypes}twoRealsType" default="0 0" />
 *       &lt;attribute name="gear" type="{attributeTypes}upToSixRealsType" default="1 0 0 0 0 0" />
 *       &lt;attribute name="cranklength" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" />
 *       &lt;attribute name="dyntype" type="{attributeTypes}dyntypeType" default="none" />
 *       &lt;attribute name="gaintype" type="{attributeTypes}gaintypeType" default="fixed" />
 *       &lt;attribute name="biastype" type="{attributeTypes}biastypeType" default="none" />
 *       &lt;attribute name="dynprm" type="{attributeTypes}tenRealsType" default="1 0 0 0 0 0 0 0 0 0" />
 *       &lt;attribute name="gainprm" type="{attributeTypes}tenRealsType" default="1 0 0 0 0 0 0 0 0 0" />
 *       &lt;attribute name="biasprm" type="{attributeTypes}tenRealsType" default="0 0 0 0 0 0 0 0 0 0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalType")
public class GeneralType {

    @XmlAttribute(name = "group")
    protected Integer group;
    @XmlAttribute(name = "ctrllimited")
    protected Boolean ctrllimited;
    @XmlAttribute(name = "forcelimited")
    protected Boolean forcelimited;
    @XmlAttribute(name = "ctrlrange")
    protected String ctrlrange;
    @XmlAttribute(name = "forcerange")
    protected String forcerange;
    @XmlAttribute(name = "lengthrange")
    protected String lengthrange;
    @XmlAttribute(name = "gear")
    protected String gear;
    @XmlAttribute(name = "cranklength")
    protected BigDecimal cranklength;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "dyntype")
    protected DyntypeType dyntype;
    @XmlAttribute(name = "gaintype")
    protected GaintypeType gaintype;
    @XmlAttribute(name = "biastype")
    protected BiastypeType biastype;
    @XmlAttribute(name = "dynprm")
    protected String dynprm;
    @XmlAttribute(name = "gainprm")
    protected String gainprm;
    @XmlAttribute(name = "biasprm")
    protected String biasprm;

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
     * Gets the value of the ctrllimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCtrllimited() {
        if (ctrllimited == null) {
            return false;
        } else {
            return ctrllimited;
        }
    }

    /**
     * Sets the value of the ctrllimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtrllimited(Boolean value) {
        this.ctrllimited = value;
    }

    /**
     * Gets the value of the forcelimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForcelimited() {
        if (forcelimited == null) {
            return false;
        } else {
            return forcelimited;
        }
    }

    /**
     * Sets the value of the forcelimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcelimited(Boolean value) {
        this.forcelimited = value;
    }

    /**
     * Gets the value of the ctrlrange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrlrange() {
        if (ctrlrange == null) {
            return "0 0";
        } else {
            return ctrlrange;
        }
    }

    /**
     * Sets the value of the ctrlrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrlrange(String value) {
        this.ctrlrange = value;
    }

    /**
     * Gets the value of the forcerange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcerange() {
        if (forcerange == null) {
            return "0 0";
        } else {
            return forcerange;
        }
    }

    /**
     * Sets the value of the forcerange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcerange(String value) {
        this.forcerange = value;
    }

    /**
     * Gets the value of the lengthrange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthrange() {
        if (lengthrange == null) {
            return "0 0";
        } else {
            return lengthrange;
        }
    }

    /**
     * Sets the value of the lengthrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthrange(String value) {
        this.lengthrange = value;
    }

    /**
     * Gets the value of the gear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGear() {
        if (gear == null) {
            return "1 0 0 0 0 0";
        } else {
            return gear;
        }
    }

    /**
     * Sets the value of the gear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGear(String value) {
        this.gear = value;
    }

    /**
     * Gets the value of the cranklength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCranklength() {
        if (cranklength == null) {
            return new BigDecimal("0");
        } else {
            return cranklength;
        }
    }

    /**
     * Sets the value of the cranklength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCranklength(BigDecimal value) {
        this.cranklength = value;
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
     * Gets the value of the dyntype property.
     * 
     * @return
     *     possible object is
     *     {@link DyntypeType }
     *     
     */
    public DyntypeType getDyntype() {
        if (dyntype == null) {
            return DyntypeType.NONE;
        } else {
            return dyntype;
        }
    }

    /**
     * Sets the value of the dyntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DyntypeType }
     *     
     */
    public void setDyntype(DyntypeType value) {
        this.dyntype = value;
    }

    /**
     * Gets the value of the gaintype property.
     * 
     * @return
     *     possible object is
     *     {@link GaintypeType }
     *     
     */
    public GaintypeType getGaintype() {
        if (gaintype == null) {
            return GaintypeType.FIXED;
        } else {
            return gaintype;
        }
    }

    /**
     * Sets the value of the gaintype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaintypeType }
     *     
     */
    public void setGaintype(GaintypeType value) {
        this.gaintype = value;
    }

    /**
     * Gets the value of the biastype property.
     * 
     * @return
     *     possible object is
     *     {@link BiastypeType }
     *     
     */
    public BiastypeType getBiastype() {
        if (biastype == null) {
            return BiastypeType.NONE;
        } else {
            return biastype;
        }
    }

    /**
     * Sets the value of the biastype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiastypeType }
     *     
     */
    public void setBiastype(BiastypeType value) {
        this.biastype = value;
    }

    /**
     * Gets the value of the dynprm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynprm() {
        if (dynprm == null) {
            return "1 0 0 0 0 0 0 0 0 0";
        } else {
            return dynprm;
        }
    }

    /**
     * Sets the value of the dynprm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynprm(String value) {
        this.dynprm = value;
    }

    /**
     * Gets the value of the gainprm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGainprm() {
        if (gainprm == null) {
            return "1 0 0 0 0 0 0 0 0 0";
        } else {
            return gainprm;
        }
    }

    /**
     * Sets the value of the gainprm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGainprm(String value) {
        this.gainprm = value;
    }

    /**
     * Gets the value of the biasprm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiasprm() {
        if (biasprm == null) {
            return "0 0 0 0 0 0 0 0 0 0";
        } else {
            return biasprm;
        }
    }

    /**
     * Sets the value of the biasprm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasprm(String value) {
        this.biasprm = value;
    }

}
