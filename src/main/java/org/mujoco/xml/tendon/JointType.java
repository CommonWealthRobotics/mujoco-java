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
 * <p>Java class for jointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="coef" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jointType")
public class JointType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "joint", required = true)
    protected String joint;
    @XmlAttribute(name = "coef", required = true)
    protected BigDecimal coef;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public JointType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a JointType copying the state of another JointType
     * 
     * @param _other
     *     The original JointType from which to copy state.
     */
    public JointType(final JointType _other) {
        this.joint = _other.joint;
        this.coef = _other.coef;
    }

    /**
     * Instantiates a JointType copying the state of another JointType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original JointType from which to copy state.
     */
    public JointType(final JointType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("joint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jointPropertyTree!= null):((jointPropertyTree == null)||(!jointPropertyTree.isLeaf())))) {
            this.joint = _other.joint;
        }
        final PropertyTree coefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("coef"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(coefPropertyTree!= null):((coefPropertyTree == null)||(!coefPropertyTree.isLeaf())))) {
            this.coef = _other.coef;
        }
    }

    /**
     * Gets the value of the joint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoint() {
        return joint;
    }

    /**
     * Gets the value of the coef property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoef() {
        return coef;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public JointType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public JointType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setJoint(final String value) {
        final String __oldValue = this.joint;
        try {
            this.vetoableChange__Support.fireVetoableChange("joint", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.joint = value;
        this.propertyChange__Support.firePropertyChange("joint", __oldValue, value);
    }

    public void setCoef(final BigDecimal value) {
        final BigDecimal __oldValue = this.coef;
        try {
            this.vetoableChange__Support.fireVetoableChange("coef", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.coef = value;
        this.propertyChange__Support.firePropertyChange("coef", __oldValue, value);
    }

    @Override
    public JointType clone() {
        final JointType _newObject;
        try {
            _newObject = ((JointType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public JointType createCopy() {
        final JointType _newObject;
        try {
            _newObject = ((JointType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.joint = this.joint;
        _newObject.coef = this.coef;
        return _newObject;
    }

    @Override
    public JointType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JointType _newObject;
        try {
            _newObject = ((JointType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree jointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("joint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jointPropertyTree!= null):((jointPropertyTree == null)||(!jointPropertyTree.isLeaf())))) {
            _newObject.joint = this.joint;
        }
        final PropertyTree coefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("coef"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(coefPropertyTree!= null):((coefPropertyTree == null)||(!coefPropertyTree.isLeaf())))) {
            _newObject.coef = this.coef;
        }
        return _newObject;
    }

    @Override
    public JointType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public JointType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final JointType.Builder<_B> _other) {
        _other.joint = this.joint;
        _other.coef = this.coef;
    }

    public<_B >JointType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new JointType.Builder<_B>(_parentBuilder, this, true);
    }

    public JointType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static JointType.Builder<Void> builder() {
        return new JointType.Builder<Void>(null, null, false);
    }

    public static<_B >JointType.Builder<_B> copyOf(final JointType _other) {
        final JointType.Builder<_B> _newBuilder = new JointType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final JointType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("joint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jointPropertyTree!= null):((jointPropertyTree == null)||(!jointPropertyTree.isLeaf())))) {
            _other.joint = this.joint;
        }
        final PropertyTree coefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("coef"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(coefPropertyTree!= null):((coefPropertyTree == null)||(!coefPropertyTree.isLeaf())))) {
            _other.coef = this.coef;
        }
    }

    public<_B >JointType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new JointType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public JointType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >JointType.Builder<_B> copyOf(final JointType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JointType.Builder<_B> _newBuilder = new JointType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static JointType.Builder<Void> copyExcept(final JointType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JointType.Builder<Void> copyOnly(final JointType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public JointType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String joint;
        private BigDecimal coef;

        public Builder(final _B _parentBuilder, final JointType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.joint = _other.joint;
                this.coef = _other.coef;
            }
        }

        public Builder(final _B _parentBuilder, final JointType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree jointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("joint"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jointPropertyTree!= null):((jointPropertyTree == null)||(!jointPropertyTree.isLeaf())))) {
                    this.joint = _other.joint;
                }
                final PropertyTree coefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("coef"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(coefPropertyTree!= null):((coefPropertyTree == null)||(!coefPropertyTree.isLeaf())))) {
                    this.coef = _other.coef;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends JointType >_P init(final _P _product) {
            _product.joint = this.joint;
            _product.coef = this.coef;
            return _product;
        }

        /**
         * Sets the new value of "joint" (any previous value will be replaced)
         * 
         * @param joint
         *     New value of the "joint" property.
         */
        public JointType.Builder<_B> withJoint(final String joint) {
            this.joint = joint;
            return this;
        }

        /**
         * Sets the new value of "coef" (any previous value will be replaced)
         * 
         * @param coef
         *     New value of the "coef" property.
         */
        public JointType.Builder<_B> withCoef(final BigDecimal coef) {
            this.coef = coef;
            return this;
        }

        @Override
        public JointType build() {
            return this.init(new JointType());
        }

        public JointType.Builder<_B> copyOf(final JointType _other) {
            _other.copyTo(this);
            return this;
        }

        public JointType.Builder<_B> copyOf(final JointType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String JOINT = "joint";
        public final static transient String COEF = "coef";

    }

    public static class Select
        extends JointType.Selector<JointType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static JointType.Select _root() {
            return new JointType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, JointType.Selector<TRoot, TParent>> joint = null;
        private com.kscs.util.jaxb.Selector<TRoot, JointType.Selector<TRoot, TParent>> coef = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.joint!= null) {
                products.put("joint", this.joint.init());
            }
            if (this.coef!= null) {
                products.put("coef", this.coef.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, JointType.Selector<TRoot, TParent>> joint() {
            return ((this.joint == null)?this.joint = new com.kscs.util.jaxb.Selector<TRoot, JointType.Selector<TRoot, TParent>>(this._root, this, "joint"):this.joint);
        }

        public com.kscs.util.jaxb.Selector<TRoot, JointType.Selector<TRoot, TParent>> coef() {
            return ((this.coef == null)?this.coef = new com.kscs.util.jaxb.Selector<TRoot, JointType.Selector<TRoot, TParent>>(this._root, this, "coef"):this.coef);
        }

    }

}
