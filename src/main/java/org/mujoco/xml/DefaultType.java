//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 05:07:30 PM EST 
//


package org.mujoco.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.mujoco.xml.MuJoCoDefault.CameraType;
import org.mujoco.xml.MuJoCoDefault.CylinderType;
import org.mujoco.xml.MuJoCoDefault.EqualityType;
import org.mujoco.xml.MuJoCoDefault.GeneralType;
import org.mujoco.xml.MuJoCoDefault.GeomType;
import org.mujoco.xml.MuJoCoDefault.JointType;
import org.mujoco.xml.MuJoCoDefault.LightType;
import org.mujoco.xml.MuJoCoDefault.MaterialType;
import org.mujoco.xml.MuJoCoDefault.MeshType;
import org.mujoco.xml.MuJoCoDefault.MotorType;
import org.mujoco.xml.MuJoCoDefault.MuscleType;
import org.mujoco.xml.MuJoCoDefault.PairType;
import org.mujoco.xml.MuJoCoDefault.PositionType;
import org.mujoco.xml.MuJoCoDefault.SiteType;
import org.mujoco.xml.MuJoCoDefault.TendonType;
import org.mujoco.xml.MuJoCoDefault.VelocityType;
import org.mujoco.xml.root.IncludeType;


/**
 * <p>Java class for defaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defaultType">
 *   &lt;complexContent>
 *     &lt;extension base="{default}defaultType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="mesh" type="{default}meshType"/>
 *         &lt;element name="material" type="{default}materialType"/>
 *         &lt;element name="joint" type="{default}jointType"/>
 *         &lt;element name="geom" type="{default}geomType"/>
 *         &lt;element name="site" type="{default}siteType"/>
 *         &lt;element name="camera" type="{default}cameraType"/>
 *         &lt;element name="light" type="{default}lightType"/>
 *         &lt;element name="pair" type="{default}pairType"/>
 *         &lt;element name="equality" type="{default}equalityType"/>
 *         &lt;element name="tendon" type="{default}tendonType"/>
 *         &lt;element name="general" type="{default}generalType"/>
 *         &lt;element name="motor" type="{default}motorType"/>
 *         &lt;element name="position" type="{default}positionType"/>
 *         &lt;element name="velocity" type="{default}velocityType"/>
 *         &lt;element name="cylinder" type="{default}cylinderType"/>
 *         &lt;element name="muscle" type="{default}muscleType"/>
 *         &lt;element name="default" type="{}defaultType" minOccurs="0"/>
 *         &lt;element name="include" type="{root}includeType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultType", propOrder = {
    "meshOrMaterialOrJoint"
})
public class DefaultType
    extends org.mujoco.xml.MuJoCoDefault.DefaultType
{

    @XmlElements({
        @XmlElement(name = "mesh", type = MeshType.class),
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "joint", type = JointType.class),
        @XmlElement(name = "geom", type = GeomType.class),
        @XmlElement(name = "site", type = SiteType.class),
        @XmlElement(name = "camera", type = CameraType.class),
        @XmlElement(name = "light", type = LightType.class),
        @XmlElement(name = "pair", type = PairType.class),
        @XmlElement(name = "equality", type = EqualityType.class),
        @XmlElement(name = "tendon", type = TendonType.class),
        @XmlElement(name = "general", type = GeneralType.class),
        @XmlElement(name = "motor", type = MotorType.class),
        @XmlElement(name = "position", type = PositionType.class),
        @XmlElement(name = "velocity", type = VelocityType.class),
        @XmlElement(name = "cylinder", type = CylinderType.class),
        @XmlElement(name = "muscle", type = MuscleType.class),
        @XmlElement(name = "default", type = DefaultType.class),
        @XmlElement(name = "include", type = IncludeType.class)
    })
    protected List<Object> meshOrMaterialOrJoint;

    /**
     * Gets the value of the meshOrMaterialOrJoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meshOrMaterialOrJoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeshOrMaterialOrJoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeshType }
     * {@link MaterialType }
     * {@link JointType }
     * {@link GeomType }
     * {@link SiteType }
     * {@link CameraType }
     * {@link LightType }
     * {@link PairType }
     * {@link EqualityType }
     * {@link TendonType }
     * {@link GeneralType }
     * {@link MotorType }
     * {@link PositionType }
     * {@link VelocityType }
     * {@link CylinderType }
     * {@link MuscleType }
     * {@link DefaultType }
     * {@link IncludeType }
     * 
     * 
     */
    public List<Object> getMeshOrMaterialOrJoint() {
        if (meshOrMaterialOrJoint == null) {
            meshOrMaterialOrJoint = new ArrayList<Object>();
        }
        return this.meshOrMaterialOrJoint;
    }

}