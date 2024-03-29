//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.Copyable;
import com.kscs.util.jaxb.PartialCopyable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import com.kscs.util.jaxb.PropertyVisitor;


/**
 * <p>Java class for skinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="skinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="texcoord" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="material" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rgba" type="{attributeTypes}fourRealsType" default="0.5 0.5 0.5 1" /&gt;
 *       &lt;attribute name="inflate" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="subgrid" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skinType")
public class SkinType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "texcoord")
    protected Boolean texcoord;
    @XmlAttribute(name = "material")
    protected String material;
    @XmlAttribute(name = "rgba")
    protected String rgba;
    @XmlAttribute(name = "inflate")
    protected BigDecimal inflate;
    @XmlAttribute(name = "subgrid")
    protected Integer subgrid;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public SkinType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a SkinType copying the state of another SkinType
     * 
     * @param _other
     *     The original SkinType from which to copy state.
     */
    public SkinType(final SkinType _other) {
        this.texcoord = _other.texcoord;
        this.material = _other.material;
        this.rgba = _other.rgba;
        this.inflate = _other.inflate;
        this.subgrid = _other.subgrid;
    }

    /**
     * Instantiates a SkinType copying the state of another SkinType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original SkinType from which to copy state.
     */
    public SkinType(final SkinType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree texcoordPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texcoord"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texcoordPropertyTree!= null):((texcoordPropertyTree == null)||(!texcoordPropertyTree.isLeaf())))) {
            this.texcoord = _other.texcoord;
        }
        final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
            this.material = _other.material;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            this.rgba = _other.rgba;
        }
        final PropertyTree inflatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inflate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inflatePropertyTree!= null):((inflatePropertyTree == null)||(!inflatePropertyTree.isLeaf())))) {
            this.inflate = _other.inflate;
        }
        final PropertyTree subgridPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subgrid"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subgridPropertyTree!= null):((subgridPropertyTree == null)||(!subgridPropertyTree.isLeaf())))) {
            this.subgrid = _other.subgrid;
        }
    }

    /**
     * Gets the value of the texcoord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTexcoord() {
        if (texcoord == null) {
            return false;
        } else {
            return texcoord;
        }
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Gets the value of the rgba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgba() {
        if (rgba == null) {
            return "0.5 0.5 0.5 1";
        } else {
            return rgba;
        }
    }

    /**
     * Gets the value of the inflate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInflate() {
        if (inflate == null) {
            return new BigDecimal("0");
        } else {
            return inflate;
        }
    }

    /**
     * Gets the value of the subgrid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSubgrid() {
        if (subgrid == null) {
            return  0;
        } else {
            return subgrid;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public SkinType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public SkinType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setTexcoord(final Boolean value) {
        final Boolean __oldValue = this.texcoord;
        try {
            this.vetoableChange__Support.fireVetoableChange("texcoord", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.texcoord = value;
        this.propertyChange__Support.firePropertyChange("texcoord", __oldValue, value);
    }

    public void setMaterial(final String value) {
        final String __oldValue = this.material;
        try {
            this.vetoableChange__Support.fireVetoableChange("material", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.material = value;
        this.propertyChange__Support.firePropertyChange("material", __oldValue, value);
    }

    public void setRgba(final String value) {
        final String __oldValue = this.rgba;
        try {
            this.vetoableChange__Support.fireVetoableChange("rgba", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.rgba = value;
        this.propertyChange__Support.firePropertyChange("rgba", __oldValue, value);
    }

    public void setInflate(final BigDecimal value) {
        final BigDecimal __oldValue = this.inflate;
        try {
            this.vetoableChange__Support.fireVetoableChange("inflate", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.inflate = value;
        this.propertyChange__Support.firePropertyChange("inflate", __oldValue, value);
    }

    public void setSubgrid(final Integer value) {
        final Integer __oldValue = this.subgrid;
        try {
            this.vetoableChange__Support.fireVetoableChange("subgrid", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.subgrid = value;
        this.propertyChange__Support.firePropertyChange("subgrid", __oldValue, value);
    }

    @Override
    public SkinType clone() {
        final SkinType _newObject;
        try {
            _newObject = ((SkinType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public SkinType createCopy() {
        final SkinType _newObject;
        try {
            _newObject = ((SkinType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.texcoord = this.texcoord;
        _newObject.material = this.material;
        _newObject.rgba = this.rgba;
        _newObject.inflate = this.inflate;
        _newObject.subgrid = this.subgrid;
        return _newObject;
    }

    @Override
    public SkinType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SkinType _newObject;
        try {
            _newObject = ((SkinType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree texcoordPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texcoord"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texcoordPropertyTree!= null):((texcoordPropertyTree == null)||(!texcoordPropertyTree.isLeaf())))) {
            _newObject.texcoord = this.texcoord;
        }
        final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
            _newObject.material = this.material;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            _newObject.rgba = this.rgba;
        }
        final PropertyTree inflatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inflate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inflatePropertyTree!= null):((inflatePropertyTree == null)||(!inflatePropertyTree.isLeaf())))) {
            _newObject.inflate = this.inflate;
        }
        final PropertyTree subgridPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subgrid"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subgridPropertyTree!= null):((subgridPropertyTree == null)||(!subgridPropertyTree.isLeaf())))) {
            _newObject.subgrid = this.subgrid;
        }
        return _newObject;
    }

    @Override
    public SkinType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public SkinType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SkinType.Builder<_B> _other) {
        _other.texcoord = this.texcoord;
        _other.material = this.material;
        _other.rgba = this.rgba;
        _other.inflate = this.inflate;
        _other.subgrid = this.subgrid;
    }

    public<_B >SkinType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SkinType.Builder<_B>(_parentBuilder, this, true);
    }

    public SkinType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SkinType.Builder<Void> builder() {
        return new SkinType.Builder<Void>(null, null, false);
    }

    public static<_B >SkinType.Builder<_B> copyOf(final SkinType _other) {
        final SkinType.Builder<_B> _newBuilder = new SkinType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SkinType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree texcoordPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texcoord"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texcoordPropertyTree!= null):((texcoordPropertyTree == null)||(!texcoordPropertyTree.isLeaf())))) {
            _other.texcoord = this.texcoord;
        }
        final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
            _other.material = this.material;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            _other.rgba = this.rgba;
        }
        final PropertyTree inflatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inflate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inflatePropertyTree!= null):((inflatePropertyTree == null)||(!inflatePropertyTree.isLeaf())))) {
            _other.inflate = this.inflate;
        }
        final PropertyTree subgridPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subgrid"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subgridPropertyTree!= null):((subgridPropertyTree == null)||(!subgridPropertyTree.isLeaf())))) {
            _other.subgrid = this.subgrid;
        }
    }

    public<_B >SkinType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SkinType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SkinType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SkinType.Builder<_B> copyOf(final SkinType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SkinType.Builder<_B> _newBuilder = new SkinType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SkinType.Builder<Void> copyExcept(final SkinType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SkinType.Builder<Void> copyOnly(final SkinType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public SkinType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private Boolean texcoord;
        private String material;
        private String rgba;
        private BigDecimal inflate;
        private Integer subgrid;

        public Builder(final _B _parentBuilder, final SkinType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.texcoord = _other.texcoord;
                this.material = _other.material;
                this.rgba = _other.rgba;
                this.inflate = _other.inflate;
                this.subgrid = _other.subgrid;
            }
        }

        public Builder(final _B _parentBuilder, final SkinType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree texcoordPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texcoord"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texcoordPropertyTree!= null):((texcoordPropertyTree == null)||(!texcoordPropertyTree.isLeaf())))) {
                    this.texcoord = _other.texcoord;
                }
                final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
                    this.material = _other.material;
                }
                final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
                    this.rgba = _other.rgba;
                }
                final PropertyTree inflatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inflate"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inflatePropertyTree!= null):((inflatePropertyTree == null)||(!inflatePropertyTree.isLeaf())))) {
                    this.inflate = _other.inflate;
                }
                final PropertyTree subgridPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subgrid"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subgridPropertyTree!= null):((subgridPropertyTree == null)||(!subgridPropertyTree.isLeaf())))) {
                    this.subgrid = _other.subgrid;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends SkinType >_P init(final _P _product) {
            _product.texcoord = this.texcoord;
            _product.material = this.material;
            _product.rgba = this.rgba;
            _product.inflate = this.inflate;
            _product.subgrid = this.subgrid;
            return _product;
        }

        /**
         * Sets the new value of "texcoord" (any previous value will be replaced)
         * 
         * @param texcoord
         *     New value of the "texcoord" property.
         */
        public SkinType.Builder<_B> withTexcoord(final Boolean texcoord) {
            this.texcoord = texcoord;
            return this;
        }

        /**
         * Sets the new value of "material" (any previous value will be replaced)
         * 
         * @param material
         *     New value of the "material" property.
         */
        public SkinType.Builder<_B> withMaterial(final String material) {
            this.material = material;
            return this;
        }

        /**
         * Sets the new value of "rgba" (any previous value will be replaced)
         * 
         * @param rgba
         *     New value of the "rgba" property.
         */
        public SkinType.Builder<_B> withRgba(final String rgba) {
            this.rgba = rgba;
            return this;
        }

        /**
         * Sets the new value of "inflate" (any previous value will be replaced)
         * 
         * @param inflate
         *     New value of the "inflate" property.
         */
        public SkinType.Builder<_B> withInflate(final BigDecimal inflate) {
            this.inflate = inflate;
            return this;
        }

        /**
         * Sets the new value of "subgrid" (any previous value will be replaced)
         * 
         * @param subgrid
         *     New value of the "subgrid" property.
         */
        public SkinType.Builder<_B> withSubgrid(final Integer subgrid) {
            this.subgrid = subgrid;
            return this;
        }

        @Override
        public SkinType build() {
            return this.init(new SkinType());
        }

        public SkinType.Builder<_B> copyOf(final SkinType _other) {
            _other.copyTo(this);
            return this;
        }

        public SkinType.Builder<_B> copyOf(final SkinType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String TEXCOORD = "texcoord";
        public final static transient String MATERIAL = "material";
        public final static transient String RGBA = "rgba";
        public final static transient String INFLATE = "inflate";
        public final static transient String SUBGRID = "subgrid";

    }

    public static class Select
        extends SkinType.Selector<SkinType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SkinType.Select _root() {
            return new SkinType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> texcoord = null;
        private com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> material = null;
        private com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> rgba = null;
        private com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> inflate = null;
        private com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> subgrid = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.texcoord!= null) {
                products.put("texcoord", this.texcoord.init());
            }
            if (this.material!= null) {
                products.put("material", this.material.init());
            }
            if (this.rgba!= null) {
                products.put("rgba", this.rgba.init());
            }
            if (this.inflate!= null) {
                products.put("inflate", this.inflate.init());
            }
            if (this.subgrid!= null) {
                products.put("subgrid", this.subgrid.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> texcoord() {
            return ((this.texcoord == null)?this.texcoord = new com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>>(this._root, this, "texcoord"):this.texcoord);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> material() {
            return ((this.material == null)?this.material = new com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>>(this._root, this, "material"):this.material);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> rgba() {
            return ((this.rgba == null)?this.rgba = new com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>>(this._root, this, "rgba"):this.rgba);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> inflate() {
            return ((this.inflate == null)?this.inflate = new com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>>(this._root, this, "inflate"):this.inflate);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>> subgrid() {
            return ((this.subgrid == null)?this.subgrid = new com.kscs.util.jaxb.Selector<TRoot, SkinType.Selector<TRoot, TParent>>(this._root, this, "subgrid"):this.subgrid);
        }

    }

}
