//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:45:57 PM EDT 
//


package org.mujoco.xml.visual;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
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
 * <p>Java class for headlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="headlightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ambient" type="{attributeTypes}threeRealsType" default="0.1 0.1 0.1" /&gt;
 *       &lt;attribute name="diffuse" type="{attributeTypes}threeRealsType" default="0.4 0.4 0.4" /&gt;
 *       &lt;attribute name="specular" type="{attributeTypes}threeRealsType" default="0.5 0.5 0.5" /&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headlightType")
public class HeadlightType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "ambient")
    protected String ambient;
    @XmlAttribute(name = "diffuse")
    protected String diffuse;
    @XmlAttribute(name = "specular")
    protected String specular;
    @XmlAttribute(name = "active")
    protected Integer active;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public HeadlightType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a HeadlightType copying the state of another HeadlightType
     * 
     * @param _other
     *     The original HeadlightType from which to copy state.
     */
    public HeadlightType(final HeadlightType _other) {
        this.ambient = _other.ambient;
        this.diffuse = _other.diffuse;
        this.specular = _other.specular;
        this.active = _other.active;
    }

    /**
     * Instantiates a HeadlightType copying the state of another HeadlightType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original HeadlightType from which to copy state.
     */
    public HeadlightType(final HeadlightType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree ambientPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ambient"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ambientPropertyTree!= null):((ambientPropertyTree == null)||(!ambientPropertyTree.isLeaf())))) {
            this.ambient = _other.ambient;
        }
        final PropertyTree diffusePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diffuse"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diffusePropertyTree!= null):((diffusePropertyTree == null)||(!diffusePropertyTree.isLeaf())))) {
            this.diffuse = _other.diffuse;
        }
        final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
            this.specular = _other.specular;
        }
        final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
            this.active = _other.active;
        }
    }

    /**
     * Gets the value of the ambient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbient() {
        if (ambient == null) {
            return "0.1 0.1 0.1";
        } else {
            return ambient;
        }
    }

    /**
     * Gets the value of the diffuse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffuse() {
        if (diffuse == null) {
            return "0.4 0.4 0.4";
        } else {
            return diffuse;
        }
    }

    /**
     * Gets the value of the specular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecular() {
        if (specular == null) {
            return "0.5 0.5 0.5";
        } else {
            return specular;
        }
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getActive() {
        if (active == null) {
            return  1;
        } else {
            return active;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public HeadlightType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public HeadlightType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setAmbient(final String value) {
        final String __oldValue = this.ambient;
        try {
            this.vetoableChange__Support.fireVetoableChange("ambient", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.ambient = value;
        this.propertyChange__Support.firePropertyChange("ambient", __oldValue, value);
    }

    public void setDiffuse(final String value) {
        final String __oldValue = this.diffuse;
        try {
            this.vetoableChange__Support.fireVetoableChange("diffuse", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.diffuse = value;
        this.propertyChange__Support.firePropertyChange("diffuse", __oldValue, value);
    }

    public void setSpecular(final String value) {
        final String __oldValue = this.specular;
        try {
            this.vetoableChange__Support.fireVetoableChange("specular", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.specular = value;
        this.propertyChange__Support.firePropertyChange("specular", __oldValue, value);
    }

    public void setActive(final Integer value) {
        final Integer __oldValue = this.active;
        try {
            this.vetoableChange__Support.fireVetoableChange("active", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.active = value;
        this.propertyChange__Support.firePropertyChange("active", __oldValue, value);
    }

    @Override
    public HeadlightType clone() {
        final HeadlightType _newObject;
        try {
            _newObject = ((HeadlightType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public HeadlightType createCopy() {
        final HeadlightType _newObject;
        try {
            _newObject = ((HeadlightType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.ambient = this.ambient;
        _newObject.diffuse = this.diffuse;
        _newObject.specular = this.specular;
        _newObject.active = this.active;
        return _newObject;
    }

    @Override
    public HeadlightType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HeadlightType _newObject;
        try {
            _newObject = ((HeadlightType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree ambientPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ambient"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ambientPropertyTree!= null):((ambientPropertyTree == null)||(!ambientPropertyTree.isLeaf())))) {
            _newObject.ambient = this.ambient;
        }
        final PropertyTree diffusePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diffuse"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diffusePropertyTree!= null):((diffusePropertyTree == null)||(!diffusePropertyTree.isLeaf())))) {
            _newObject.diffuse = this.diffuse;
        }
        final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
            _newObject.specular = this.specular;
        }
        final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
            _newObject.active = this.active;
        }
        return _newObject;
    }

    @Override
    public HeadlightType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public HeadlightType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HeadlightType.Builder<_B> _other) {
        _other.ambient = this.ambient;
        _other.diffuse = this.diffuse;
        _other.specular = this.specular;
        _other.active = this.active;
    }

    public<_B >HeadlightType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HeadlightType.Builder<_B>(_parentBuilder, this, true);
    }

    public HeadlightType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HeadlightType.Builder<Void> builder() {
        return new HeadlightType.Builder<Void>(null, null, false);
    }

    public static<_B >HeadlightType.Builder<_B> copyOf(final HeadlightType _other) {
        final HeadlightType.Builder<_B> _newBuilder = new HeadlightType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HeadlightType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree ambientPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ambient"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ambientPropertyTree!= null):((ambientPropertyTree == null)||(!ambientPropertyTree.isLeaf())))) {
            _other.ambient = this.ambient;
        }
        final PropertyTree diffusePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diffuse"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diffusePropertyTree!= null):((diffusePropertyTree == null)||(!diffusePropertyTree.isLeaf())))) {
            _other.diffuse = this.diffuse;
        }
        final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
            _other.specular = this.specular;
        }
        final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
            _other.active = this.active;
        }
    }

    public<_B >HeadlightType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HeadlightType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HeadlightType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HeadlightType.Builder<_B> copyOf(final HeadlightType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HeadlightType.Builder<_B> _newBuilder = new HeadlightType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HeadlightType.Builder<Void> copyExcept(final HeadlightType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HeadlightType.Builder<Void> copyOnly(final HeadlightType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public HeadlightType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String ambient;
        private String diffuse;
        private String specular;
        private Integer active;

        public Builder(final _B _parentBuilder, final HeadlightType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.ambient = _other.ambient;
                this.diffuse = _other.diffuse;
                this.specular = _other.specular;
                this.active = _other.active;
            }
        }

        public Builder(final _B _parentBuilder, final HeadlightType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree ambientPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ambient"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ambientPropertyTree!= null):((ambientPropertyTree == null)||(!ambientPropertyTree.isLeaf())))) {
                    this.ambient = _other.ambient;
                }
                final PropertyTree diffusePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diffuse"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diffusePropertyTree!= null):((diffusePropertyTree == null)||(!diffusePropertyTree.isLeaf())))) {
                    this.diffuse = _other.diffuse;
                }
                final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
                    this.specular = _other.specular;
                }
                final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
                    this.active = _other.active;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends HeadlightType >_P init(final _P _product) {
            _product.ambient = this.ambient;
            _product.diffuse = this.diffuse;
            _product.specular = this.specular;
            _product.active = this.active;
            return _product;
        }

        /**
         * Sets the new value of "ambient" (any previous value will be replaced)
         * 
         * @param ambient
         *     New value of the "ambient" property.
         */
        public HeadlightType.Builder<_B> withAmbient(final String ambient) {
            this.ambient = ambient;
            return this;
        }

        /**
         * Sets the new value of "diffuse" (any previous value will be replaced)
         * 
         * @param diffuse
         *     New value of the "diffuse" property.
         */
        public HeadlightType.Builder<_B> withDiffuse(final String diffuse) {
            this.diffuse = diffuse;
            return this;
        }

        /**
         * Sets the new value of "specular" (any previous value will be replaced)
         * 
         * @param specular
         *     New value of the "specular" property.
         */
        public HeadlightType.Builder<_B> withSpecular(final String specular) {
            this.specular = specular;
            return this;
        }

        /**
         * Sets the new value of "active" (any previous value will be replaced)
         * 
         * @param active
         *     New value of the "active" property.
         */
        public HeadlightType.Builder<_B> withActive(final Integer active) {
            this.active = active;
            return this;
        }

        @Override
        public HeadlightType build() {
            return this.init(new HeadlightType());
        }

        public HeadlightType.Builder<_B> copyOf(final HeadlightType _other) {
            _other.copyTo(this);
            return this;
        }

        public HeadlightType.Builder<_B> copyOf(final HeadlightType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String AMBIENT = "ambient";
        public final static transient String DIFFUSE = "diffuse";
        public final static transient String SPECULAR = "specular";
        public final static transient String ACTIVE = "active";

    }

    public static class Select
        extends HeadlightType.Selector<HeadlightType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HeadlightType.Select _root() {
            return new HeadlightType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> ambient = null;
        private com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> diffuse = null;
        private com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> specular = null;
        private com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> active = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.ambient!= null) {
                products.put("ambient", this.ambient.init());
            }
            if (this.diffuse!= null) {
                products.put("diffuse", this.diffuse.init());
            }
            if (this.specular!= null) {
                products.put("specular", this.specular.init());
            }
            if (this.active!= null) {
                products.put("active", this.active.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> ambient() {
            return ((this.ambient == null)?this.ambient = new com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>>(this._root, this, "ambient"):this.ambient);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> diffuse() {
            return ((this.diffuse == null)?this.diffuse = new com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>>(this._root, this, "diffuse"):this.diffuse);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> specular() {
            return ((this.specular == null)?this.specular = new com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>>(this._root, this, "specular"):this.specular);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>> active() {
            return ((this.active == null)?this.active = new com.kscs.util.jaxb.Selector<TRoot, HeadlightType.Selector<TRoot, TParent>>(this._root, this, "active"):this.active);
        }

    }

}
