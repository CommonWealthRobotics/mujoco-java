//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:32:01 PM EDT 
//


package org.mujoco.xml.tendon;

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
 * <p>Java class for geomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geomType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="geom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sidesite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geomType")
public class GeomType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "geom", required = true)
    protected String geom;
    @XmlAttribute(name = "sidesite")
    protected String sidesite;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public GeomType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a GeomType copying the state of another GeomType
     * 
     * @param _other
     *     The original GeomType from which to copy state.
     */
    public GeomType(final GeomType _other) {
        this.geom = _other.geom;
        this.sidesite = _other.sidesite;
    }

    /**
     * Instantiates a GeomType copying the state of another GeomType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original GeomType from which to copy state.
     */
    public GeomType(final GeomType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree geomPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geomPropertyTree!= null):((geomPropertyTree == null)||(!geomPropertyTree.isLeaf())))) {
            this.geom = _other.geom;
        }
        final PropertyTree sidesitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sidesite"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sidesitePropertyTree!= null):((sidesitePropertyTree == null)||(!sidesitePropertyTree.isLeaf())))) {
            this.sidesite = _other.sidesite;
        }
    }

    /**
     * Gets the value of the geom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeom() {
        return geom;
    }

    /**
     * Gets the value of the sidesite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidesite() {
        return sidesite;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public GeomType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public GeomType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setGeom(final String value) {
        final String __oldValue = this.geom;
        try {
            this.vetoableChange__Support.fireVetoableChange("geom", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.geom = value;
        this.propertyChange__Support.firePropertyChange("geom", __oldValue, value);
    }

    public void setSidesite(final String value) {
        final String __oldValue = this.sidesite;
        try {
            this.vetoableChange__Support.fireVetoableChange("sidesite", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.sidesite = value;
        this.propertyChange__Support.firePropertyChange("sidesite", __oldValue, value);
    }

    @Override
    public GeomType clone() {
        final GeomType _newObject;
        try {
            _newObject = ((GeomType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public GeomType createCopy() {
        final GeomType _newObject;
        try {
            _newObject = ((GeomType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.geom = this.geom;
        _newObject.sidesite = this.sidesite;
        return _newObject;
    }

    @Override
    public GeomType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GeomType _newObject;
        try {
            _newObject = ((GeomType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree geomPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geomPropertyTree!= null):((geomPropertyTree == null)||(!geomPropertyTree.isLeaf())))) {
            _newObject.geom = this.geom;
        }
        final PropertyTree sidesitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sidesite"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sidesitePropertyTree!= null):((sidesitePropertyTree == null)||(!sidesitePropertyTree.isLeaf())))) {
            _newObject.sidesite = this.sidesite;
        }
        return _newObject;
    }

    @Override
    public GeomType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public GeomType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GeomType.Builder<_B> _other) {
        _other.geom = this.geom;
        _other.sidesite = this.sidesite;
    }

    public<_B >GeomType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new GeomType.Builder<_B>(_parentBuilder, this, true);
    }

    public GeomType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static GeomType.Builder<Void> builder() {
        return new GeomType.Builder<Void>(null, null, false);
    }

    public static<_B >GeomType.Builder<_B> copyOf(final GeomType _other) {
        final GeomType.Builder<_B> _newBuilder = new GeomType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GeomType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree geomPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geomPropertyTree!= null):((geomPropertyTree == null)||(!geomPropertyTree.isLeaf())))) {
            _other.geom = this.geom;
        }
        final PropertyTree sidesitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sidesite"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sidesitePropertyTree!= null):((sidesitePropertyTree == null)||(!sidesitePropertyTree.isLeaf())))) {
            _other.sidesite = this.sidesite;
        }
    }

    public<_B >GeomType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new GeomType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public GeomType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >GeomType.Builder<_B> copyOf(final GeomType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GeomType.Builder<_B> _newBuilder = new GeomType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static GeomType.Builder<Void> copyExcept(final GeomType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static GeomType.Builder<Void> copyOnly(final GeomType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public GeomType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String geom;
        private String sidesite;

        public Builder(final _B _parentBuilder, final GeomType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.geom = _other.geom;
                this.sidesite = _other.sidesite;
            }
        }

        public Builder(final _B _parentBuilder, final GeomType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree geomPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geomPropertyTree!= null):((geomPropertyTree == null)||(!geomPropertyTree.isLeaf())))) {
                    this.geom = _other.geom;
                }
                final PropertyTree sidesitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sidesite"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sidesitePropertyTree!= null):((sidesitePropertyTree == null)||(!sidesitePropertyTree.isLeaf())))) {
                    this.sidesite = _other.sidesite;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends GeomType >_P init(final _P _product) {
            _product.geom = this.geom;
            _product.sidesite = this.sidesite;
            return _product;
        }

        /**
         * Sets the new value of "geom" (any previous value will be replaced)
         * 
         * @param geom
         *     New value of the "geom" property.
         */
        public GeomType.Builder<_B> withGeom(final String geom) {
            this.geom = geom;
            return this;
        }

        /**
         * Sets the new value of "sidesite" (any previous value will be replaced)
         * 
         * @param sidesite
         *     New value of the "sidesite" property.
         */
        public GeomType.Builder<_B> withSidesite(final String sidesite) {
            this.sidesite = sidesite;
            return this;
        }

        @Override
        public GeomType build() {
            return this.init(new GeomType());
        }

        public GeomType.Builder<_B> copyOf(final GeomType _other) {
            _other.copyTo(this);
            return this;
        }

        public GeomType.Builder<_B> copyOf(final GeomType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String GEOM = "geom";
        public final static transient String SIDESITE = "sidesite";

    }

    public static class Select
        extends GeomType.Selector<GeomType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static GeomType.Select _root() {
            return new GeomType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, GeomType.Selector<TRoot, TParent>> geom = null;
        private com.kscs.util.jaxb.Selector<TRoot, GeomType.Selector<TRoot, TParent>> sidesite = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.geom!= null) {
                products.put("geom", this.geom.init());
            }
            if (this.sidesite!= null) {
                products.put("sidesite", this.sidesite.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, GeomType.Selector<TRoot, TParent>> geom() {
            return ((this.geom == null)?this.geom = new com.kscs.util.jaxb.Selector<TRoot, GeomType.Selector<TRoot, TParent>>(this._root, this, "geom"):this.geom);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GeomType.Selector<TRoot, TParent>> sidesite() {
            return ((this.sidesite == null)?this.sidesite = new com.kscs.util.jaxb.Selector<TRoot, GeomType.Selector<TRoot, TParent>>(this._root, this, "sidesite"):this.sidesite);
        }

    }

}
