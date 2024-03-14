package org.mujoco;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Set;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.IntPointer;
import org.mujoco.MuJoCoLib.mjData;
import org.mujoco.MuJoCoLib.mjData_;
import org.mujoco.MuJoCoLib.mjModel;
import org.mujoco.MuJoCoLib.mjModel_;
import org.mujoco.MuJoCoLib.mjOption_;

public class MuJoCoModelManager {
	MuJoCoLib lib = new MuJoCoLib();

	private mjModel m;
	private mjData d;
	private mjModel_ model;
	private mjData_ data;
	private mjOption_ opt;
	private IMujocoController controller = null;

	private BytePointer modelNames;

	private IntPointer jointNameIndexes;

	private IntPointer bodyNameIndex;
	private boolean connected = false;
	private HashMap<String, Double> setEfforts = new HashMap<String, Double>();
	private HashMap<String, Double> positions  = new HashMap<String, Double>();
	public MuJoCoModelManager(String xml) throws IOException {
		//File tempFile = File.createTempFile("mujoco-", ".xml");
		//tempFile.deleteOnExit();
		File tempFile = new File("/tmp/mujocoxmlTEST.XML");
		Files.write( Paths.get(tempFile.getAbsolutePath()), xml.getBytes());
		loadFromFile(tempFile);
	}

	public MuJoCoModelManager(File config) {
		loadFromFile(config);
	}

	private void loadFromFile(File config) {
		if (!config.exists())
			throw new RuntimeException("Config File does not exist " + config);
		int error_sz = 1000;
		BytePointer error = new BytePointer(error_sz);
		System.out.println("MuJoCo loading configureation file " + config.getAbsolutePath());
		m = MuJoCoLib.mj_loadXML(config.getAbsolutePath(), null, error, error_sz);
		if (m == null)
			throw new RuntimeException("Model File Failed to load " + error.getString() + " code " + error_sz);
		System.out.println("MuJoCo model loaded " + config.getAbsolutePath());
		d = MuJoCoLib.mj_makeData(m);
		setModel(new mjModel_(m));
		setData(new mjData_(d));
		setOpt(new mjOption_(getModel().opt()));
		setModelNames(model.names());
		jointNameIndexes = model.name_jntadr();
		bodyNameIndex = model.name_bodyadr();
		connected = true;
	}

	private void check() {
		if (!connected)
			throw new RuntimeException("MuJoCo Model may not be accessed when disconnected");
	}

	public double getCurrentSimulationTimeSeconds() {
		check();
		return data.time();
	}

	public int getNumberOfBodys() {
		check();
		return model.nbody();
	}

	public int getNumberOfGeometrys() {
		check();
		return model.ngeom();
	}

	public String getBodyName(int i) {
		check();
		if (i < 0)
			throw new IndexOutOfBoundsException("Body index must be positive or zero");
		if (i >= getNumberOfBodys()) {
			throw new IndexOutOfBoundsException("Body index must be less than " + i);
		}
		BytePointer byp = modelNames.getPointer(bodyNameIndex.getPointer(i).get());
		return byp.getString();
	}

	public String getGeometryName(int i) {
		check();
		if (i < 0)
			throw new IndexOutOfBoundsException("Body index must be positive or zero");
		if (i >= getNumberOfGeometrys()) {
			throw new IndexOutOfBoundsException("Body index must be less than " + i);
		}
		IntPointer GeomIndex = model.name_geomadr();
		BytePointer byp = modelNames.getPointer(GeomIndex.getPointer(i).get());
		return byp.getString();
	}

	/**
	 * 
	 * @param cartesianPositions   pointer to positions
	 * @param cartesianQuaturnions pointer to quaturnions
	 * @param i                    index within the pointer space
	 * @return cartesian pose, Xm, Ym, Zm, QuatW, QuatX, QuatY, QuatZ
	 */
	double[] convert(DoublePointer cartesianPositions, DoublePointer cartesianQuaturnions, int i) {
		check();
		DoublePointer coords = cartesianPositions.getPointer(i * 3);
		double x = coords.getPointer(0).get();
		double y = coords.getPointer(1).get();
		double z = coords.getPointer(2).get();

		DoublePointer quat = cartesianQuaturnions.getPointer(i * 4);
		double qw = quat.getPointer(0).get();
		double qx = quat.getPointer(1).get();
		double qy = quat.getPointer(2).get();
		double qz = quat.getPointer(3).get();

		return new double[] { x, y, z, qw, qx, qy, qz };
	}

