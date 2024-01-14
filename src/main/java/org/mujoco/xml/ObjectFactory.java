//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mujoco.xml.body.CameraType;
import org.mujoco.xml.body.GeomType;
import org.mujoco.xml.body.InertialType;
import org.mujoco.xml.body.LightType;
import org.mujoco.xml.body.SiteType;
import org.mujoco.xml.root.IncludeType;
import org.mujoco.xml.sensor.ActuatorType;
import org.mujoco.xml.sensor.FrameType;
import org.mujoco.xml.sensor.SensorType;
import org.mujoco.xml.sensor.SubtreeType;
import org.mujoco.xml.sensor.TendonType;
import org.mujoco.xml.sensor.UserType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mujoco.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MujocoSensorFramelinacc_QNAME = new QName("", "framelinacc");
    private final static QName _MujocoSensorActuatorpos_QNAME = new QName("", "actuatorpos");
    private final static QName _MujocoSensorActuatorfrc_QNAME = new QName("", "actuatorfrc");
    private final static QName _MujocoSensorTendonlimitfrc_QNAME = new QName("", "tendonlimitfrc");
    private final static QName _MujocoSensorSubtreeangmom_QNAME = new QName("", "subtreeangmom");
    private final static QName _MujocoSensorSubtreelinvel_QNAME = new QName("", "subtreelinvel");
    private final static QName _MujocoSensorTorque_QNAME = new QName("", "torque");
    private final static QName _MujocoSensorJointpos_QNAME = new QName("", "jointpos");
    private final static QName _MujocoSensorFrameyaxis_QNAME = new QName("", "frameyaxis");
    private final static QName _MujocoSensorFrameangvel_QNAME = new QName("", "frameangvel");
    private final static QName _MujocoSensorTendonlimitvel_QNAME = new QName("", "tendonlimitvel");
    private final static QName _MujocoSensorFramequat_QNAME = new QName("", "framequat");
    private final static QName _MujocoSensorJointvel_QNAME = new QName("", "jointvel");
    private final static QName _MujocoSensorJointlimitpos_QNAME = new QName("", "jointlimitpos");
    private final static QName _MujocoSensorAccelerometer_QNAME = new QName("", "accelerometer");
    private final static QName _MujocoSensorJointlimitfrc_QNAME = new QName("", "jointlimitfrc");
    private final static QName _MujocoSensorFramezaxis_QNAME = new QName("", "framezaxis");
    private final static QName _MujocoSensorJointlimitvel_QNAME = new QName("", "jointlimitvel");
    private final static QName _MujocoSensorGyro_QNAME = new QName("", "gyro");
    private final static QName _MujocoSensorInclude_QNAME = new QName("", "include");
    private final static QName _MujocoSensorFramelinvel_QNAME = new QName("", "framelinvel");
    private final static QName _MujocoSensorMagnetometer_QNAME = new QName("", "magnetometer");
    private final static QName _MujocoSensorRangefinder_QNAME = new QName("", "rangefinder");
    private final static QName _MujocoSensorTouch_QNAME = new QName("", "touch");
    private final static QName _MujocoSensorTendonvel_QNAME = new QName("", "tendonvel");
    private final static QName _MujocoSensorFrameangacc_QNAME = new QName("", "frameangacc");
    private final static QName _MujocoSensorBallangvel_QNAME = new QName("", "ballangvel");
    private final static QName _MujocoSensorSubtreecom_QNAME = new QName("", "subtreecom");
    private final static QName _MujocoSensorTendonpos_QNAME = new QName("", "tendonpos");
    private final static QName _MujocoSensorBallquat_QNAME = new QName("", "ballquat");
    private final static QName _MujocoSensorFramepos_QNAME = new QName("", "framepos");
    private final static QName _MujocoSensorFramexaxis_QNAME = new QName("", "framexaxis");
    private final static QName _MujocoSensorTendonlimitpos_QNAME = new QName("", "tendonlimitpos");
    private final static QName _MujocoSensorForce_QNAME = new QName("", "force");
    private final static QName _MujocoSensorVelocimeter_QNAME = new QName("", "velocimeter");
    private final static QName _MujocoSensorUser_QNAME = new QName("", "user");
    private final static QName _MujocoSensorActuatorvel_QNAME = new QName("", "actuatorvel");
    private final static QName _BodyarchTypeSite_QNAME = new QName("", "site");
    private final static QName _BodyarchTypeJoint_QNAME = new QName("", "joint");
    private final static QName _BodyarchTypeLight_QNAME = new QName("", "light");
    private final static QName _BodyarchTypeComposite_QNAME = new QName("", "composite");
    private final static QName _BodyarchTypeFreejoint_QNAME = new QName("", "freejoint");
    private final static QName _BodyarchTypeGeom_QNAME = new QName("", "geom");
    private final static QName _BodyarchTypeCamera_QNAME = new QName("", "camera");
    private final static QName _BodyarchTypeBody_QNAME = new QName("", "body");
    private final static QName _BodyarchTypeInertial_QNAME = new QName("", "inertial");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mujoco.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mujoco }
     * 
     */
    public Mujoco createMujoco() {
        return new Mujoco();
    }

    /**
     * Create an instance of {@link BodyarchType }
     * 
     */
    public BodyarchType createBodyarchType() {
        return new BodyarchType();
    }

    /**
     * Create an instance of {@link Mujoco.Tendon }
     * 
     */
    public Mujoco.Tendon createMujocoTendon() {
        return new Mujoco.Tendon();
    }

    /**
     * Create an instance of {@link Mujoco.Worldbody }
     * 
     */
    public Mujoco.Worldbody createMujocoWorldbody() {
        return new Mujoco.Worldbody();
    }

    /**
     * Create an instance of {@link Mujoco.Asset }
     * 
     */
    public Mujoco.Asset createMujocoAsset() {
        return new Mujoco.Asset();
    }

    /**
     * Create an instance of {@link Mujoco.Custom }
     * 
     */
    public Mujoco.Custom createMujocoCustom() {
        return new Mujoco.Custom();
    }

    /**
     * Create an instance of {@link Mujoco.Compiler }
     * 
     */
    public Mujoco.Compiler createMujocoCompiler() {
        return new Mujoco.Compiler();
    }

    /**
     * Create an instance of {@link Mujoco.Option }
     * 
     */
    public Mujoco.Option createMujocoOption() {
        return new Mujoco.Option();
    }

    /**
     * Create an instance of {@link Mujoco.Visual }
     * 
     */
    public Mujoco.Visual createMujocoVisual() {
        return new Mujoco.Visual();
    }

    /**
     * Create an instance of {@link Mujoco.Default }
     * 
     */
    public Mujoco.Default createMujocoDefault() {
        return new Mujoco.Default();
    }

    /**
     * Create an instance of {@link Mujoco.Contact }
     * 
     */
    public Mujoco.Contact createMujocoContact() {
        return new Mujoco.Contact();
    }

    /**
     * Create an instance of {@link Mujoco.Equality }
     * 
     */
    public Mujoco.Equality createMujocoEquality() {
        return new Mujoco.Equality();
    }

    /**
     * Create an instance of {@link Mujoco.Actuator }
     * 
     */
    public Mujoco.Actuator createMujocoActuator() {
        return new Mujoco.Actuator();
    }

    /**
     * Create an instance of {@link Mujoco.Sensor }
     * 
     */
    public Mujoco.Sensor createMujocoSensor() {
        return new Mujoco.Sensor();
    }

    /**
     * Create an instance of {@link Mujoco.Keyframe }
     * 
     */
    public Mujoco.Keyframe createMujocoKeyframe() {
        return new Mujoco.Keyframe();
    }

    /**
     * Create an instance of {@link DefaultType }
     * 
     */
    public DefaultType createDefaultType() {
        return new DefaultType();
    }

    /**
     * Create an instance of {@link BodyarchType.Composite }
     * 
     */
    public BodyarchType.Composite createBodyarchTypeComposite() {
        return new BodyarchType.Composite();
    }

    /**
     * Create an instance of {@link Mujoco.Tendon.Spatial }
     * 
     */
    public Mujoco.Tendon.Spatial createMujocoTendonSpatial() {
        return new Mujoco.Tendon.Spatial();
    }

    /**
     * Create an instance of {@link Mujoco.Tendon.Fixed }
     * 
     */
    public Mujoco.Tendon.Fixed createMujocoTendonFixed() {
        return new Mujoco.Tendon.Fixed();
    }

    /**
     * Create an instance of {@link Mujoco.Worldbody.Composite }
     * 
     */
    public Mujoco.Worldbody.Composite createMujocoWorldbodyComposite() {
        return new Mujoco.Worldbody.Composite();
    }

    /**
     * Create an instance of {@link Mujoco.Asset.Skin }
     * 
     */
    public Mujoco.Asset.Skin createMujocoAssetSkin() {
        return new Mujoco.Asset.Skin();
    }

    /**
     * Create an instance of {@link Mujoco.Custom.Tuple }
     * 
     */
    public Mujoco.Custom.Tuple createMujocoCustomTuple() {
        return new Mujoco.Custom.Tuple();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "framelinacc", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFramelinacc(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFramelinacc_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actuatorpos", scope = Mujoco.Sensor.class)
    public JAXBElement<ActuatorType> createMujocoSensorActuatorpos(ActuatorType value) {
        return new JAXBElement<ActuatorType>(_MujocoSensorActuatorpos_QNAME, ActuatorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actuatorfrc", scope = Mujoco.Sensor.class)
    public JAXBElement<ActuatorType> createMujocoSensorActuatorfrc(ActuatorType value) {
        return new JAXBElement<ActuatorType>(_MujocoSensorActuatorfrc_QNAME, ActuatorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tendonlimitfrc", scope = Mujoco.Sensor.class)
    public JAXBElement<TendonType> createMujocoSensorTendonlimitfrc(TendonType value) {
        return new JAXBElement<TendonType>(_MujocoSensorTendonlimitfrc_QNAME, TendonType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtreeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtreeangmom", scope = Mujoco.Sensor.class)
    public JAXBElement<SubtreeType> createMujocoSensorSubtreeangmom(SubtreeType value) {
        return new JAXBElement<SubtreeType>(_MujocoSensorSubtreeangmom_QNAME, SubtreeType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtreeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtreelinvel", scope = Mujoco.Sensor.class)
    public JAXBElement<SubtreeType> createMujocoSensorSubtreelinvel(SubtreeType value) {
        return new JAXBElement<SubtreeType>(_MujocoSensorSubtreelinvel_QNAME, SubtreeType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "torque", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorTorque(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorTorque_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jointpos", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorJointpos(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorJointpos_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "frameyaxis", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFrameyaxis(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFrameyaxis_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "frameangvel", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFrameangvel(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFrameangvel_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tendonlimitvel", scope = Mujoco.Sensor.class)
    public JAXBElement<TendonType> createMujocoSensorTendonlimitvel(TendonType value) {
        return new JAXBElement<TendonType>(_MujocoSensorTendonlimitvel_QNAME, TendonType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "framequat", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFramequat(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFramequat_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jointvel", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorJointvel(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorJointvel_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jointlimitpos", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorJointlimitpos(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorJointlimitpos_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accelerometer", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorAccelerometer(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorAccelerometer_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jointlimitfrc", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorJointlimitfrc(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorJointlimitfrc_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "framezaxis", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFramezaxis(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFramezaxis_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jointlimitvel", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorJointlimitvel(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorJointlimitvel_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gyro", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorGyro(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorGyro_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "include", scope = Mujoco.Sensor.class)
    public JAXBElement<IncludeType> createMujocoSensorInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_MujocoSensorInclude_QNAME, IncludeType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "framelinvel", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFramelinvel(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFramelinvel_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "magnetometer", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorMagnetometer(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorMagnetometer_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rangefinder", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorRangefinder(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorRangefinder_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "touch", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorTouch(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorTouch_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tendonvel", scope = Mujoco.Sensor.class)
    public JAXBElement<TendonType> createMujocoSensorTendonvel(TendonType value) {
        return new JAXBElement<TendonType>(_MujocoSensorTendonvel_QNAME, TendonType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "frameangacc", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFrameangacc(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFrameangacc_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ballangvel", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorBallangvel(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorBallangvel_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtreeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtreecom", scope = Mujoco.Sensor.class)
    public JAXBElement<SubtreeType> createMujocoSensorSubtreecom(SubtreeType value) {
        return new JAXBElement<SubtreeType>(_MujocoSensorSubtreecom_QNAME, SubtreeType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tendonpos", scope = Mujoco.Sensor.class)
    public JAXBElement<TendonType> createMujocoSensorTendonpos(TendonType value) {
        return new JAXBElement<TendonType>(_MujocoSensorTendonpos_QNAME, TendonType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.sensor.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ballquat", scope = Mujoco.Sensor.class)
    public JAXBElement<org.mujoco.xml.sensor.JointType> createMujocoSensorBallquat(org.mujoco.xml.sensor.JointType value) {
        return new JAXBElement<org.mujoco.xml.sensor.JointType>(_MujocoSensorBallquat_QNAME, org.mujoco.xml.sensor.JointType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "framepos", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFramepos(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFramepos_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "framexaxis", scope = Mujoco.Sensor.class)
    public JAXBElement<FrameType> createMujocoSensorFramexaxis(FrameType value) {
        return new JAXBElement<FrameType>(_MujocoSensorFramexaxis_QNAME, FrameType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tendonlimitpos", scope = Mujoco.Sensor.class)
    public JAXBElement<TendonType> createMujocoSensorTendonlimitpos(TendonType value) {
        return new JAXBElement<TendonType>(_MujocoSensorTendonlimitpos_QNAME, TendonType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "force", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorForce(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorForce_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "velocimeter", scope = Mujoco.Sensor.class)
    public JAXBElement<SensorType> createMujocoSensorVelocimeter(SensorType value) {
        return new JAXBElement<SensorType>(_MujocoSensorVelocimeter_QNAME, SensorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = Mujoco.Sensor.class)
    public JAXBElement<UserType> createMujocoSensorUser(UserType value) {
        return new JAXBElement<UserType>(_MujocoSensorUser_QNAME, UserType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actuatorvel", scope = Mujoco.Sensor.class)
    public JAXBElement<ActuatorType> createMujocoSensorActuatorvel(ActuatorType value) {
        return new JAXBElement<ActuatorType>(_MujocoSensorActuatorvel_QNAME, ActuatorType.class, Mujoco.Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "include", scope = BodyarchType.class)
    public JAXBElement<IncludeType> createBodyarchTypeInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_MujocoSensorInclude_QNAME, IncludeType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "site", scope = BodyarchType.class)
    public JAXBElement<SiteType> createBodyarchTypeSite(SiteType value) {
        return new JAXBElement<SiteType>(_BodyarchTypeSite_QNAME, SiteType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.body.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "joint", scope = BodyarchType.class)
    public JAXBElement<org.mujoco.xml.body.JointType> createBodyarchTypeJoint(org.mujoco.xml.body.JointType value) {
        return new JAXBElement<org.mujoco.xml.body.JointType>(_BodyarchTypeJoint_QNAME, org.mujoco.xml.body.JointType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "light", scope = BodyarchType.class)
    public JAXBElement<LightType> createBodyarchTypeLight(LightType value) {
        return new JAXBElement<LightType>(_BodyarchTypeLight_QNAME, LightType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyarchType.Composite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "composite", scope = BodyarchType.class)
    public JAXBElement<BodyarchType.Composite> createBodyarchTypeComposite(BodyarchType.Composite value) {
        return new JAXBElement<BodyarchType.Composite>(_BodyarchTypeComposite_QNAME, BodyarchType.Composite.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.mujoco.xml.body.JointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "freejoint", scope = BodyarchType.class)
    public JAXBElement<org.mujoco.xml.body.JointType> createBodyarchTypeFreejoint(org.mujoco.xml.body.JointType value) {
        return new JAXBElement<org.mujoco.xml.body.JointType>(_BodyarchTypeFreejoint_QNAME, org.mujoco.xml.body.JointType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "geom", scope = BodyarchType.class)
    public JAXBElement<GeomType> createBodyarchTypeGeom(GeomType value) {
        return new JAXBElement<GeomType>(_BodyarchTypeGeom_QNAME, GeomType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CameraType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "camera", scope = BodyarchType.class)
    public JAXBElement<CameraType> createBodyarchTypeCamera(CameraType value) {
        return new JAXBElement<CameraType>(_BodyarchTypeCamera_QNAME, CameraType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyarchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "body", scope = BodyarchType.class)
    public JAXBElement<BodyarchType> createBodyarchTypeBody(BodyarchType value) {
        return new JAXBElement<BodyarchType>(_BodyarchTypeBody_QNAME, BodyarchType.class, BodyarchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InertialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inertial", scope = BodyarchType.class)
    public JAXBElement<InertialType> createBodyarchTypeInertial(InertialType value) {
        return new JAXBElement<InertialType>(_BodyarchTypeInertial_QNAME, InertialType.class, BodyarchType.class, value);
    }

}
