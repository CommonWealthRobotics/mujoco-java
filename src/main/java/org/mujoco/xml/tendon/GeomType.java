//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 04:25:33 PM EST 
//


package org.mujoco.xml.tendon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="geom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sidesite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geomType")
public class GeomType {

    @XmlAttribute(name = "geom", required = true)
    protected String geom;
    @XmlAttribute(name = "sidesite")
    protected String sidesite;

    /**
     * Gets the value of the geom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeom() {
        return geom;
    }

    /**
     * Sets the value of the geom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeom(String value) {
        this.geom = value;
    }

    /**
     * Gets the value of the sidesite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidesite() {
        return sidesite;
    }

    /**
     * Sets the value of the sidesite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidesite(String value) {
        this.sidesite = value;
    }

}
