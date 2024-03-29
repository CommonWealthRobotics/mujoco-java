//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.MuJoCoDefault;

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
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
 * <p>Java class for positionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{default}motorType"&gt;
 *       &lt;attribute name="kp" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionType")
public class PositionType
    extends MotorType
    implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "kp")
    protected BigDecimal kp;

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public PositionType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a PositionType copying the state of another PositionType
     * 
     * @param _other
     *     The original PositionType from which to copy state.
     */
    public PositionType(final PositionType _other) {
        super(_other);
        this.kp = _other.kp;
    }

    /**
     * Instantiates a PositionType copying the state of another PositionType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original PositionType from which to copy state.
     */
    public PositionType(final PositionType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree kpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kpPropertyTree!= null):((kpPropertyTree == null)||(!kpPropertyTree.isLeaf())))) {
            this.kp = _other.kp;
        }
    }

    /**
     * Gets the value of the kp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKp() {
        if (kp == null) {
            return new BigDecimal("1");
        } else {
            return kp;
        }
    }

    @Override
    public PositionType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    @Override
    public PositionType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setKp(final BigDecimal value) {
        final BigDecimal __oldValue = this.kp;
        try {
            this.vetoableChange__Support.fireVetoableChange("kp", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.kp = value;
        this.propertyChange__Support.firePropertyChange("kp", __oldValue, value);
    }

    @Override
    public PositionType clone() {
        final PositionType _newObject;
        _newObject = ((PositionType) super.clone());
        return _newObject;
    }

    @Override
    public PositionType createCopy() {
        final PositionType _newObject = ((PositionType) super.createCopy());
        _newObject.kp = this.kp;
        return _newObject;
    }

    @Override
    public PositionType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PositionType _newObject = ((PositionType) super.createCopy(_propertyTree, _propertyTreeUse));
        final PropertyTree kpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kpPropertyTree!= null):((kpPropertyTree == null)||(!kpPropertyTree.isLeaf())))) {
            _newObject.kp = this.kp;
        }
        return _newObject;
    }

    @Override
    public PositionType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public PositionType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PositionType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.kp = this.kp;
    }

    @Override
    public<_B >PositionType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PositionType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public PositionType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PositionType.Builder<Void> builder() {
        return new PositionType.Builder<Void>(null, null, false);
    }

    public static<_B >PositionType.Builder<_B> copyOf(final MotorType _other) {
        final PositionType.Builder<_B> _newBuilder = new PositionType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >PositionType.Builder<_B> copyOf(final PositionType _other) {
        final PositionType.Builder<_B> _newBuilder = new PositionType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PositionType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree kpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kpPropertyTree!= null):((kpPropertyTree == null)||(!kpPropertyTree.isLeaf())))) {
            _other.kp = this.kp;
        }
    }

    @Override
    public<_B >PositionType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PositionType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public PositionType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PositionType.Builder<_B> copyOf(final MotorType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PositionType.Builder<_B> _newBuilder = new PositionType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >PositionType.Builder<_B> copyOf(final PositionType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PositionType.Builder<_B> _newBuilder = new PositionType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PositionType.Builder<Void> copyExcept(final MotorType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PositionType.Builder<Void> copyExcept(final PositionType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PositionType.Builder<Void> copyOnly(final MotorType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static PositionType.Builder<Void> copyOnly(final PositionType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public PositionType visit(final PropertyVisitor _visitor_) {
        super.visit(_visitor_);
        return this;
    }

    public static class Builder<_B >
        extends MotorType.Builder<_B>
        implements Buildable
    {

        private BigDecimal kp;

        public Builder(final _B _parentBuilder, final PositionType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.kp = _other.kp;
            }
        }

        public Builder(final _B _parentBuilder, final PositionType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree kpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kp"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kpPropertyTree!= null):((kpPropertyTree == null)||(!kpPropertyTree.isLeaf())))) {
                    this.kp = _other.kp;
                }
            }
        }

        protected<_P extends PositionType >_P init(final _P _product) {
            _product.kp = this.kp;
            return super.init(_product);
        }

        /**
         * Sets the new value of "kp" (any previous value will be replaced)
         * 
         * @param kp
         *     New value of the "kp" property.
         */
        public PositionType.Builder<_B> withKp(final BigDecimal kp) {
            this.kp = kp;
            return this;
        }

        /**
         * Sets the new value of "group" (any previous value will be replaced)
         * 
         * @param group
         *     New value of the "group" property.
         */
        @Override
        public PositionType.Builder<_B> withGroup(final Integer group) {
            super.withGroup(group);
            return this;
        }

        /**
         * Sets the new value of "ctrllimited" (any previous value will be replaced)
         * 
         * @param ctrllimited
         *     New value of the "ctrllimited" property.
         */
        @Override
        public PositionType.Builder<_B> withCtrllimited(final Boolean ctrllimited) {
            super.withCtrllimited(ctrllimited);
            return this;
        }

        /**
         * Sets the new value of "forcelimited" (any previous value will be replaced)
         * 
         * @param forcelimited
         *     New value of the "forcelimited" property.
         */
        @Override
        public PositionType.Builder<_B> withForcelimited(final Boolean forcelimited) {
            super.withForcelimited(forcelimited);
            return this;
        }

        /**
         * Sets the new value of "ctrlrange" (any previous value will be replaced)
         * 
         * @param ctrlrange
         *     New value of the "ctrlrange" property.
         */
        @Override
        public PositionType.Builder<_B> withCtrlrange(final String ctrlrange) {
            super.withCtrlrange(ctrlrange);
            return this;
        }

        /**
         * Sets the new value of "forcerange" (any previous value will be replaced)
         * 
         * @param forcerange
         *     New value of the "forcerange" property.
         */
        @Override
        public PositionType.Builder<_B> withForcerange(final String forcerange) {
            super.withForcerange(forcerange);
            return this;
        }

        /**
         * Sets the new value of "lengthrange" (any previous value will be replaced)
         * 
         * @param lengthrange
         *     New value of the "lengthrange" property.
         */
        @Override
        public PositionType.Builder<_B> withLengthrange(final String lengthrange) {
            super.withLengthrange(lengthrange);
            return this;
        }

        /**
         * Sets the new value of "gear" (any previous value will be replaced)
         * 
         * @param gear
         *     New value of the "gear" property.
         */
        @Override
        public PositionType.Builder<_B> withGear(final String gear) {
            super.withGear(gear);
            return this;
        }

        /**
         * Sets the new value of "cranklength" (any previous value will be replaced)
         * 
         * @param cranklength
         *     New value of the "cranklength" property.
         */
        @Override
        public PositionType.Builder<_B> withCranklength(final BigDecimal cranklength) {
            super.withCranklength(cranklength);
            return this;
        }

        /**
         * Sets the new value of "user" (any previous value will be replaced)
         * 
         * @param user
         *     New value of the "user" property.
         */
        @Override
        public PositionType.Builder<_B> withUser(final String user) {
            super.withUser(user);
            return this;
        }

        @Override
        public PositionType build() {
            return this.init(new PositionType());
        }

        public PositionType.Builder<_B> copyOf(final PositionType _other) {
            _other.copyTo(this);
            return this;
        }

        public PositionType.Builder<_B> copyOf(final PositionType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String KP = "kp";

    }

    public static class Select
        extends PositionType.Selector<PositionType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PositionType.Select _root() {
            return new PositionType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MotorType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PositionType.Selector<TRoot, TParent>> kp = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.kp!= null) {
                products.put("kp", this.kp.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PositionType.Selector<TRoot, TParent>> kp() {
            return ((this.kp == null)?this.kp = new com.kscs.util.jaxb.Selector<TRoot, PositionType.Selector<TRoot, TParent>>(this._root, this, "kp"):this.kp);
        }

    }

}
