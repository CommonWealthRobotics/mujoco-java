//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:36:46 PM EDT 
//


package org.mujoco.xml.body;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.Copyable;
import com.kscs.util.jaxb.PartialCopyable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import com.kscs.util.jaxb.PropertyVisitor;
import org.mujoco.xml.attributetypes.CompositetypeType;


/**
 * <p>Java class for compositeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required" type="{attributeTypes}compositetypeType" /&gt;
 *       &lt;attribute name="count" use="required" type="{attributeTypes}upToThreeRealsType" /&gt;
 *       &lt;attribute name="spacing" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="offset" type="{attributeTypes}threeRealsType" default="0 0 0" /&gt;
 *       &lt;attribute name="flatinertia" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="solimpsmooth" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" /&gt;
 *       &lt;attribute name="solrefsmooth" type="{attributeTypes}twoRealsType" default="0.02 1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
public class CompositeType implements Cloneable, Copyable, PartialCopyable
{

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
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public CompositeType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a CompositeType copying the state of another CompositeType
     * 
     * @param _other
     *     The original CompositeType from which to copy state.
     */
    public CompositeType(final CompositeType _other) {
        this.prefix = _other.prefix;
        this.type = _other.type;
        this.count = _other.count;
        this.spacing = _other.spacing;
        this.offset = _other.offset;
        this.flatinertia = _other.flatinertia;
        this.solimpsmooth = _other.solimpsmooth;
        this.solrefsmooth = _other.solrefsmooth;
    }

    /**
     * Instantiates a CompositeType copying the state of another CompositeType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original CompositeType from which to copy state.
     */
    public CompositeType(final CompositeType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree prefixPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prefix"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prefixPropertyTree!= null):((prefixPropertyTree == null)||(!prefixPropertyTree.isLeaf())))) {
            this.prefix = _other.prefix;
        }
        final PropertyTree typePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("type"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typePropertyTree!= null):((typePropertyTree == null)||(!typePropertyTree.isLeaf())))) {
            this.type = _other.type;
        }
        final PropertyTree countPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("count"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(countPropertyTree!= null):((countPropertyTree == null)||(!countPropertyTree.isLeaf())))) {
            this.count = _other.count;
        }
        final PropertyTree spacingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("spacing"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(spacingPropertyTree!= null):((spacingPropertyTree == null)||(!spacingPropertyTree.isLeaf())))) {
            this.spacing = _other.spacing;
        }
        final PropertyTree offsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsetPropertyTree!= null):((offsetPropertyTree == null)||(!offsetPropertyTree.isLeaf())))) {
            this.offset = _other.offset;
        }
        final PropertyTree flatinertiaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("flatinertia"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(flatinertiaPropertyTree!= null):((flatinertiaPropertyTree == null)||(!flatinertiaPropertyTree.isLeaf())))) {
            this.flatinertia = _other.flatinertia;
        }
        final PropertyTree solimpsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimpsmooth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpsmoothPropertyTree!= null):((solimpsmoothPropertyTree == null)||(!solimpsmoothPropertyTree.isLeaf())))) {
            this.solimpsmooth = _other.solimpsmooth;
        }
        final PropertyTree solrefsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solrefsmooth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefsmoothPropertyTree!= null):((solrefsmoothPropertyTree == null)||(!solrefsmoothPropertyTree.isLeaf())))) {
            this.solrefsmooth = _other.solrefsmooth;
        }
    }

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

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public CompositeType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public CompositeType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setPrefix(final String value) {
        final String __oldValue = this.prefix;
        try {
            this.vetoableChange__Support.fireVetoableChange("prefix", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.prefix = value;
        this.propertyChange__Support.firePropertyChange("prefix", __oldValue, value);
    }

    public void setType(final CompositetypeType value) {
        final CompositetypeType __oldValue = this.type;
        try {
            this.vetoableChange__Support.fireVetoableChange("type", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.type = value;
        this.propertyChange__Support.firePropertyChange("type", __oldValue, value);
    }

    public void setCount(final String value) {
        final String __oldValue = this.count;
        try {
            this.vetoableChange__Support.fireVetoableChange("count", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.count = value;
        this.propertyChange__Support.firePropertyChange("count", __oldValue, value);
    }

    public void setSpacing(final BigDecimal value) {
        final BigDecimal __oldValue = this.spacing;
        try {
            this.vetoableChange__Support.fireVetoableChange("spacing", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.spacing = value;
        this.propertyChange__Support.firePropertyChange("spacing", __oldValue, value);
    }

    public void setOffset(final String value) {
        final String __oldValue = this.offset;
        try {
            this.vetoableChange__Support.fireVetoableChange("offset", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.offset = value;
        this.propertyChange__Support.firePropertyChange("offset", __oldValue, value);
    }

    public void setFlatinertia(final BigDecimal value) {
        final BigDecimal __oldValue = this.flatinertia;
        try {
            this.vetoableChange__Support.fireVetoableChange("flatinertia", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.flatinertia = value;
        this.propertyChange__Support.firePropertyChange("flatinertia", __oldValue, value);
    }

    public void setSolimpsmooth(final String value) {
        final String __oldValue = this.solimpsmooth;
        try {
            this.vetoableChange__Support.fireVetoableChange("solimpsmooth", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.solimpsmooth = value;
        this.propertyChange__Support.firePropertyChange("solimpsmooth", __oldValue, value);
    }

    public void setSolrefsmooth(final String value) {
        final String __oldValue = this.solrefsmooth;
        try {
            this.vetoableChange__Support.fireVetoableChange("solrefsmooth", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.solrefsmooth = value;
        this.propertyChange__Support.firePropertyChange("solrefsmooth", __oldValue, value);
    }

    @Override
    public CompositeType clone() {
        final CompositeType _newObject;
        try {
            _newObject = ((CompositeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public CompositeType createCopy() {
        final CompositeType _newObject;
        try {
            _newObject = ((CompositeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.prefix = this.prefix;
        _newObject.type = this.type;
        _newObject.count = this.count;
        _newObject.spacing = this.spacing;
        _newObject.offset = this.offset;
        _newObject.flatinertia = this.flatinertia;
        _newObject.solimpsmooth = this.solimpsmooth;
        _newObject.solrefsmooth = this.solrefsmooth;
        return _newObject;
    }

    @Override
    public CompositeType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CompositeType _newObject;
        try {
            _newObject = ((CompositeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree prefixPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prefix"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prefixPropertyTree!= null):((prefixPropertyTree == null)||(!prefixPropertyTree.isLeaf())))) {
            _newObject.prefix = this.prefix;
        }
        final PropertyTree typePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("type"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typePropertyTree!= null):((typePropertyTree == null)||(!typePropertyTree.isLeaf())))) {
            _newObject.type = this.type;
        }
        final PropertyTree countPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("count"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(countPropertyTree!= null):((countPropertyTree == null)||(!countPropertyTree.isLeaf())))) {
            _newObject.count = this.count;
        }
        final PropertyTree spacingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("spacing"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(spacingPropertyTree!= null):((spacingPropertyTree == null)||(!spacingPropertyTree.isLeaf())))) {
            _newObject.spacing = this.spacing;
        }
        final PropertyTree offsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsetPropertyTree!= null):((offsetPropertyTree == null)||(!offsetPropertyTree.isLeaf())))) {
            _newObject.offset = this.offset;
        }
        final PropertyTree flatinertiaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("flatinertia"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(flatinertiaPropertyTree!= null):((flatinertiaPropertyTree == null)||(!flatinertiaPropertyTree.isLeaf())))) {
            _newObject.flatinertia = this.flatinertia;
        }
        final PropertyTree solimpsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimpsmooth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpsmoothPropertyTree!= null):((solimpsmoothPropertyTree == null)||(!solimpsmoothPropertyTree.isLeaf())))) {
            _newObject.solimpsmooth = this.solimpsmooth;
        }
        final PropertyTree solrefsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solrefsmooth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefsmoothPropertyTree!= null):((solrefsmoothPropertyTree == null)||(!solrefsmoothPropertyTree.isLeaf())))) {
            _newObject.solrefsmooth = this.solrefsmooth;
        }
        return _newObject;
    }

    @Override
    public CompositeType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public CompositeType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CompositeType.Builder<_B> _other) {
        _other.prefix = this.prefix;
        _other.type = this.type;
        _other.count = this.count;
        _other.spacing = this.spacing;
        _other.offset = this.offset;
        _other.flatinertia = this.flatinertia;
        _other.solimpsmooth = this.solimpsmooth;
        _other.solrefsmooth = this.solrefsmooth;
    }

    public<_B >CompositeType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CompositeType.Builder<_B>(_parentBuilder, this, true);
    }

    public CompositeType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CompositeType.Builder<Void> builder() {
        return new CompositeType.Builder<Void>(null, null, false);
    }

    public static<_B >CompositeType.Builder<_B> copyOf(final CompositeType _other) {
        final CompositeType.Builder<_B> _newBuilder = new CompositeType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CompositeType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree prefixPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prefix"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prefixPropertyTree!= null):((prefixPropertyTree == null)||(!prefixPropertyTree.isLeaf())))) {
            _other.prefix = this.prefix;
        }
        final PropertyTree typePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("type"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typePropertyTree!= null):((typePropertyTree == null)||(!typePropertyTree.isLeaf())))) {
            _other.type = this.type;
        }
        final PropertyTree countPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("count"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(countPropertyTree!= null):((countPropertyTree == null)||(!countPropertyTree.isLeaf())))) {
            _other.count = this.count;
        }
        final PropertyTree spacingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("spacing"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(spacingPropertyTree!= null):((spacingPropertyTree == null)||(!spacingPropertyTree.isLeaf())))) {
            _other.spacing = this.spacing;
        }
        final PropertyTree offsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsetPropertyTree!= null):((offsetPropertyTree == null)||(!offsetPropertyTree.isLeaf())))) {
            _other.offset = this.offset;
        }
        final PropertyTree flatinertiaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("flatinertia"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(flatinertiaPropertyTree!= null):((flatinertiaPropertyTree == null)||(!flatinertiaPropertyTree.isLeaf())))) {
            _other.flatinertia = this.flatinertia;
        }
        final PropertyTree solimpsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimpsmooth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpsmoothPropertyTree!= null):((solimpsmoothPropertyTree == null)||(!solimpsmoothPropertyTree.isLeaf())))) {
            _other.solimpsmooth = this.solimpsmooth;
        }
        final PropertyTree solrefsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solrefsmooth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefsmoothPropertyTree!= null):((solrefsmoothPropertyTree == null)||(!solrefsmoothPropertyTree.isLeaf())))) {
            _other.solrefsmooth = this.solrefsmooth;
        }
    }

    public<_B >CompositeType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CompositeType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CompositeType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CompositeType.Builder<_B> copyOf(final CompositeType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CompositeType.Builder<_B> _newBuilder = new CompositeType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CompositeType.Builder<Void> copyExcept(final CompositeType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CompositeType.Builder<Void> copyOnly(final CompositeType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public CompositeType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String prefix;
        private CompositetypeType type;
        private String count;
        private BigDecimal spacing;
        private String offset;
        private BigDecimal flatinertia;
        private String solimpsmooth;
        private String solrefsmooth;

        public Builder(final _B _parentBuilder, final CompositeType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.prefix = _other.prefix;
                this.type = _other.type;
                this.count = _other.count;
                this.spacing = _other.spacing;
                this.offset = _other.offset;
                this.flatinertia = _other.flatinertia;
                this.solimpsmooth = _other.solimpsmooth;
                this.solrefsmooth = _other.solrefsmooth;
            }
        }

        public Builder(final _B _parentBuilder, final CompositeType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree prefixPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prefix"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prefixPropertyTree!= null):((prefixPropertyTree == null)||(!prefixPropertyTree.isLeaf())))) {
                    this.prefix = _other.prefix;
                }
                final PropertyTree typePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("type"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typePropertyTree!= null):((typePropertyTree == null)||(!typePropertyTree.isLeaf())))) {
                    this.type = _other.type;
                }
                final PropertyTree countPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("count"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(countPropertyTree!= null):((countPropertyTree == null)||(!countPropertyTree.isLeaf())))) {
                    this.count = _other.count;
                }
                final PropertyTree spacingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("spacing"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(spacingPropertyTree!= null):((spacingPropertyTree == null)||(!spacingPropertyTree.isLeaf())))) {
                    this.spacing = _other.spacing;
                }
                final PropertyTree offsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsetPropertyTree!= null):((offsetPropertyTree == null)||(!offsetPropertyTree.isLeaf())))) {
                    this.offset = _other.offset;
                }
                final PropertyTree flatinertiaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("flatinertia"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(flatinertiaPropertyTree!= null):((flatinertiaPropertyTree == null)||(!flatinertiaPropertyTree.isLeaf())))) {
                    this.flatinertia = _other.flatinertia;
                }
                final PropertyTree solimpsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimpsmooth"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpsmoothPropertyTree!= null):((solimpsmoothPropertyTree == null)||(!solimpsmoothPropertyTree.isLeaf())))) {
                    this.solimpsmooth = _other.solimpsmooth;
                }
                final PropertyTree solrefsmoothPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solrefsmooth"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefsmoothPropertyTree!= null):((solrefsmoothPropertyTree == null)||(!solrefsmoothPropertyTree.isLeaf())))) {
                    this.solrefsmooth = _other.solrefsmooth;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends CompositeType >_P init(final _P _product) {
            _product.prefix = this.prefix;
            _product.type = this.type;
            _product.count = this.count;
            _product.spacing = this.spacing;
            _product.offset = this.offset;
            _product.flatinertia = this.flatinertia;
            _product.solimpsmooth = this.solimpsmooth;
            _product.solrefsmooth = this.solrefsmooth;
            return _product;
        }

        /**
         * Sets the new value of "prefix" (any previous value will be replaced)
         * 
         * @param prefix
         *     New value of the "prefix" property.
         */
        public CompositeType.Builder<_B> withPrefix(final String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the new value of "type" (any previous value will be replaced)
         * 
         * @param type
         *     New value of the "type" property.
         */
        public CompositeType.Builder<_B> withType(final CompositetypeType type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the new value of "count" (any previous value will be replaced)
         * 
         * @param count
         *     New value of the "count" property.
         */
        public CompositeType.Builder<_B> withCount(final String count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the new value of "spacing" (any previous value will be replaced)
         * 
         * @param spacing
         *     New value of the "spacing" property.
         */
        public CompositeType.Builder<_B> withSpacing(final BigDecimal spacing) {
            this.spacing = spacing;
            return this;
        }

        /**
         * Sets the new value of "offset" (any previous value will be replaced)
         * 
         * @param offset
         *     New value of the "offset" property.
         */
        public CompositeType.Builder<_B> withOffset(final String offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Sets the new value of "flatinertia" (any previous value will be replaced)
         * 
         * @param flatinertia
         *     New value of the "flatinertia" property.
         */
        public CompositeType.Builder<_B> withFlatinertia(final BigDecimal flatinertia) {
            this.flatinertia = flatinertia;
            return this;
        }

        /**
         * Sets the new value of "solimpsmooth" (any previous value will be replaced)
         * 
         * @param solimpsmooth
         *     New value of the "solimpsmooth" property.
         */
        public CompositeType.Builder<_B> withSolimpsmooth(final String solimpsmooth) {
            this.solimpsmooth = solimpsmooth;
            return this;
        }

        /**
         * Sets the new value of "solrefsmooth" (any previous value will be replaced)
         * 
         * @param solrefsmooth
         *     New value of the "solrefsmooth" property.
         */
        public CompositeType.Builder<_B> withSolrefsmooth(final String solrefsmooth) {
            this.solrefsmooth = solrefsmooth;
            return this;
        }

        @Override
        public CompositeType build() {
            return this.init(new CompositeType());
        }

        public CompositeType.Builder<_B> copyOf(final CompositeType _other) {
            _other.copyTo(this);
            return this;
        }

        public CompositeType.Builder<_B> copyOf(final CompositeType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String PREFIX = "prefix";
        public final static transient String TYPE = "type";
        public final static transient String COUNT = "count";
        public final static transient String SPACING = "spacing";
        public final static transient String OFFSET = "offset";
        public final static transient String FLATINERTIA = "flatinertia";
        public final static transient String SOLIMPSMOOTH = "solimpsmooth";
        public final static transient String SOLREFSMOOTH = "solrefsmooth";

    }

    public static class Select
        extends CompositeType.Selector<CompositeType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CompositeType.Select _root() {
            return new CompositeType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> prefix = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> type = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> count = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> spacing = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> offset = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> flatinertia = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> solimpsmooth = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> solrefsmooth = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.prefix!= null) {
                products.put("prefix", this.prefix.init());
            }
            if (this.type!= null) {
                products.put("type", this.type.init());
            }
            if (this.count!= null) {
                products.put("count", this.count.init());
            }
            if (this.spacing!= null) {
                products.put("spacing", this.spacing.init());
            }
            if (this.offset!= null) {
                products.put("offset", this.offset.init());
            }
            if (this.flatinertia!= null) {
                products.put("flatinertia", this.flatinertia.init());
            }
            if (this.solimpsmooth!= null) {
                products.put("solimpsmooth", this.solimpsmooth.init());
            }
            if (this.solrefsmooth!= null) {
                products.put("solrefsmooth", this.solrefsmooth.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> prefix() {
            return ((this.prefix == null)?this.prefix = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "prefix"):this.prefix);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> type() {
            return ((this.type == null)?this.type = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "type"):this.type);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> count() {
            return ((this.count == null)?this.count = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "count"):this.count);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> spacing() {
            return ((this.spacing == null)?this.spacing = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "spacing"):this.spacing);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> offset() {
            return ((this.offset == null)?this.offset = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "offset"):this.offset);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> flatinertia() {
            return ((this.flatinertia == null)?this.flatinertia = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "flatinertia"):this.flatinertia);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> solimpsmooth() {
            return ((this.solimpsmooth == null)?this.solimpsmooth = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "solimpsmooth"):this.solimpsmooth);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>> solrefsmooth() {
            return ((this.solrefsmooth == null)?this.solrefsmooth = new com.kscs.util.jaxb.Selector<TRoot, CompositeType.Selector<TRoot, TParent>>(this._root, this, "solrefsmooth"):this.solrefsmooth);
        }

    }

}