	/**
	 * 
	 * @param name of a body
	 * @return cartesian pose, Xm, Ym, Zm, QuatW, QuatX, QuatY, QuatZ
	 */
	public double[] getBodyPose(String name) {
		DoublePointer cartesianQuaturnions = data.xquat();
		DoublePointer cartesianPositions = data.xpos();
		return convert(cartesianPositions, cartesianQuaturnions, getBodyIndex(name));
	}

	/**
	 * 
	 * @param name of a geometry
	 * @return cartesian pose, Xm, Ym, Zm, QuatW, QuatX, QuatY, QuatZ
	 */
	public double[] getGeometryPose(String name) {
		DoublePointer geomPos = model.geom_pos();
		DoublePointer geomQuat = model.geom_quat();
		return convert(geomPos, geomQuat, getGeometryIndex(name));
	}

	/**
	 * 
	 * @param name
	 * @return cartesian size, Xm, Ym, Zm
	 */
	public double[] getGeometrySize(String name) {
		DoublePointer geomSize = model.geom_size();
		DoublePointer coords = geomSize.getPointer(getGeometryIndex(name) * 3);
		double x = coords.getPointer(0).get();
		double y = coords.getPointer(1).get();
		double z = coords.getPointer(2).get();
		return new double[] { x, y, z };
	}

	public HashMap<String, Double> getAllJointPositions() {
		check();
		for (int i = 0; i < getNumberOfJoints(); i++) {
			double position = data.qpos().get(model.jnt_qposadr().get(i));
			String name = getJointName(i);
			positions.put(name, position);
		}
		return positions;
	}
	public HashMap<String, Double> getControlInstance() {
		return setEfforts;
	}
	public void setActualtorCtrl(HashMap<String, Double> control) {
		check();
		for (int i = 0; i < getNumberOfActuators(); i++) {
			Double d2 = control.get(getActuatorName(i));
			if (d2 != null)
				data.ctrl().put(i, d2);
		}
	}

	private HashMap<String, Integer> bodyNameIndexMap = null;
	private HashMap<String, Integer> geometryNameIndexMap = null;
	private HashMap<String, Integer> jointNameIndexMap = null;
	private HashMap<String, Integer> ActuatorNameIndexMap = null;

	public Set<String> getActuatorNames() {
		return getActuatorNameIndexMap().keySet();
	}

	public int getActuatorIndex(String name) {
		check();


		Integer i = getActuatorNameIndexMap().get(name);
		if (i != null)
			return i;
		throw new RuntimeException("Actuator named " + name + " not found");
	}

	public int getNumberOfActuators() {
		check();
		return model.nu();
	}

	public String getActuatorName(int i) {
		check();
		if (i < 0)
			throw new IndexOutOfBoundsException("Actuator index must be positive or zero");
		if (i >= getNumberOfActuators()) {
			throw new IndexOutOfBoundsException("Actuator index must be less than " + i);
		}
		BytePointer byp = modelNames.getPointer(model.name_actuatoradr().getPointer(i).get());
		return byp.getString();
	}

	public Set<String> getJointNames() {
		return getJointNameIndexMap().keySet();
	}

	public int getJointIndex(String name) {
		check();


		Integer i = getJointNameIndexMap().get(name);
		if (i != null)
			return i;
		throw new RuntimeException("Joint named " + name + " not found");
	}

	public int getNumberOfJoints() {
		check();
		return model.njnt();
	}

	public String getJointName(int i) {
		check();
		if (i < 0)
			throw new IndexOutOfBoundsException("Joint index must be positive or zero");
		if (i >= getNumberOfJoints()) {
			throw new IndexOutOfBoundsException("Joint index must be less than " + i);
		}
		BytePointer byp = modelNames.getPointer(jointNameIndexes.getPointer(i).get());
		return byp.getString();
	}

	public Set<String> getBodyNames() {
		return getBodyNameIndexMap().keySet();
	}

	public int getBodyIndex(String name) {
		check();


		Integer i = getBodyNameIndexMap().get(name);
		if (i != null)
			return i;
		throw new RuntimeException("Body named " + name + " not found");
	}

	public Set<String> getGeometryNames() {

		return getGeometryNameIndexMap().keySet();
	}

	public int getGeometryIndex(String name) {
		check();

		Integer i = getGeometryNameIndexMap().get(name);
		if (i != null)
			return i;
		throw new RuntimeException("Geometry named " + name + " not found");
	}

	public MuJoCoGeomType getMuJoCoGeomType(String geom) {
		int type = model.geom_type().getPointer(getGeometryIndex(geom)).get();
		return MuJoCoGeomType.get(type);
	}

	public int getBodyIndexForGeometry(String geomName) {
		int i = getGeometryIndex(geomName);
		return model.geom_bodyid().getPointer(i).get();
	}

	public String getBodyNameForGeometry(String geomName) {
		return getBodyName(getBodyIndexForGeometry(geomName));
	}

