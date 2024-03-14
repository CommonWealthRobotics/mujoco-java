//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.14 at 02:05:12 PM EDT 
//


package org.mujoco.xml.custom;

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
 * <p>Java class for elementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="objtype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="objname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prm" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementType")
public class ElementType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "objtype", required = true)
    protected String objtype;
    @XmlAttribute(name = "objname", required = true)
    protected String objname;
    @XmlAttribute(name = "prm")
    protected BigDecimal prm;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public ElementType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a ElementType copying the state of another ElementType
     * 
     * @param _other
     *     The original ElementType from which to copy state.
     */
    public ElementType(final ElementType _other) {
        this.objtype = _other.objtype;
        this.objname = _other.objname;
        this.prm = _other.prm;
    }

    /**
     * Instantiates a ElementType copying the state of another ElementType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original ElementType from which to copy state.
     */
    public ElementType(final ElementType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
            this.objtype = _other.objtype;
        }
        final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
            this.objname = _other.objname;
        }
        final PropertyTree prmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prm"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prmPropertyTree!= null):((prmPropertyTree == null)||(!prmPropertyTree.isLeaf())))) {
            this.prm = _other.prm;
        }
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
     * Gets the value of the prm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrm() {
        if (prm == null) {
            return new BigDecimal("0");
        } else {
            return prm;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public ElementType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public ElementType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setObjtype(final String value) {
        final String __oldValue = this.objtype;
        try {
            this.vetoableChange__Support.fireVetoableChange("objtype", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.objtype = value;
        this.propertyChange__Support.firePropertyChange("objtype", __oldValue, value);
    }

    public void setObjname(final String value) {
        final String __oldValue = this.objname;
        try {
            this.vetoableChange__Support.fireVetoableChange("objname", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.objname = value;
        this.propertyChange__Support.firePropertyChange("objname", __oldValue, value);
    }

    public void setPrm(final BigDecimal value) {
        final BigDecimal __oldValue = this.prm;
        try {
            this.vetoableChange__Support.fireVetoableChange("prm", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.prm = value;
        this.propertyChange__Support.firePropertyChange("prm", __oldValue, value);
    }

    @Override
    public ElementType clone() {
        final ElementType _newObject;
        try {
            _newObject = ((ElementType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public ElementType createCopy() {
        final ElementType _newObject;
        try {
            _newObject = ((ElementType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.objtype = this.objtype;
        _newObject.objname = this.objname;
        _newObject.prm = this.prm;
        return _newObject;
    }

    @Override
    public ElementType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ElementType _newObject;
        try {
            _newObject = ((ElementType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
            _newObject.objtype = this.objtype;
        }
        final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
            _newObject.objname = this.objname;
        }
        final PropertyTree prmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prm"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prmPropertyTree!= null):((prmPropertyTree == null)||(!prmPropertyTree.isLeaf())))) {
            _newObject.prm = this.prm;
        }
        return _newObject;
    }

    @Override
    public ElementType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public ElementType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ElementType.Builder<_B> _other) {
        _other.objtype = this.objtype;
        _other.objname = this.objname;
        _other.prm = this.prm;
    }

    public<_B >ElementType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ElementType.Builder<_B>(_parentBuilder, this, true);
    }

    public ElementType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ElementType.Builder<Void> builder() {
        return new ElementType.Builder<Void>(null, null, false);
    }

    public static<_B >ElementType.Builder<_B> copyOf(final ElementType _other) {
        final ElementType.Builder<_B> _newBuilder = new ElementType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ElementType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
            _other.objtype = this.objtype;
        }
        final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
            _other.objname = this.objname;
        }
        final PropertyTree prmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prm"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prmPropertyTree!= null):((prmPropertyTree == null)||(!prmPropertyTree.isLeaf())))) {
            _other.prm = this.prm;
        }
    }

    public<_B >ElementType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ElementType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ElementType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ElementType.Builder<_B> copyOf(final ElementType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ElementType.Builder<_B> _newBuilder = new ElementType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ElementType.Builder<Void> copyExcept(final ElementType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ElementType.Builder<Void> copyOnly(final ElementType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public ElementType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String objtype;
        private String objname;
        private BigDecimal prm;

        public Builder(final _B _parentBuilder, final ElementType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.objtype = _other.objtype;
                this.objname = _other.objname;
                this.prm = _other.prm;
            }
        }

        public Builder(final _B _parentBuilder, final ElementType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
                    this.objtype = _other.objtype;
                }
                final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
                    this.objname = _other.objname;
                }
                final PropertyTree prmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("prm"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(prmPropertyTree!= null):((prmPropertyTree == null)||(!prmPropertyTree.isLeaf())))) {
                    this.prm = _other.prm;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends ElementType >_P init(final _P _product) {
            _product.objtype = this.objtype;
            _product.objname = this.objname;
            _product.prm = this.prm;
            return _product;
        }

        /**
         * Sets the new value of "objtype" (any previous value will be replaced)
         * 
         * @param objtype
         *     New value of the "objtype" property.
         */
        public ElementType.Builder<_B> withObjtype(final String objtype) {
            this.objtype = objtype;
            return this;
        }

        /**
         * Sets the new value of "objname" (any previous value will be replaced)
         * 
         * @param objname
         *     New value of the "objname" property.
         */
        public ElementType.Builder<_B> withObjname(final String objname) {
            this.objname = objname;
            return this;
        }

        /**
         * Sets the new value of "prm" (any previous value will be replaced)
         * 
         * @param prm
         *     New value of the "prm" property.
         */
        public ElementType.Builder<_B> withPrm(final BigDecimal prm) {
            this.prm = prm;
            return this;
        }

        @Override
        public ElementType build() {
            return this.init(new ElementType());
        }

        public ElementType.Builder<_B> copyOf(final ElementType _other) {
            _other.copyTo(this);
            return this;
        }

        public ElementType.Builder<_B> copyOf(final ElementType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String OBJTYPE = "objtype";
        public final static transient String OBJNAME = "objname";
        public final static transient String PRM = "prm";

    }

    public static class Select
        extends ElementType.Selector<ElementType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ElementType.Select _root() {
            return new ElementType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>> objtype = null;
        private com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>> objname = null;
        private com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>> prm = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.objtype!= null) {
                products.put("objtype", this.objtype.init());
            }
            if (this.objname!= null) {
                products.put("objname", this.objname.init());
            }
            if (this.prm!= null) {
                products.put("prm", this.prm.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>> objtype() {
            return ((this.objtype == null)?this.objtype = new com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>>(this._root, this, "objtype"):this.objtype);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>> objname() {
            return ((this.objname == null)?this.objname = new com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>>(this._root, this, "objname"):this.objname);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>> prm() {
            return ((this.prm == null)?this.prm = new com.kscs.util.jaxb.Selector<TRoot, ElementType.Selector<TRoot, TParent>>(this._root, this, "prm"):this.prm);
        }

    }

}
