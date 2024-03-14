//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.14 at 02:05:12 PM EDT 
//


package org.mujoco.xml.MuJoCoDefault;

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
 * <p>Java class for pairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pairType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="condim" type="{http://www.w3.org/2001/XMLSchema}int" default="3" /&gt;
 *       &lt;attribute name="friction" type="{attributeTypes}fiveRealsType" default="1 1 0.005 0.0001 0.0001" /&gt;
 *       &lt;attribute name="solimp" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" /&gt;
 *       &lt;attribute name="solref" type="{attributeTypes}twoRealsType" default="0.02 1" /&gt;
 *       &lt;attribute name="margin" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="gap" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pairType")
public class PairType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "condim")
    protected Integer condim;
    @XmlAttribute(name = "friction")
    protected String friction;
    @XmlAttribute(name = "solimp")
    protected String solimp;
    @XmlAttribute(name = "solref")
    protected String solref;
    @XmlAttribute(name = "margin")
    protected BigDecimal margin;
    @XmlAttribute(name = "gap")
    protected BigDecimal gap;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public PairType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a PairType copying the state of another PairType
     * 
     * @param _other
     *     The original PairType from which to copy state.
     */
    public PairType(final PairType _other) {
        this.condim = _other.condim;
        this.friction = _other.friction;
        this.solimp = _other.solimp;
        this.solref = _other.solref;
        this.margin = _other.margin;
        this.gap = _other.gap;
    }

    /**
     * Instantiates a PairType copying the state of another PairType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original PairType from which to copy state.
     */
    public PairType(final PairType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree condimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("condim"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(condimPropertyTree!= null):((condimPropertyTree == null)||(!condimPropertyTree.isLeaf())))) {
            this.condim = _other.condim;
        }
        final PropertyTree frictionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("friction"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(frictionPropertyTree!= null):((frictionPropertyTree == null)||(!frictionPropertyTree.isLeaf())))) {
            this.friction = _other.friction;
        }
        final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
            this.solimp = _other.solimp;
        }
        final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
            this.solref = _other.solref;
        }
        final PropertyTree marginPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("margin"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(marginPropertyTree!= null):((marginPropertyTree == null)||(!marginPropertyTree.isLeaf())))) {
            this.margin = _other.margin;
        }
        final PropertyTree gapPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gap"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gapPropertyTree!= null):((gapPropertyTree == null)||(!gapPropertyTree.isLeaf())))) {
            this.gap = _other.gap;
        }
    }

    /**
     * Gets the value of the condim property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCondim() {
        if (condim == null) {
            return  3;
        } else {
            return condim;
        }
    }

    /**
     * Gets the value of the friction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriction() {
        if (friction == null) {
            return "1 1 0.005 0.0001 0.0001";
        } else {
            return friction;
        }
    }

    /**
     * Gets the value of the solimp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimp() {
        if (solimp == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimp;
        }
    }

    /**
     * Gets the value of the solref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolref() {
        if (solref == null) {
            return "0.02 1";
        } else {
            return solref;
        }
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        if (margin == null) {
            return new BigDecimal("0");
        } else {
            return margin;
        }
    }

    /**
     * Gets the value of the gap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGap() {
        if (gap == null) {
            return new BigDecimal("0");
        } else {
            return gap;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public PairType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public PairType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setCondim(final Integer value) {
        final Integer __oldValue = this.condim;
        try {
            this.vetoableChange__Support.fireVetoableChange("condim", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.condim = value;
        this.propertyChange__Support.firePropertyChange("condim", __oldValue, value);
    }

    public void setFriction(final String value) {
        final String __oldValue = this.friction;
        try {
            this.vetoableChange__Support.fireVetoableChange("friction", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.friction = value;
        this.propertyChange__Support.firePropertyChange("friction", __oldValue, value);
    }

    public void setSolimp(final String value) {
        final String __oldValue = this.solimp;
        try {
            this.vetoableChange__Support.fireVetoableChange("solimp", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.solimp = value;
        this.propertyChange__Support.firePropertyChange("solimp", __oldValue, value);
    }

    public void setSolref(final String value) {
        final String __oldValue = this.solref;
        try {
            this.vetoableChange__Support.fireVetoableChange("solref", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.solref = value;
        this.propertyChange__Support.firePropertyChange("solref", __oldValue, value);
    }

    public void setMargin(final BigDecimal value) {
        final BigDecimal __oldValue = this.margin;
        try {
            this.vetoableChange__Support.fireVetoableChange("margin", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.margin = value;
        this.propertyChange__Support.firePropertyChange("margin", __oldValue, value);
    }

    public void setGap(final BigDecimal value) {
        final BigDecimal __oldValue = this.gap;
        try {
            this.vetoableChange__Support.fireVetoableChange("gap", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.gap = value;
        this.propertyChange__Support.firePropertyChange("gap", __oldValue, value);
    }

    @Override
    public PairType clone() {
        final PairType _newObject;
        try {
            _newObject = ((PairType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public PairType createCopy() {
        final PairType _newObject;
        try {
            _newObject = ((PairType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.condim = this.condim;
        _newObject.friction = this.friction;
        _newObject.solimp = this.solimp;
        _newObject.solref = this.solref;
        _newObject.margin = this.margin;
        _newObject.gap = this.gap;
        return _newObject;
    }

    @Override
    public PairType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PairType _newObject;
        try {
            _newObject = ((PairType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree condimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("condim"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(condimPropertyTree!= null):((condimPropertyTree == null)||(!condimPropertyTree.isLeaf())))) {
            _newObject.condim = this.condim;
        }
        final PropertyTree frictionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("friction"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(frictionPropertyTree!= null):((frictionPropertyTree == null)||(!frictionPropertyTree.isLeaf())))) {
            _newObject.friction = this.friction;
        }
        final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
            _newObject.solimp = this.solimp;
        }
        final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
            _newObject.solref = this.solref;
        }
        final PropertyTree marginPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("margin"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(marginPropertyTree!= null):((marginPropertyTree == null)||(!marginPropertyTree.isLeaf())))) {
            _newObject.margin = this.margin;
        }
        final PropertyTree gapPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gap"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gapPropertyTree!= null):((gapPropertyTree == null)||(!gapPropertyTree.isLeaf())))) {
            _newObject.gap = this.gap;
        }
        return _newObject;
    }

    @Override
    public PairType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public PairType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PairType.Builder<_B> _other) {
        _other.condim = this.condim;
        _other.friction = this.friction;
        _other.solimp = this.solimp;
        _other.solref = this.solref;
        _other.margin = this.margin;
        _other.gap = this.gap;
    }

    public<_B >PairType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PairType.Builder<_B>(_parentBuilder, this, true);
    }

    public PairType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PairType.Builder<Void> builder() {
        return new PairType.Builder<Void>(null, null, false);
    }

    public static<_B >PairType.Builder<_B> copyOf(final PairType _other) {
        final PairType.Builder<_B> _newBuilder = new PairType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PairType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree condimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("condim"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(condimPropertyTree!= null):((condimPropertyTree == null)||(!condimPropertyTree.isLeaf())))) {
            _other.condim = this.condim;
        }
        final PropertyTree frictionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("friction"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(frictionPropertyTree!= null):((frictionPropertyTree == null)||(!frictionPropertyTree.isLeaf())))) {
            _other.friction = this.friction;
        }
        final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
            _other.solimp = this.solimp;
        }
        final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
            _other.solref = this.solref;
        }
        final PropertyTree marginPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("margin"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(marginPropertyTree!= null):((marginPropertyTree == null)||(!marginPropertyTree.isLeaf())))) {
            _other.margin = this.margin;
        }
        final PropertyTree gapPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gap"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gapPropertyTree!= null):((gapPropertyTree == null)||(!gapPropertyTree.isLeaf())))) {
            _other.gap = this.gap;
        }
    }

    public<_B >PairType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PairType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PairType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PairType.Builder<_B> copyOf(final PairType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PairType.Builder<_B> _newBuilder = new PairType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PairType.Builder<Void> copyExcept(final PairType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PairType.Builder<Void> copyOnly(final PairType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public PairType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private Integer condim;
        private String friction;
        private String solimp;
        private String solref;
        private BigDecimal margin;
        private BigDecimal gap;

        public Builder(final _B _parentBuilder, final PairType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.condim = _other.condim;
                this.friction = _other.friction;
                this.solimp = _other.solimp;
                this.solref = _other.solref;
                this.margin = _other.margin;
                this.gap = _other.gap;
            }
        }

        public Builder(final _B _parentBuilder, final PairType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree condimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("condim"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(condimPropertyTree!= null):((condimPropertyTree == null)||(!condimPropertyTree.isLeaf())))) {
                    this.condim = _other.condim;
                }
                final PropertyTree frictionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("friction"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(frictionPropertyTree!= null):((frictionPropertyTree == null)||(!frictionPropertyTree.isLeaf())))) {
                    this.friction = _other.friction;
                }
                final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
                    this.solimp = _other.solimp;
                }
                final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
                    this.solref = _other.solref;
                }
                final PropertyTree marginPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("margin"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(marginPropertyTree!= null):((marginPropertyTree == null)||(!marginPropertyTree.isLeaf())))) {
                    this.margin = _other.margin;
                }
                final PropertyTree gapPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gap"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gapPropertyTree!= null):((gapPropertyTree == null)||(!gapPropertyTree.isLeaf())))) {
                    this.gap = _other.gap;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends PairType >_P init(final _P _product) {
            _product.condim = this.condim;
            _product.friction = this.friction;
            _product.solimp = this.solimp;
            _product.solref = this.solref;
            _product.margin = this.margin;
            _product.gap = this.gap;
            return _product;
        }

        /**
         * Sets the new value of "condim" (any previous value will be replaced)
         * 
         * @param condim
         *     New value of the "condim" property.
         */
        public PairType.Builder<_B> withCondim(final Integer condim) {
            this.condim = condim;
            return this;
        }

        /**
         * Sets the new value of "friction" (any previous value will be replaced)
         * 
         * @param friction
         *     New value of the "friction" property.
         */
        public PairType.Builder<_B> withFriction(final String friction) {
            this.friction = friction;
            return this;
        }

        /**
         * Sets the new value of "solimp" (any previous value will be replaced)
         * 
         * @param solimp
         *     New value of the "solimp" property.
         */
        public PairType.Builder<_B> withSolimp(final String solimp) {
            this.solimp = solimp;
            return this;
        }

        /**
         * Sets the new value of "solref" (any previous value will be replaced)
         * 
         * @param solref
         *     New value of the "solref" property.
         */
        public PairType.Builder<_B> withSolref(final String solref) {
            this.solref = solref;
            return this;
        }

        /**
         * Sets the new value of "margin" (any previous value will be replaced)
         * 
         * @param margin
         *     New value of the "margin" property.
         */
        public PairType.Builder<_B> withMargin(final BigDecimal margin) {
            this.margin = margin;
            return this;
        }

        /**
         * Sets the new value of "gap" (any previous value will be replaced)
         * 
         * @param gap
         *     New value of the "gap" property.
         */
        public PairType.Builder<_B> withGap(final BigDecimal gap) {
            this.gap = gap;
            return this;
        }

        @Override
        public PairType build() {
            return this.init(new PairType());
        }

        public PairType.Builder<_B> copyOf(final PairType _other) {
            _other.copyTo(this);
            return this;
        }

        public PairType.Builder<_B> copyOf(final PairType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String CONDIM = "condim";
        public final static transient String FRICTION = "friction";
        public final static transient String SOLIMP = "solimp";
        public final static transient String SOLREF = "solref";
        public final static transient String MARGIN = "margin";
        public final static transient String GAP = "gap";

    }

    public static class Select
        extends PairType.Selector<PairType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PairType.Select _root() {
            return new PairType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> condim = null;
        private com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> friction = null;
        private com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> solimp = null;
        private com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> solref = null;
        private com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> margin = null;
        private com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> gap = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.condim!= null) {
                products.put("condim", this.condim.init());
            }
            if (this.friction!= null) {
                products.put("friction", this.friction.init());
            }
            if (this.solimp!= null) {
                products.put("solimp", this.solimp.init());
            }
            if (this.solref!= null) {
                products.put("solref", this.solref.init());
            }
            if (this.margin!= null) {
                products.put("margin", this.margin.init());
            }
            if (this.gap!= null) {
                products.put("gap", this.gap.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> condim() {
            return ((this.condim == null)?this.condim = new com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>>(this._root, this, "condim"):this.condim);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> friction() {
            return ((this.friction == null)?this.friction = new com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>>(this._root, this, "friction"):this.friction);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> solimp() {
            return ((this.solimp == null)?this.solimp = new com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>>(this._root, this, "solimp"):this.solimp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> solref() {
            return ((this.solref == null)?this.solref = new com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>>(this._root, this, "solref"):this.solref);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> margin() {
            return ((this.margin == null)?this.margin = new com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>>(this._root, this, "margin"):this.margin);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>> gap() {
            return ((this.gap == null)?this.gap = new com.kscs.util.jaxb.Selector<TRoot, PairType.Selector<TRoot, TParent>>(this._root, this, "gap"):this.gap);
        }

    }

}
