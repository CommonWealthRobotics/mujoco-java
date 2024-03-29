//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.root;

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
 * <p>Java class for includeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="includeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "includeType")
public class IncludeType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "file", required = true)
    protected String file;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public IncludeType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a IncludeType copying the state of another IncludeType
     * 
     * @param _other
     *     The original IncludeType from which to copy state.
     */
    public IncludeType(final IncludeType _other) {
        this.file = _other.file;
    }

    /**
     * Instantiates a IncludeType copying the state of another IncludeType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original IncludeType from which to copy state.
     */
    public IncludeType(final IncludeType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree filePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("file"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filePropertyTree!= null):((filePropertyTree == null)||(!filePropertyTree.isLeaf())))) {
            this.file = _other.file;
        }
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

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public IncludeType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public IncludeType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setFile(final String value) {
        final String __oldValue = this.file;
        try {
            this.vetoableChange__Support.fireVetoableChange("file", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.file = value;
        this.propertyChange__Support.firePropertyChange("file", __oldValue, value);
    }

    @Override
    public IncludeType clone() {
        final IncludeType _newObject;
        try {
            _newObject = ((IncludeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public IncludeType createCopy() {
        final IncludeType _newObject;
        try {
            _newObject = ((IncludeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.file = this.file;
        return _newObject;
    }

    @Override
    public IncludeType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final IncludeType _newObject;
        try {
            _newObject = ((IncludeType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree filePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("file"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filePropertyTree!= null):((filePropertyTree == null)||(!filePropertyTree.isLeaf())))) {
            _newObject.file = this.file;
        }
        return _newObject;
    }

    @Override
    public IncludeType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public IncludeType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final IncludeType.Builder<_B> _other) {
        _other.file = this.file;
    }

    public<_B >IncludeType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new IncludeType.Builder<_B>(_parentBuilder, this, true);
    }

    public IncludeType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static IncludeType.Builder<Void> builder() {
        return new IncludeType.Builder<Void>(null, null, false);
    }

    public static<_B >IncludeType.Builder<_B> copyOf(final IncludeType _other) {
        final IncludeType.Builder<_B> _newBuilder = new IncludeType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final IncludeType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree filePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("file"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filePropertyTree!= null):((filePropertyTree == null)||(!filePropertyTree.isLeaf())))) {
            _other.file = this.file;
        }
    }

    public<_B >IncludeType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new IncludeType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public IncludeType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >IncludeType.Builder<_B> copyOf(final IncludeType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final IncludeType.Builder<_B> _newBuilder = new IncludeType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static IncludeType.Builder<Void> copyExcept(final IncludeType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static IncludeType.Builder<Void> copyOnly(final IncludeType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public IncludeType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String file;

        public Builder(final _B _parentBuilder, final IncludeType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.file = _other.file;
            }
        }

        public Builder(final _B _parentBuilder, final IncludeType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree filePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("file"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filePropertyTree!= null):((filePropertyTree == null)||(!filePropertyTree.isLeaf())))) {
                    this.file = _other.file;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends IncludeType >_P init(final _P _product) {
            _product.file = this.file;
            return _product;
        }

        /**
         * Sets the new value of "file" (any previous value will be replaced)
         * 
         * @param file
         *     New value of the "file" property.
         */
        public IncludeType.Builder<_B> withFile(final String file) {
            this.file = file;
            return this;
        }

        @Override
        public IncludeType build() {
            return this.init(new IncludeType());
        }

        public IncludeType.Builder<_B> copyOf(final IncludeType _other) {
            _other.copyTo(this);
            return this;
        }

        public IncludeType.Builder<_B> copyOf(final IncludeType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String FILE = "file";

    }

    public static class Select
        extends IncludeType.Selector<IncludeType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static IncludeType.Select _root() {
            return new IncludeType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, IncludeType.Selector<TRoot, TParent>> file = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.file!= null) {
                products.put("file", this.file.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, IncludeType.Selector<TRoot, TParent>> file() {
            return ((this.file == null)?this.file = new com.kscs.util.jaxb.Selector<TRoot, IncludeType.Selector<TRoot, TParent>>(this._root, this, "file"):this.file);
        }

    }

}
