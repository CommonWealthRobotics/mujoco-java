//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:36:46 PM EDT 
//


package org.mujoco.xml.sensor;

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
import org.mujoco.xml.attributetypes.DatatypeType;
import org.mujoco.xml.attributetypes.NeedstageType;


/**
 * <p>Java class for userType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noise" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="cuttoff" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="user" type="{attributeTypes}infRealsType" /&gt;
 *       &lt;attribute name="objtype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="objname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="datatype" use="required" type="{attributeTypes}datatypeType" /&gt;
 *       &lt;attribute name="neddstage" use="required" type="{attributeTypes}needstageType" /&gt;
 *       &lt;attribute name="dim" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userType")
public class UserType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "noise")
    protected BigDecimal noise;
    @XmlAttribute(name = "cuttoff")
    protected BigDecimal cuttoff;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "objtype", required = true)
    protected String objtype;
    @XmlAttribute(name = "objname", required = true)
    protected String objname;
    @XmlAttribute(name = "datatype", required = true)
    protected DatatypeType datatype;
    @XmlAttribute(name = "neddstage", required = true)
    protected NeedstageType neddstage;
    @XmlAttribute(name = "dim", required = true)
    protected int dim;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public UserType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a UserType copying the state of another UserType
     * 
     * @param _other
     *     The original UserType from which to copy state.
     */
    public UserType(final UserType _other) {
        this.name = _other.name;
        this.noise = _other.noise;
        this.cuttoff = _other.cuttoff;
        this.user = _other.user;
        this.objtype = _other.objtype;
        this.objname = _other.objname;
        this.datatype = _other.datatype;
        this.neddstage = _other.neddstage;
        this.dim = _other.dim;
    }

    /**
     * Instantiates a UserType copying the state of another UserType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original UserType from which to copy state.
     */
    public UserType(final UserType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            this.name = _other.name;
        }
        final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
            this.noise = _other.noise;
        }
        final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
            this.cuttoff = _other.cuttoff;
        }
        final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
            this.user = _other.user;
        }
        final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
            this.objtype = _other.objtype;
        }
        final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
            this.objname = _other.objname;
        }
        final PropertyTree datatypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datatype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datatypePropertyTree!= null):((datatypePropertyTree == null)||(!datatypePropertyTree.isLeaf())))) {
            this.datatype = _other.datatype;
        }
        final PropertyTree neddstagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("neddstage"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(neddstagePropertyTree!= null):((neddstagePropertyTree == null)||(!neddstagePropertyTree.isLeaf())))) {
            this.neddstage = _other.neddstage;
        }
        final PropertyTree dimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dim"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dimPropertyTree!= null):((dimPropertyTree == null)||(!dimPropertyTree.isLeaf())))) {
            this.dim = _other.dim;
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
     * Gets the value of the noise property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoise() {
        if (noise == null) {
            return new BigDecimal("0");
        } else {
            return noise;
        }
    }

    /**
     * Gets the value of the cuttoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuttoff() {
        if (cuttoff == null) {
            return new BigDecimal("0");
        } else {
            return cuttoff;
        }
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
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
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link DatatypeType }
     *     
     */
    public DatatypeType getDatatype() {
        return datatype;
    }

    /**
     * Gets the value of the neddstage property.
     * 
     * @return
     *     possible object is
     *     {@link NeedstageType }
     *     
     */
    public NeedstageType getNeddstage() {
        return neddstage;
    }

    /**
     * Gets the value of the dim property.
     * 
     */
    public int getDim() {
        return dim;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public UserType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public UserType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
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

    public void setNoise(final BigDecimal value) {
        final BigDecimal __oldValue = this.noise;
        try {
            this.vetoableChange__Support.fireVetoableChange("noise", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.noise = value;
        this.propertyChange__Support.firePropertyChange("noise", __oldValue, value);
    }

    public void setCuttoff(final BigDecimal value) {
        final BigDecimal __oldValue = this.cuttoff;
        try {
            this.vetoableChange__Support.fireVetoableChange("cuttoff", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.cuttoff = value;
        this.propertyChange__Support.firePropertyChange("cuttoff", __oldValue, value);
    }

    public void setUser(final String value) {
        final String __oldValue = this.user;
        try {
            this.vetoableChange__Support.fireVetoableChange("user", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.user = value;
        this.propertyChange__Support.firePropertyChange("user", __oldValue, value);
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

    public void setDatatype(final DatatypeType value) {
        final DatatypeType __oldValue = this.datatype;
        try {
            this.vetoableChange__Support.fireVetoableChange("datatype", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.datatype = value;
        this.propertyChange__Support.firePropertyChange("datatype", __oldValue, value);
    }

    public void setNeddstage(final NeedstageType value) {
        final NeedstageType __oldValue = this.neddstage;
        try {
            this.vetoableChange__Support.fireVetoableChange("neddstage", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.neddstage = value;
        this.propertyChange__Support.firePropertyChange("neddstage", __oldValue, value);
    }

    public void setDim(final int value) {
        final int __oldValue = this.dim;
        try {
            this.vetoableChange__Support.fireVetoableChange("dim", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.dim = value;
        this.propertyChange__Support.firePropertyChange("dim", __oldValue, value);
    }

    @Override
    public UserType clone() {
        final UserType _newObject;
        try {
            _newObject = ((UserType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public UserType createCopy() {
        final UserType _newObject;
        try {
            _newObject = ((UserType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.name = this.name;
        _newObject.noise = this.noise;
        _newObject.cuttoff = this.cuttoff;
        _newObject.user = this.user;
        _newObject.objtype = this.objtype;
        _newObject.objname = this.objname;
        _newObject.datatype = this.datatype;
        _newObject.neddstage = this.neddstage;
        _newObject.dim = this.dim;
        return _newObject;
    }

    @Override
    public UserType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UserType _newObject;
        try {
            _newObject = ((UserType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _newObject.name = this.name;
        }
        final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
            _newObject.noise = this.noise;
        }
        final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
            _newObject.cuttoff = this.cuttoff;
        }
        final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
            _newObject.user = this.user;
        }
        final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
            _newObject.objtype = this.objtype;
        }
        final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
            _newObject.objname = this.objname;
        }
        final PropertyTree datatypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datatype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datatypePropertyTree!= null):((datatypePropertyTree == null)||(!datatypePropertyTree.isLeaf())))) {
            _newObject.datatype = this.datatype;
        }
        final PropertyTree neddstagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("neddstage"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(neddstagePropertyTree!= null):((neddstagePropertyTree == null)||(!neddstagePropertyTree.isLeaf())))) {
            _newObject.neddstage = this.neddstage;
        }
        final PropertyTree dimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dim"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dimPropertyTree!= null):((dimPropertyTree == null)||(!dimPropertyTree.isLeaf())))) {
            _newObject.dim = this.dim;
        }
        return _newObject;
    }

    @Override
    public UserType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public UserType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UserType.Builder<_B> _other) {
        _other.name = this.name;
        _other.noise = this.noise;
        _other.cuttoff = this.cuttoff;
        _other.user = this.user;
        _other.objtype = this.objtype;
        _other.objname = this.objname;
        _other.datatype = this.datatype;
        _other.neddstage = this.neddstage;
        _other.dim = this.dim;
    }

    public<_B >UserType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UserType.Builder<_B>(_parentBuilder, this, true);
    }

    public UserType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UserType.Builder<Void> builder() {
        return new UserType.Builder<Void>(null, null, false);
    }

    public static<_B >UserType.Builder<_B> copyOf(final UserType _other) {
        final UserType.Builder<_B> _newBuilder = new UserType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UserType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
            _other.noise = this.noise;
        }
        final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
            _other.cuttoff = this.cuttoff;
        }
        final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
            _other.user = this.user;
        }
        final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
            _other.objtype = this.objtype;
        }
        final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
            _other.objname = this.objname;
        }
        final PropertyTree datatypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datatype"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datatypePropertyTree!= null):((datatypePropertyTree == null)||(!datatypePropertyTree.isLeaf())))) {
            _other.datatype = this.datatype;
        }
        final PropertyTree neddstagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("neddstage"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(neddstagePropertyTree!= null):((neddstagePropertyTree == null)||(!neddstagePropertyTree.isLeaf())))) {
            _other.neddstage = this.neddstage;
        }
        final PropertyTree dimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dim"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dimPropertyTree!= null):((dimPropertyTree == null)||(!dimPropertyTree.isLeaf())))) {
            _other.dim = this.dim;
        }
    }

    public<_B >UserType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UserType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public UserType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UserType.Builder<_B> copyOf(final UserType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UserType.Builder<_B> _newBuilder = new UserType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UserType.Builder<Void> copyExcept(final UserType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UserType.Builder<Void> copyOnly(final UserType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public UserType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String name;
        private BigDecimal noise;
        private BigDecimal cuttoff;
        private String user;
        private String objtype;
        private String objname;
        private DatatypeType datatype;
        private NeedstageType neddstage;
        private int dim;

        public Builder(final _B _parentBuilder, final UserType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.name = _other.name;
                this.noise = _other.noise;
                this.cuttoff = _other.cuttoff;
                this.user = _other.user;
                this.objtype = _other.objtype;
                this.objname = _other.objname;
                this.datatype = _other.datatype;
                this.neddstage = _other.neddstage;
                this.dim = _other.dim;
            }
        }

        public Builder(final _B _parentBuilder, final UserType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                    this.name = _other.name;
                }
                final PropertyTree noisePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("noise"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(noisePropertyTree!= null):((noisePropertyTree == null)||(!noisePropertyTree.isLeaf())))) {
                    this.noise = _other.noise;
                }
                final PropertyTree cuttoffPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cuttoff"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cuttoffPropertyTree!= null):((cuttoffPropertyTree == null)||(!cuttoffPropertyTree.isLeaf())))) {
                    this.cuttoff = _other.cuttoff;
                }
                final PropertyTree userPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("user"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userPropertyTree!= null):((userPropertyTree == null)||(!userPropertyTree.isLeaf())))) {
                    this.user = _other.user;
                }
                final PropertyTree objtypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objtype"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objtypePropertyTree!= null):((objtypePropertyTree == null)||(!objtypePropertyTree.isLeaf())))) {
                    this.objtype = _other.objtype;
                }
                final PropertyTree objnamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objname"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objnamePropertyTree!= null):((objnamePropertyTree == null)||(!objnamePropertyTree.isLeaf())))) {
                    this.objname = _other.objname;
                }
                final PropertyTree datatypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datatype"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datatypePropertyTree!= null):((datatypePropertyTree == null)||(!datatypePropertyTree.isLeaf())))) {
                    this.datatype = _other.datatype;
                }
                final PropertyTree neddstagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("neddstage"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(neddstagePropertyTree!= null):((neddstagePropertyTree == null)||(!neddstagePropertyTree.isLeaf())))) {
                    this.neddstage = _other.neddstage;
                }
                final PropertyTree dimPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dim"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dimPropertyTree!= null):((dimPropertyTree == null)||(!dimPropertyTree.isLeaf())))) {
                    this.dim = _other.dim;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends UserType >_P init(final _P _product) {
            _product.name = this.name;
            _product.noise = this.noise;
            _product.cuttoff = this.cuttoff;
            _product.user = this.user;
            _product.objtype = this.objtype;
            _product.objname = this.objname;
            _product.datatype = this.datatype;
            _product.neddstage = this.neddstage;
            _product.dim = this.dim;
            return _product;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public UserType.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "noise" (any previous value will be replaced)
         * 
         * @param noise
         *     New value of the "noise" property.
         */
        public UserType.Builder<_B> withNoise(final BigDecimal noise) {
            this.noise = noise;
            return this;
        }

        /**
         * Sets the new value of "cuttoff" (any previous value will be replaced)
         * 
         * @param cuttoff
         *     New value of the "cuttoff" property.
         */
        public UserType.Builder<_B> withCuttoff(final BigDecimal cuttoff) {
            this.cuttoff = cuttoff;
            return this;
        }

        /**
         * Sets the new value of "user" (any previous value will be replaced)
         * 
         * @param user
         *     New value of the "user" property.
         */
        public UserType.Builder<_B> withUser(final String user) {
            this.user = user;
            return this;
        }

        /**
         * Sets the new value of "objtype" (any previous value will be replaced)
         * 
         * @param objtype
         *     New value of the "objtype" property.
         */
        public UserType.Builder<_B> withObjtype(final String objtype) {
            this.objtype = objtype;
            return this;
        }

        /**
         * Sets the new value of "objname" (any previous value will be replaced)
         * 
         * @param objname
         *     New value of the "objname" property.
         */
        public UserType.Builder<_B> withObjname(final String objname) {
            this.objname = objname;
            return this;
        }

        /**
         * Sets the new value of "datatype" (any previous value will be replaced)
         * 
         * @param datatype
         *     New value of the "datatype" property.
         */
        public UserType.Builder<_B> withDatatype(final DatatypeType datatype) {
            this.datatype = datatype;
            return this;
        }

        /**
         * Sets the new value of "neddstage" (any previous value will be replaced)
         * 
         * @param neddstage
         *     New value of the "neddstage" property.
         */
        public UserType.Builder<_B> withNeddstage(final NeedstageType neddstage) {
            this.neddstage = neddstage;
            return this;
        }

        /**
         * Sets the new value of "dim" (any previous value will be replaced)
         * 
         * @param dim
         *     New value of the "dim" property.
         */
        public UserType.Builder<_B> withDim(final int dim) {
            this.dim = dim;
            return this;
        }

        @Override
        public UserType build() {
            return this.init(new UserType());
        }

        public UserType.Builder<_B> copyOf(final UserType _other) {
            _other.copyTo(this);
            return this;
        }

        public UserType.Builder<_B> copyOf(final UserType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String NAME = "name";
        public final static transient String NOISE = "noise";
        public final static transient String CUTTOFF = "cuttoff";
        public final static transient String USER = "user";
        public final static transient String OBJTYPE = "objtype";
        public final static transient String OBJNAME = "objname";
        public final static transient String DATATYPE = "datatype";
        public final static transient String NEDDSTAGE = "neddstage";
        public final static transient String DIM = "dim";

    }

    public static class Select
        extends UserType.Selector<UserType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UserType.Select _root() {
            return new UserType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> noise = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> cuttoff = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> user = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> objtype = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> objname = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> datatype = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> neddstage = null;

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
            if (this.noise!= null) {
                products.put("noise", this.noise.init());
            }
            if (this.cuttoff!= null) {
                products.put("cuttoff", this.cuttoff.init());
            }
            if (this.user!= null) {
                products.put("user", this.user.init());
            }
            if (this.objtype!= null) {
                products.put("objtype", this.objtype.init());
            }
            if (this.objname!= null) {
                products.put("objname", this.objname.init());
            }
            if (this.datatype!= null) {
                products.put("datatype", this.datatype.init());
            }
            if (this.neddstage!= null) {
                products.put("neddstage", this.neddstage.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> noise() {
            return ((this.noise == null)?this.noise = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "noise"):this.noise);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> cuttoff() {
            return ((this.cuttoff == null)?this.cuttoff = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "cuttoff"):this.cuttoff);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> user() {
            return ((this.user == null)?this.user = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "user"):this.user);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> objtype() {
            return ((this.objtype == null)?this.objtype = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "objtype"):this.objtype);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> objname() {
            return ((this.objname == null)?this.objname = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "objname"):this.objname);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> datatype() {
            return ((this.datatype == null)?this.datatype = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "datatype"):this.datatype);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>> neddstage() {
            return ((this.neddstage == null)?this.neddstage = new com.kscs.util.jaxb.Selector<TRoot, UserType.Selector<TRoot, TParent>>(this._root, this, "neddstage"):this.neddstage);
        }

    }

}
