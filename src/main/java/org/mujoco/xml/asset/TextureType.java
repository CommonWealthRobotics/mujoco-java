//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml.asset;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.attributetypes.BuiltinType;
import org.mujoco.xml.attributetypes.MarkType;


/**
 * <p>Java class for textureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{attributeTypes}texturetypeType" default="cube" />
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gridsize" type="{attributeTypes}twoIntsType" default="1 1" />
 *       &lt;attribute name="gridlayout" type="{http://www.w3.org/2001/XMLSchema}string" default="............" />
 *       &lt;attribute name="fileright" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileleft" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filedown" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filefront" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileback" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="builtin" type="{attributeTypes}builtinType" default="none" />
 *       &lt;attribute name="rgb1" type="{attributeTypes}threeRealsType" default="0.8 0.8 0.8" />
 *       &lt;attribute name="rgb2" type="{attributeTypes}threeRealsType" default="0.5 0.5 0.5" />
 *       &lt;attribute name="mark" type="{attributeTypes}markType" default="none" />
 *       &lt;attribute name="markrgb" type="{attributeTypes}threeRealsType" default="0 0 0" />
 *       &lt;attribute name="random" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.01" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="hflip" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="vflip" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textureType")
public class TextureType {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "file")
    protected String file;
    @XmlAttribute(name = "gridsize")
    protected String gridsize;
    @XmlAttribute(name = "gridlayout")
    protected String gridlayout;
    @XmlAttribute(name = "fileright")
    protected String fileright;
    @XmlAttribute(name = "fileleft")
    protected String fileleft;
    @XmlAttribute(name = "fileup")
    protected String fileup;
    @XmlAttribute(name = "filedown")
    protected String filedown;
    @XmlAttribute(name = "filefront")
    protected String filefront;
    @XmlAttribute(name = "fileback")
    protected String fileback;
    @XmlAttribute(name = "builtin")
    protected BuiltinType builtin;
    @XmlAttribute(name = "rgb1")
    protected String rgb1;
    @XmlAttribute(name = "rgb2")
    protected String rgb2;
    @XmlAttribute(name = "mark")
    protected MarkType mark;
    @XmlAttribute(name = "markrgb")
    protected String markrgb;
    @XmlAttribute(name = "random")
    protected BigDecimal random;
    @XmlAttribute(name = "width")
    protected Integer width;
    @XmlAttribute(name = "height")
    protected Integer height;
    @XmlAttribute(name = "hflip")
    protected Boolean hflip;
    @XmlAttribute(name = "vflip")
    protected Boolean vflip;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "cube";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the gridsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridsize() {
        if (gridsize == null) {
            return "1 1";
        } else {
            return gridsize;
        }
    }

    /**
     * Sets the value of the gridsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridsize(String value) {
        this.gridsize = value;
    }

    /**
     * Gets the value of the gridlayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridlayout() {
        if (gridlayout == null) {
            return "............";
        } else {
            return gridlayout;
        }
    }

    /**
     * Sets the value of the gridlayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridlayout(String value) {
        this.gridlayout = value;
    }

    /**
     * Gets the value of the fileright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileright() {
        return fileright;
    }

    /**
     * Sets the value of the fileright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileright(String value) {
        this.fileright = value;
    }

    /**
     * Gets the value of the fileleft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileleft() {
        return fileleft;
    }

    /**
     * Sets the value of the fileleft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileleft(String value) {
        this.fileleft = value;
    }

    /**
     * Gets the value of the fileup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileup() {
        return fileup;
    }

    /**
     * Sets the value of the fileup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileup(String value) {
        this.fileup = value;
    }

    /**
     * Gets the value of the filedown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledown() {
        return filedown;
    }

    /**
     * Sets the value of the filedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledown(String value) {
        this.filedown = value;
    }

    /**
     * Gets the value of the filefront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilefront() {
        return filefront;
    }

    /**
     * Sets the value of the filefront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilefront(String value) {
        this.filefront = value;
    }

    /**
     * Gets the value of the fileback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileback() {
        return fileback;
    }

    /**
     * Sets the value of the fileback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileback(String value) {
        this.fileback = value;
    }

    /**
     * Gets the value of the builtin property.
     * 
     * @return
     *     possible object is
     *     {@link BuiltinType }
     *     
     */
    public BuiltinType getBuiltin() {
        if (builtin == null) {
            return BuiltinType.NONE;
        } else {
            return builtin;
        }
    }

    /**
     * Sets the value of the builtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuiltinType }
     *     
     */
    public void setBuiltin(BuiltinType value) {
        this.builtin = value;
    }

    /**
     * Gets the value of the rgb1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgb1() {
        if (rgb1 == null) {
            return "0.8 0.8 0.8";
        } else {
            return rgb1;
        }
    }

    /**
     * Sets the value of the rgb1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgb1(String value) {
        this.rgb1 = value;
    }

    /**
     * Gets the value of the rgb2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgb2() {
        if (rgb2 == null) {
            return "0.5 0.5 0.5";
        } else {
            return rgb2;
        }
    }

    /**
     * Sets the value of the rgb2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgb2(String value) {
        this.rgb2 = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link MarkType }
     *     
     */
    public MarkType getMark() {
        if (mark == null) {
            return MarkType.NONE;
        } else {
            return mark;
        }
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkType }
     *     
     */
    public void setMark(MarkType value) {
        this.mark = value;
    }

    /**
     * Gets the value of the markrgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkrgb() {
        if (markrgb == null) {
            return "0 0 0";
        } else {
            return markrgb;
        }
    }

    /**
     * Sets the value of the markrgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkrgb(String value) {
        this.markrgb = value;
    }

    /**
     * Gets the value of the random property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRandom() {
        if (random == null) {
            return new BigDecimal("0.01");
        } else {
            return random;
        }
    }

    /**
     * Sets the value of the random property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRandom(BigDecimal value) {
        this.random = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getWidth() {
        if (width == null) {
            return  0;
        } else {
            return width;
        }
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHeight() {
        if (height == null) {
            return  0;
        } else {
            return height;
        }
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the hflip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHflip() {
        if (hflip == null) {
            return false;
        } else {
            return hflip;
        }
    }

    /**
     * Sets the value of the hflip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHflip(Boolean value) {
        this.hflip = value;
    }

    /**
     * Gets the value of the vflip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVflip() {
        if (vflip == null) {
            return false;
        } else {
            return vflip;
        }
    }

    /**
     * Sets the value of the vflip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVflip(Boolean value) {
        this.vflip = value;
    }

}
