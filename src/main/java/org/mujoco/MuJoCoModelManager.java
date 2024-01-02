package org.mujoco;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.IntPointer;
import org.mujoco.MuJoCoLib.mjData;
import org.mujoco.MuJoCoLib.mjData_;
import org.mujoco.MuJoCoLib.mjModel;
import org.mujoco.MuJoCoLib.mjModel_;
import org.mujoco.MuJoCoLib.mjOption_;
import org.mujoco.MuJoCoLib.mjVFS;

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
	public MuJoCoModelManager(File config){
		loadFromFile(config);
	}
	public MuJoCoModelManager(String jarpath) throws IOException{
		File config = new File("model/"+jarpath);

		System.out.println("Searching for models in "+config.getAbsolutePath());
		loadFromFile(config);

	}
	private void loadFromFile(File config) {
		if(!config.exists())
			throw new RuntimeException("Config File does not exist "+config);
		int error_sz = 1000;
		BytePointer error = new BytePointer(error_sz);
		System.out.println("MuJoCo loading configureation file "+config.getAbsolutePath());
		m = MuJoCoLib.mj_loadXML(config.getAbsolutePath(), null, error,error_sz);
		if(m==null)
			throw new RuntimeException("Model File Failed to load "+error.getString()+" code "+error_sz);
		System.out.println("MuJoCo model loaded " + config.getAbsolutePath());
		d = MuJoCoLib.mj_makeData(m);
		setModel(new mjModel_(m));
		setData(new mjData_(d));
		setOpt(new mjOption_(getModel().opt()));
		setModelNames(model.names());
		jointNameIndexes = model.name_jntadr();
		bodyNameIndex = model.name_bodyadr();
	}
	public double getCurrentSimulationTimeSeconds() {
		return data.time();
	}
	public int getNumberOfJoints() {
		return model.njnt();
	}
	public String getJointName(int i) {
		if(i<0)
			throw new IndexOutOfBoundsException("Joint index must be positive or zero");
		if(i>=getNumberOfJoints()) {
			throw new IndexOutOfBoundsException("Joint index must be less than "+i);
		}
		BytePointer byp = modelNames.getPointer(jointNameIndexes.getPointer(i).get());
		return byp.getString();
	}
	public int getNumberOfBodys() {
		return model.nbody();
	}
	public String getBodyName(int i) {
		if(i<0)
			throw new IndexOutOfBoundsException("Body index must be positive or zero");
		if(i>=getNumberOfBodys()) {
			throw new IndexOutOfBoundsException("Body index must be less than "+i);
		}
		BytePointer byp = modelNames.getPointer(bodyNameIndex.getPointer(i).get());
		return byp.getString();
	}
	
	
	public double getTimestepSeconds() {
		return getOpt().timestep();
	}
	public long getTimestepMilliSeconds() {
		return (long)(getTimestepSeconds()*1000);
	}
	public void close() {
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
		return data;
	}

	/**
	 * @param daccessable the daccessable to set
	 */
	public void setData(mjData_ daccessable) {
		this.data = daccessable;
	}
	public void step() {
		stepOne();
		if(controller!=null)
			controller.controlStep(data, model);
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
		return modelNames;
	}
	/**
	 * @param modelNames the modelNames to set
	 */
	public void setModelNames(BytePointer modelNames) {
		this.modelNames = modelNames;
	}
}
