//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:45:57 PM EDT 
//


package org.mujoco.xml.contact;

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
 * <p>Java class for excludeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="excludeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="body1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="body2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "excludeType")
public class ExcludeType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "body1", required = true)
    protected String body1;
    @XmlAttribute(name = "body2", required = true)
    protected String body2;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public ExcludeType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a ExcludeType copying the state of another ExcludeType
     * 
     * @param _other
     *     The original ExcludeType from which to copy state.
     */
    public ExcludeType(final ExcludeType _other) {
        this.name = _other.name;
        this.body1 = _other.body1;
        this.body2 = _other.body2;
    }

    /**
     * Instantiates a ExcludeType copying the state of another ExcludeType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original ExcludeType from which to copy state.
     */
    public ExcludeType(final ExcludeType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            this.name = _other.name;
        }
        final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
            this.body1 = _other.body1;
        }
        final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
            this.body2 = _other.body2;
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
     * Gets the value of the body1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody1() {
        return body1;
    }

    /**
     * Gets the value of the body2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody2() {
        return body2;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public ExcludeType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public ExcludeType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
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

    public void setBody1(final String value) {
        final String __oldValue = this.body1;
        try {
            this.vetoableChange__Support.fireVetoableChange("body1", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.body1 = value;
        this.propertyChange__Support.firePropertyChange("body1", __oldValue, value);
    }

    public void setBody2(final String value) {
        final String __oldValue = this.body2;
        try {
            this.vetoableChange__Support.fireVetoableChange("body2", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.body2 = value;
        this.propertyChange__Support.firePropertyChange("body2", __oldValue, value);
    }

    @Override
    public ExcludeType clone() {
        final ExcludeType _newObject;
        try {
            _newObject = ((ExcludeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public ExcludeType createCopy() {
        final ExcludeType _newObject;
        try {
            _newObject = ((ExcludeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.name = this.name;
        _newObject.body1 = this.body1;
        _newObject.body2 = this.body2;
        return _newObject;
    }

    @Override
    public ExcludeType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ExcludeType _newObject;
        try {
            _newObject = ((ExcludeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _newObject.name = this.name;
        }
        final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
            _newObject.body1 = this.body1;
        }
        final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
            _newObject.body2 = this.body2;
        }
        return _newObject;
    }

    @Override
    public ExcludeType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public ExcludeType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ExcludeType.Builder<_B> _other) {
        _other.name = this.name;
        _other.body1 = this.body1;
        _other.body2 = this.body2;
    }

    public<_B >ExcludeType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ExcludeType.Builder<_B>(_parentBuilder, this, true);
    }

    public ExcludeType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ExcludeType.Builder<Void> builder() {
        return new ExcludeType.Builder<Void>(null, null, false);
    }

    public static<_B >ExcludeType.Builder<_B> copyOf(final ExcludeType _other) {
        final ExcludeType.Builder<_B> _newBuilder = new ExcludeType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ExcludeType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
            _other.body1 = this.body1;
        }
        final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
            _other.body2 = this.body2;
        }
    }

    public<_B >ExcludeType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ExcludeType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ExcludeType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ExcludeType.Builder<_B> copyOf(final ExcludeType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ExcludeType.Builder<_B> _newBuilder = new ExcludeType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ExcludeType.Builder<Void> copyExcept(final ExcludeType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ExcludeType.Builder<Void> copyOnly(final ExcludeType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public ExcludeType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String name;
        private String body1;
        private String body2;

        public Builder(final _B _parentBuilder, final ExcludeType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.name = _other.name;
                this.body1 = _other.body1;
                this.body2 = _other.body2;
            }
        }

        public Builder(final _B _parentBuilder, final ExcludeType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                    this.name = _other.name;
                }
                final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
                    this.body1 = _other.body1;
                }
                final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
                    this.body2 = _other.body2;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends ExcludeType >_P init(final _P _product) {
            _product.name = this.name;
            _product.body1 = this.body1;
            _product.body2 = this.body2;
            return _product;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public ExcludeType.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "body1" (any previous value will be replaced)
         * 
         * @param body1
         *     New value of the "body1" property.
         */
        public ExcludeType.Builder<_B> withBody1(final String body1) {
            this.body1 = body1;
            return this;
        }

        /**
         * Sets the new value of "body2" (any previous value will be replaced)
         * 
         * @param body2
         *     New value of the "body2" property.
         */
        public ExcludeType.Builder<_B> withBody2(final String body2) {
            this.body2 = body2;
            return this;
        }

        @Override
        public ExcludeType build() {
            return this.init(new ExcludeType());
        }

        public ExcludeType.Builder<_B> copyOf(final ExcludeType _other) {
            _other.copyTo(this);
            return this;
        }

        public ExcludeType.Builder<_B> copyOf(final ExcludeType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String NAME = "name";
        public final static transient String BODY_1 = "body1";
        public final static transient String BODY_2 = "body2";

    }

    public static class Select
        extends ExcludeType.Selector<ExcludeType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ExcludeType.Select _root() {
            return new ExcludeType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>> body1 = null;
        private com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>> body2 = null;

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
            if (this.body1 != null) {
                products.put("body1", this.body1 .init());
            }
            if (this.body2 != null) {
                products.put("body2", this.body2 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>> body1() {
            return ((this.body1 == null)?this.body1 = new com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>>(this._root, this, "body1"):this.body1);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>> body2() {
            return ((this.body2 == null)?this.body2 = new com.kscs.util.jaxb.Selector<TRoot, ExcludeType.Selector<TRoot, TParent>>(this._root, this, "body2"):this.body2);
        }

    }

}
