//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.body;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.CompositetypeType;


/**
 * <p>Java class for compositeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{attributeTypes}compositetypeType" />
 *       &lt;attribute name="count" use="required" type="{attributeTypes}upToThreeRealsType" />
 *       &lt;attribute name="spacing" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="offset" type="{attributeTypes}threeRealsType" default="0 0 0" />
 *       &lt;attribute name="flatinertia" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="solimpsmooth" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="solrefsmooth" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositeType")
@XmlSeeAlso({
    org.mujoco.xml.Mujoco.Worldbody.Composite.class,
    org.mujoco.xml.BodyarchType.Composite.class
})
public class CompositeType {

    @XmlAttribute(name = "prefix")
    protected String prefix;
    @XmlAttribute(name = "type", required = true)
    protected CompositetypeType type;
    @XmlAttribute(name = "count", required = true)
    protected String count;
    @XmlAttribute(name = "spacing", required = true)
    protected BigDecimal spacing;
    @XmlAttribute(name = "offset")
    protected String offset;
    @XmlAttribute(name = "flatinertia")
    protected BigDecimal flatinertia;
    @XmlAttribute(name = "solimpsmooth")
    protected String solimpsmooth;
    @XmlAttribute(name = "solrefsmooth")
    protected String solrefsmooth;

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CompositetypeType }
     *     
     */
    public CompositetypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositetypeType }
     *     
     */
    public void setType(CompositetypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpacing() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpacing(BigDecimal value) {
        this.spacing = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        if (offset == null) {
            return "0 0 0";
        } else {
            return offset;
        }
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the flatinertia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlatinertia() {
        if (flatinertia == null) {
            return new BigDecimal("0");
        } else {
            return flatinertia;
        }
    }

    /**
     * Sets the value of the flatinertia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlatinertia(BigDecimal value) {
        this.flatinertia = value;
    }

    /**
     * Gets the value of the solimpsmooth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimpsmooth() {
        if (solimpsmooth == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimpsmooth;
        }
    }

    /**
     * Sets the value of the solimpsmooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolimpsmooth(String value) {
        this.solimpsmooth = value;
    }

    /**
     * Gets the value of the solrefsmooth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolrefsmooth() {
        if (solrefsmooth == null) {
            return "0.02 1";
        } else {
            return solrefsmooth;
        }
    }

    /**
     * Sets the value of the solrefsmooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolrefsmooth(String value) {
        this.solrefsmooth = value;
    }

}
