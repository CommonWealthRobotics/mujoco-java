//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.visual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="shadowsize" type="{http://www.w3.org/2001/XMLSchema}int" default="1024" />
 *       &lt;attribute name="offsamples" type="{http://www.w3.org/2001/XMLSchema}int" default="4" />
 *       &lt;attribute name="numslices" type="{http://www.w3.org/2001/XMLSchema}int" default="28" />
 *       &lt;attribute name="numstacks" type="{http://www.w3.org/2001/XMLSchema}int" default="16" />
 *       &lt;attribute name="numquads" type="{http://www.w3.org/2001/XMLSchema}int" default="4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualityType")
public class QualityType {

    @XmlAttribute(name = "shadowsize")
    protected Integer shadowsize;
    @XmlAttribute(name = "offsamples")
    protected Integer offsamples;
    @XmlAttribute(name = "numslices")
    protected Integer numslices;
    @XmlAttribute(name = "numstacks")
    protected Integer numstacks;
    @XmlAttribute(name = "numquads")
    protected Integer numquads;

    /**
     * Gets the value of the shadowsize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getShadowsize() {
        if (shadowsize == null) {
            return  1024;
        } else {
            return shadowsize;
        }
    }

    /**
     * Sets the value of the shadowsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShadowsize(Integer value) {
        this.shadowsize = value;
    }

    /**
     * Gets the value of the offsamples property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOffsamples() {
        if (offsamples == null) {
            return  4;
        } else {
            return offsamples;
        }
    }

    /**
     * Sets the value of the offsamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsamples(Integer value) {
        this.offsamples = value;
    }

    /**
     * Gets the value of the numslices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumslices() {
        if (numslices == null) {
            return  28;
        } else {
            return numslices;
        }
    }

    /**
     * Sets the value of the numslices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumslices(Integer value) {
        this.numslices = value;
    }

    /**
     * Gets the value of the numstacks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumstacks() {
        if (numstacks == null) {
            return  16;
        } else {
            return numstacks;
        }
    }

    /**
     * Sets the value of the numstacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumstacks(Integer value) {
        this.numstacks = value;
    }

    /**
     * Gets the value of the numquads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumquads() {
        if (numquads == null) {
            return  4;
        } else {
            return numquads;
        }
    }

    /**
     * Sets the value of the numquads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumquads(Integer value) {
        this.numquads = value;
    }

}
