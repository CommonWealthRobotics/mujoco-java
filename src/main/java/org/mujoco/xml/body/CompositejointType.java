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
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.JointkindType;


/**
 * <p>Java class for compositejointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositejointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="kind" use="required" type="{attributeTypes}jointkindType" />
 *       &lt;attribute name="solimpfix" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="solreffix" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="stiffness" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="damping" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="armature" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="limited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="range" type="{attributeTypes}twoRealsType" default="0 0" />
 *       &lt;attribute name="margin" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="solreflimit" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="solimplimit" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="frictionloss" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="solreffriction" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="solimpfriction" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositejointType")
public class CompositejointType {

    @XmlAttribute(name = "kind", required = true)
    protected JointkindType kind;
    @XmlAttribute(name = "solimpfix")
    protected String solimpfix;
    @XmlAttribute(name = "solreffix")
    protected String solreffix;
    @XmlAttribute(name = "group")
    protected Integer group;
    @XmlAttribute(name = "stiffness")
    protected BigDecimal stiffness;
    @XmlAttribute(name = "damping")
    protected BigDecimal damping;
    @XmlAttribute(name = "armature")
    protected BigDecimal armature;
    @XmlAttribute(name = "limited")
    protected Boolean limited;
    @XmlAttribute(name = "range")
    protected String range;
    @XmlAttribute(name = "margin")
    protected BigDecimal margin;
    @XmlAttribute(name = "solreflimit")
    protected String solreflimit;
    @XmlAttribute(name = "solimplimit")
    protected String solimplimit;
    @XmlAttribute(name = "frictionloss")
    protected BigDecimal frictionloss;
    @XmlAttribute(name = "solreffriction")
    protected String solreffriction;
    @XmlAttribute(name = "solimpfriction")
    protected String solimpfriction;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link JointkindType }
     *     
     */
    public JointkindType getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JointkindType }
     *     
     */
    public void setKind(JointkindType value) {
        this.kind = value;
    }

    /**
     * Gets the value of the solimpfix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimpfix() {
        if (solimpfix == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimpfix;
        }
    }

    /**
     * Sets the value of the solimpfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolimpfix(String value) {
        this.solimpfix = value;
    }

    /**
     * Gets the value of the solreffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolreffix() {
        if (solreffix == null) {
            return "0.02 1";
        } else {
            return solreffix;
        }
    }

    /**
     * Sets the value of the solreffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolreffix(String value) {
        this.solreffix = value;
    }

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
     * Gets the value of the stiffness property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStiffness() {
        if (stiffness == null) {
            return new BigDecimal("0");
        } else {
            return stiffness;
        }
    }

    /**
     * Sets the value of the stiffness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStiffness(BigDecimal value) {
        this.stiffness = value;
    }

    /**
     * Gets the value of the damping property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDamping() {
        if (damping == null) {
            return new BigDecimal("0");
        } else {
            return damping;
        }
    }

    /**
     * Sets the value of the damping property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDamping(BigDecimal value) {
        this.damping = value;
    }

    /**
     * Gets the value of the armature property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArmature() {
        if (armature == null) {
            return new BigDecimal("0");
        } else {
            return armature;
        }
    }

    /**
     * Sets the value of the armature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArmature(BigDecimal value) {
        this.armature = value;
    }

    /**
     * Gets the value of the limited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLimited() {
        if (limited == null) {
            return false;
        } else {
            return limited;
        }
    }

    /**
     * Sets the value of the limited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimited(Boolean value) {
        this.limited = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        if (range == null) {
            return "0 0";
        } else {
            return range;
        }
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
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
     * Gets the value of the solreflimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolreflimit() {
        if (solreflimit == null) {
            return "0.02 1";
        } else {
            return solreflimit;
        }
    }

    /**
     * Sets the value of the solreflimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolreflimit(String value) {
        this.solreflimit = value;
    }

    /**
     * Gets the value of the solimplimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimplimit() {
        if (solimplimit == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimplimit;
        }
    }

    /**
     * Sets the value of the solimplimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolimplimit(String value) {
        this.solimplimit = value;
    }

    /**
     * Gets the value of the frictionloss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrictionloss() {
        if (frictionloss == null) {
            return new BigDecimal("0");
        } else {
            return frictionloss;
        }
    }

    /**
     * Sets the value of the frictionloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrictionloss(BigDecimal value) {
        this.frictionloss = value;
    }

    /**
     * Gets the value of the solreffriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolreffriction() {
        if (solreffriction == null) {
            return "0.02 1";
        } else {
            return solreffriction;
        }
    }

    /**
     * Sets the value of the solreffriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolreffriction(String value) {
        this.solreffriction = value;
    }

    /**
     * Gets the value of the solimpfriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimpfriction() {
        if (solimpfriction == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimpfriction;
        }
    }

    /**
     * Sets the value of the solimpfriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolimpfriction(String value) {
        this.solimpfriction = value;
    }

}