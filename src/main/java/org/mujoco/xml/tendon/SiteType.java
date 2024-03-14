//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:45:57 PM EDT 
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
 * <p>Java class for siteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="site" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siteType")
public class SiteType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "site", required = true)
    protected String site;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public SiteType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a SiteType copying the state of another SiteType
     * 
     * @param _other
     *     The original SiteType from which to copy state.
     */
    public SiteType(final SiteType _other) {
        this.site = _other.site;
    }

    /**
     * Instantiates a SiteType copying the state of another SiteType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original SiteType from which to copy state.
     */
    public SiteType(final SiteType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("site"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sitePropertyTree!= null):((sitePropertyTree == null)||(!sitePropertyTree.isLeaf())))) {
            this.site = _other.site;
        }
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public SiteType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public SiteType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setSite(final String value) {
        final String __oldValue = this.site;
        try {
            this.vetoableChange__Support.fireVetoableChange("site", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.site = value;
        this.propertyChange__Support.firePropertyChange("site", __oldValue, value);
    }

    @Override
    public SiteType clone() {
        final SiteType _newObject;
        try {
            _newObject = ((SiteType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public SiteType createCopy() {
        final SiteType _newObject;
        try {
            _newObject = ((SiteType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.site = this.site;
        return _newObject;
    }

    @Override
    public SiteType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SiteType _newObject;
        try {
            _newObject = ((SiteType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree sitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("site"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sitePropertyTree!= null):((sitePropertyTree == null)||(!sitePropertyTree.isLeaf())))) {
            _newObject.site = this.site;
        }
        return _newObject;
    }

    @Override
    public SiteType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public SiteType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SiteType.Builder<_B> _other) {
        _other.site = this.site;
    }

    public<_B >SiteType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SiteType.Builder<_B>(_parentBuilder, this, true);
    }

    public SiteType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SiteType.Builder<Void> builder() {
        return new SiteType.Builder<Void>(null, null, false);
    }

    public static<_B >SiteType.Builder<_B> copyOf(final SiteType _other) {
        final SiteType.Builder<_B> _newBuilder = new SiteType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SiteType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("site"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sitePropertyTree!= null):((sitePropertyTree == null)||(!sitePropertyTree.isLeaf())))) {
            _other.site = this.site;
        }
    }

    public<_B >SiteType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SiteType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SiteType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SiteType.Builder<_B> copyOf(final SiteType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SiteType.Builder<_B> _newBuilder = new SiteType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SiteType.Builder<Void> copyExcept(final SiteType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SiteType.Builder<Void> copyOnly(final SiteType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public SiteType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String site;

        public Builder(final _B _parentBuilder, final SiteType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.site = _other.site;
            }
        }

        public Builder(final _B _parentBuilder, final SiteType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree sitePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("site"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sitePropertyTree!= null):((sitePropertyTree == null)||(!sitePropertyTree.isLeaf())))) {
                    this.site = _other.site;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends SiteType >_P init(final _P _product) {
            _product.site = this.site;
            return _product;
        }

        /**
         * Sets the new value of "site" (any previous value will be replaced)
         * 
         * @param site
         *     New value of the "site" property.
         */
        public SiteType.Builder<_B> withSite(final String site) {
            this.site = site;
            return this;
        }

        @Override
        public SiteType build() {
            return this.init(new SiteType());
        }

        public SiteType.Builder<_B> copyOf(final SiteType _other) {
            _other.copyTo(this);
            return this;
        }

        public SiteType.Builder<_B> copyOf(final SiteType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String SITE = "site";

    }

    public static class Select
        extends SiteType.Selector<SiteType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SiteType.Select _root() {
            return new SiteType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SiteType.Selector<TRoot, TParent>> site = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.site!= null) {
                products.put("site", this.site.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SiteType.Selector<TRoot, TParent>> site() {
            return ((this.site == null)?this.site = new com.kscs.util.jaxb.Selector<TRoot, SiteType.Selector<TRoot, TParent>>(this._root, this, "site"):this.site);
        }

    }

}