	public double getTimestepSeconds() {

		return getOpt().timestep();
	}

	public long getTimestepMilliSeconds() {
		return (long) (getTimestepSeconds() * 1000);
	}

	public void close() {
		connected = false;
		MuJoCoLib.mj_deleteData(d);
		MuJoCoLib.mj_deleteModel(m);
	}

	/**
	 * @return the maccessable
	 */
	public mjModel_ getModel() {
		return model;
	}

	/**
	 * @param maccessable the maccessable to set
	 */
	private void setModel(mjModel_ maccessable) {
		this.model = maccessable;
	}

	/**
	 * @return the daccessable
	 */
	public mjData_ getData() {
		check();
		return data;
	}

	/**
	 * @param daccessable the daccessable to set
	 */
	private void setData(mjData_ daccessable) {
		this.data = daccessable;
	}

	public void step() {
		stepOne();
		if (controller != null)
			controller.controlStep(this);
		stepTwo();
	}

	public void stepOne() {
		MuJoCoLib.mj_step1(m, d);
	}

	public void stepTwo() {
		MuJoCoLib.mj_step2(m, d);
	}

	/**
	 * @return the opt
	 */
	public mjOption_ getOpt() {
		check();
		return opt;
	}

	/**
	 * @param opt the opt to set
	 */
	public void setOpt(mjOption_ opt) {
		this.opt = opt;
	}

	/**
	 * @return the controller
	 */
	public IMujocoController getController() {
		return controller;
	}

	/**
	 * @param controller the controller to set
	 */
	public void setController(IMujocoController controller) {
		this.controller = controller;
	}

	/**
	 * @return the modelNames
	 */
	public BytePointer getModelNames() {
		check();
		return modelNames;
	}

	/**
	 * @param modelNames the modelNames to set
	 */
	private void setModelNames(BytePointer modelNames) {
		this.modelNames = modelNames;
	}

	/**
	 * @return the bodyNameIndexMap
	 */
	public HashMap<String, Integer> getBodyNameIndexMap() {
		if (bodyNameIndexMap == null) {
			setBodyNameIndexMap(new HashMap<>());
			for (int i = 0; i < getNumberOfBodys(); i++) {
				bodyNameIndexMap.put(getBodyName(i), i);
			}
		}
		return bodyNameIndexMap;
	}

	/**
	 * @param bodyNameIndexMap the bodyNameIndexMap to set
	 */
	public void setBodyNameIndexMap(HashMap<String, Integer> bodyNameIndexMap) {
		this.bodyNameIndexMap = bodyNameIndexMap;
	}

	/**
	 * @return the geometryNameIndexMap
	 */
	public HashMap<String, Integer> getGeometryNameIndexMap() {
		if (geometryNameIndexMap == null) {
			setGeometryNameIndexMap(new HashMap<>());
			for (int i = 0; i < getNumberOfGeometrys(); i++) {
				geometryNameIndexMap.put(getGeometryName(i), i);
			}
		}
		return geometryNameIndexMap;
	}

	/**
	 * @param geometryNameIndexMap the geometryNameIndexMap to set
	 */
	public void setGeometryNameIndexMap(HashMap<String, Integer> geometryNameIndexMap) {
		this.geometryNameIndexMap = geometryNameIndexMap;
	}

	/**
	 * @return the jointNameIndexMap
	 */
	public HashMap<String, Integer> getJointNameIndexMap() {
		if (jointNameIndexMap == null) {
			setJointNameIndexMap(new HashMap<>());
			for (int i = 0; i < getNumberOfJoints(); i++) {
				jointNameIndexMap.put(getJointName(i), i);
			}
		}
		return jointNameIndexMap;
	}

	/**
	 * @param jointNameIndexMap the jointNameIndexMap to set
	 */
	public void setJointNameIndexMap(HashMap<String, Integer> jointNameIndexMap) {
		this.jointNameIndexMap = jointNameIndexMap;
	}

	/**
	 * @return the actuatorNameIndexMap
	 */
	public HashMap<String, Integer> getActuatorNameIndexMap() {
		if (ActuatorNameIndexMap == null) {
			setActuatorNameIndexMap(new HashMap<>());
			for (int i = 0; i < getNumberOfActuators(); i++) {
				ActuatorNameIndexMap.put(getActuatorName(i), i);
			}
		}
		return ActuatorNameIndexMap;
	}

	/**
	 * @param actuatorNameIndexMap the actuatorNameIndexMap to set
	 */
	public void setActuatorNameIndexMap(HashMap<String, Integer> actuatorNameIndexMap) {
		ActuatorNameIndexMap = actuatorNameIndexMap;
	}
}
