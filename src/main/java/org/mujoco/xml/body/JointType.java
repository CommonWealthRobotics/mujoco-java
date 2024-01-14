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
import org.mujoco.xml.attributetypes.JointtypeType;


/**
 * <p>Java class for jointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{attributeTypes}jointtypeType" default="hinge" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="pos" type="{attributeTypes}threeRealsType" default="0 0 0" />
 *       &lt;attribute name="axis" type="{attributeTypes}threeRealsType" default="0 0 1" />
 *       &lt;attribute name="springdamper" type="{attributeTypes}twoRealsType" default="0 0" />
 *       &lt;attribute name="limited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="solimplimit" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="solreflimit" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="solimpfriction" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" />
 *       &lt;attribute name="solreffriction" type="{attributeTypes}twoRealsType" default="0.02 1" />
 *       &lt;attribute name="stiffness" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="range" type="{attributeTypes}twoRealsType" default="0 0" />
 *       &lt;attribute name="margin" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="springref" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="armature" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="damping" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="frictionloss" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" />
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

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "type")
    protected JointtypeType type;
    @XmlAttribute(name = "group")
    protected Integer group;
    @XmlAttribute(name = "pos")
    protected String pos;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "springdamper")
    protected String springdamper;
    @XmlAttribute(name = "limited")
    protected Boolean limited;
    @XmlAttribute(name = "solimplimit")
    protected String solimplimit;
    @XmlAttribute(name = "solreflimit")
    protected String solreflimit;
    @XmlAttribute(name = "solimpfriction")
    protected String solimpfriction;
    @XmlAttribute(name = "solreffriction")
    protected String solreffriction;
    @XmlAttribute(name = "stiffness")
    protected BigDecimal stiffness;
    @XmlAttribute(name = "range")
    protected String range;
    @XmlAttribute(name = "margin")
    protected BigDecimal margin;
    @XmlAttribute(name = "ref")
    protected BigDecimal ref;
    @XmlAttribute(name = "springref")
    protected BigDecimal springref;
    @XmlAttribute(name = "armature")
    protected BigDecimal armature;
    @XmlAttribute(name = "damping")
    protected BigDecimal damping;
    @XmlAttribute(name = "frictionloss")
    protected BigDecimal frictionloss;
    @XmlAttribute(name = "user")
    protected String user;

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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JointtypeType }
     *     
     */
    public JointtypeType getType() {
        if (type == null) {
            return JointtypeType.HINGE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JointtypeType }
     *     
     */
    public void setType(JointtypeType value) {
        this.type = value;
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
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPos() {
        if (pos == null) {
            return "0 0 0";
        } else {
            return pos;
        }
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPos(String value) {
        this.pos = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        if (axis == null) {
            return "0 0 1";
        } else {
            return axis;
        }
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the springdamper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpringdamper() {
        if (springdamper == null) {
            return "0 0";
        } else {
            return springdamper;
        }
    }

    /**
     * Sets the value of the springdamper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpringdamper(String value) {
        this.springdamper = value;
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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRef() {
        if (ref == null) {
            return new BigDecimal("0");
        } else {
            return ref;
        }
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRef(BigDecimal value) {
        this.ref = value;
    }

    /**
     * Gets the value of the springref property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpringref() {
        if (springref == null) {
            return new BigDecimal("0");
        } else {
            return springref;
        }
    }

    /**
     * Sets the value of the springref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpringref(BigDecimal value) {
        this.springref = value;
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

}
