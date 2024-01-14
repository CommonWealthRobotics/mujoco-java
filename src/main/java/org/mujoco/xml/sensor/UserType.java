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
import org.mujoco.xml.attributetypes.DatatypeType;
import org.mujoco.xml.attributetypes.NeedstageType;


/**
 * <p>Java class for userType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noise" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="cuttoff" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" />
 *       &lt;attribute name="objtype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="datatype" use="required" type="{attributeTypes}datatypeType" />
 *       &lt;attribute name="neddstage" use="required" type="{attributeTypes}needstageType" />
 *       &lt;attribute name="dim" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userType")
public class UserType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "noise")
    protected BigDecimal noise;
    @XmlAttribute(name = "cuttoff")
    protected BigDecimal cuttoff;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "objtype", required = true)
    protected String objtype;
    @XmlAttribute(name = "objname", required = true)
    protected String objname;
    @XmlAttribute(name = "datatype", required = true)
    protected DatatypeType datatype;
    @XmlAttribute(name = "neddstage", required = true)
    protected NeedstageType neddstage;
    @XmlAttribute(name = "dim", required = true)
    protected int dim;

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
     * Gets the value of the objtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjtype() {
        return objtype;
    }

    /**
     * Sets the value of the objtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjtype(String value) {
        this.objtype = value;
    }

    /**
     * Gets the value of the objname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjname() {
        return objname;
    }

    /**
     * Sets the value of the objname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjname(String value) {
        this.objname = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link DatatypeType }
     *     
     */
    public DatatypeType getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatatypeType }
     *     
     */
    public void setDatatype(DatatypeType value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the neddstage property.
     * 
     * @return
     *     possible object is
     *     {@link NeedstageType }
     *     
     */
    public NeedstageType getNeddstage() {
        return neddstage;
    }

    /**
     * Sets the value of the neddstage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeedstageType }
     *     
     */
    public void setNeddstage(NeedstageType value) {
        this.neddstage = value;
    }

    /**
     * Gets the value of the dim property.
     * 
     */
    public int getDim() {
        return dim;
    }

    /**
     * Sets the value of the dim property.
     * 
     */
    public void setDim(int value) {
        this.dim = value;
    }

}