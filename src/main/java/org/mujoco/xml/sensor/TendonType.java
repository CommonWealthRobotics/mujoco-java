//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:45:57 PM EDT 
//


package org.mujoco.xml.sensor;

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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.Copyable;
import com.kscs.util.jaxb.PartialCopyable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import com.kscs.util.jaxb.PropertyVisitor;


/**
 * <p>Java class for tendonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tendonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noise" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="cuttoff" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" /&gt;
 *       &lt;attribute name="tendon" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tendonType")
public class TendonType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "noise")
    protected BigDecimal noise;
    @XmlAttribute(name = "cuttoff")
    protected BigDecimal cuttoff;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "tendon", required = true)
    protected String tendon;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public TendonType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a TendonType copying the state of another TendonType
     * 
     * @param _other
     *     The original TendonType from which to copy state.
     */
    public TendonType(final TendonType _other) {
        this.name = _other.name;
        this.noise = _other.noise;
        this.cuttoff = _other.cuttoff;
        this.user = _other.user;
        this.tendon = _other.tendon;
    }

    /**
     * Instantiates a TendonType copying the state of another TendonType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original TendonType from which to copy state.
     */
    public TendonType(final TendonType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            this.name = _other.name;
        }
        final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
            this.noise = _other.noise;
        }
        final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
            this.cuttoff = _other.cuttoff;
        }
        final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
            this.user = _other.user;
        }
        final PropertyTree tendonPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tendon"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tendonPropertyTree!= null):((tendonPropertyTree == null)||(!tendonPropertyTree.isLeaf())))) {
            this.tendon = _other.tendon;
        }
    }

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
     * Gets the value of the tendon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTendon() {
        return tendon;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public TendonType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public TendonType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setName(final String value) {
        final String __oldValue = this.name;
        try {
            this.vetoableChange__Support.fireVetoableChange("name", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.name = value;
        this.propertyChange__Support.firePropertyChange("name", __oldValue, value);
    }

    public void setNoise(final BigDecimal value) {
        final BigDecimal __oldValue = this.noise;
        try {
            this.vetoableChange__Support.fireVetoableChange("noise", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.noise = value;
        this.propertyChange__Support.firePropertyChange("noise", __oldValue, value);
    }

    public void setCuttoff(final BigDecimal value) {
        final BigDecimal __oldValue = this.cuttoff;
        try {
            this.vetoableChange__Support.fireVetoableChange("cuttoff", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.cuttoff = value;
        this.propertyChange__Support.firePropertyChange("cuttoff", __oldValue, value);
    }

    public void setUser(final String value) {
        final String __oldValue = this.user;
        try {
            this.vetoableChange__Support.fireVetoableChange("user", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.user = value;
        this.propertyChange__Support.firePropertyChange("user", __oldValue, value);
    }

    public void setTendon(final String value) {
        final String __oldValue = this.tendon;
        try {
            this.vetoableChange__Support.fireVetoableChange("tendon", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.tendon = value;
        this.propertyChange__Support.firePropertyChange("tendon", __oldValue, value);
    }

    @Override
    public TendonType clone() {
        final TendonType _newObject;
        try {
            _newObject = ((TendonType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public TendonType createCopy() {
        final TendonType _newObject;
        try {
            _newObject = ((TendonType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.name = this.name;
        _newObject.noise = this.noise;
        _newObject.cuttoff = this.cuttoff;
        _newObject.user = this.user;
        _newObject.tendon = this.tendon;
        return _newObject;
    }

    @Override
    public TendonType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TendonType _newObject;
        try {
            _newObject = ((TendonType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _newObject.name = this.name;
        }
        final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
            _newObject.noise = this.noise;
        }
        final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
            _newObject.cuttoff = this.cuttoff;
        }
        final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
            _newObject.user = this.user;
        }
        final PropertyTree tendonPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tendon"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tendonPropertyTree!= null):((tendonPropertyTree == null)||(!tendonPropertyTree.isLeaf())))) {
            _newObject.tendon = this.tendon;
        }
        return _newObject;
    }

    @Override
    public TendonType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public TendonType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TendonType.Builder<_B> _other) {
        _other.name = this.name;
        _other.noise = this.noise;
        _other.cuttoff = this.cuttoff;
        _other.user = this.user;
        _other.tendon = this.tendon;
    }

    public<_B >TendonType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TendonType.Builder<_B>(_parentBuilder, this, true);
    }

    public TendonType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TendonType.Builder<Void> builder() {
        return new TendonType.Builder<Void>(null, null, false);
    }

    public static<_B >TendonType.Builder<_B> copyOf(final TendonType _other) {
        final TendonType.Builder<_B> _newBuilder = new TendonType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TendonType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
            _other.noise = this.noise;
        }
        final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
            _other.cuttoff = this.cuttoff;
        }
        final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
            _other.user = this.user;
        }
        final PropertyTree tendonPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tendon"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tendonPropertyTree!= null):((tendonPropertyTree == null)||(!tendonPropertyTree.isLeaf())))) {
            _other.tendon = this.tendon;
        }
    }

    public<_B >TendonType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TendonType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public TendonType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TendonType.Builder<_B> copyOf(final TendonType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TendonType.Builder<_B> _newBuilder = new TendonType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TendonType.Builder<Void> copyExcept(final TendonType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TendonType.Builder<Void> copyOnly(final TendonType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public TendonType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String name;
        private BigDecimal noise;
        private BigDecimal cuttoff;
        private String user;
        private String tendon;

        public Builder(final _B _parentBuilder, final TendonType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.name = _other.name;
                this.noise = _other.noise;
                this.cuttoff = _other.cuttoff;
                this.user = _other.user;
                this.tendon = _other.tendon;
            }
        }

        public Builder(final _B _parentBuilder, final TendonType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                    this.name = _other.name;
                }
                final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
                    this.noise = _other.noise;
                }
                final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
                    this.cuttoff = _other.cuttoff;
                }
                final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
                    this.user = _other.user;
                }
                final PropertyTree tendonPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tendon"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tendonPropertyTree!= null):((tendonPropertyTree == null)||(!tendonPropertyTree.isLeaf())))) {
                    this.tendon = _other.tendon;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends TendonType >_P init(final _P _product) {
            _product.name = this.name;
            _product.noise = this.noise;
            _product.cuttoff = this.cuttoff;
            _product.user = this.user;
            _product.tendon = this.tendon;
            return _product;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public TendonType.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "noise" (any previous value will be replaced)
         * 
         * @param noise
         *     New value of the "noise" property.
         */
        public TendonType.Builder<_B> withNoise(final BigDecimal noise) {
            this.noise = noise;
            return this;
        }

        /**
         * Sets the new value of "cuttoff" (any previous value will be replaced)
         * 
         * @param cuttoff
         *     New value of the "cuttoff" property.
         */
        public TendonType.Builder<_B> withCuttoff(final BigDecimal cuttoff) {
            this.cuttoff = cuttoff;
            return this;
        }

        /**
         * Sets the new value of "user" (any previous value will be replaced)
         * 
         * @param user
         *     New value of the "user" property.
         */
        public TendonType.Builder<_B> withUser(final String user) {
            this.user = user;
            return this;
        }

        /**
         * Sets the new value of "tendon" (any previous value will be replaced)
         * 
         * @param tendon
         *     New value of the "tendon" property.
         */
        public TendonType.Builder<_B> withTendon(final String tendon) {
            this.tendon = tendon;
            return this;
        }

        @Override
        public TendonType build() {
            return this.init(new TendonType());
        }

        public TendonType.Builder<_B> copyOf(final TendonType _other) {
            _other.copyTo(this);
            return this;
        }

        public TendonType.Builder<_B> copyOf(final TendonType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String NAME = "name";
        public final static transient String NOISE = "noise";
        public final static transient String CUTTOFF = "cuttoff";
        public final static transient String USER = "user";
        public final static transient String TENDON = "tendon";

    }

    public static class Select
        extends TendonType.Selector<TendonType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TendonType.Select _root() {
            return new TendonType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> noise = null;
        private com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> cuttoff = null;
        private com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> user = null;
        private com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> tendon = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            if (this.noise!= null) {
                products.put("noise", this.noise.init());
            }
            if (this.cuttoff!= null) {
                products.put("cuttoff", this.cuttoff.init());
            }
            if (this.user!= null) {
                products.put("user", this.user.init());
            }
            if (this.tendon!= null) {
                products.put("tendon", this.tendon.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> noise() {
            return ((this.noise == null)?this.noise = new com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>>(this._root, this, "noise"):this.noise);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> cuttoff() {
            return ((this.cuttoff == null)?this.cuttoff = new com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>>(this._root, this, "cuttoff"):this.cuttoff);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> user() {
            return ((this.user == null)?this.user = new com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>>(this._root, this, "user"):this.user);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>> tendon() {
            return ((this.tendon == null)?this.tendon = new com.kscs.util.jaxb.Selector<TRoot, TendonType.Selector<TRoot, TParent>>(this._root, this, "tendon"):this.tendon);
        }

    }

}