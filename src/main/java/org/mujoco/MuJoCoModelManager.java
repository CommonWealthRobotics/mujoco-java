package org.mujoco;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.bytedeco.javacpp.BytePointer;
import org.mujoco.MuJoCoLib.mjData;
import org.mujoco.MuJoCoLib.mjData_;
import org.mujoco.MuJoCoLib.mjModel;
import org.mujoco.MuJoCoLib.mjModel_;
import org.mujoco.MuJoCoLib.mjVFS;

public class MuJoCoModelManager {
	MuJoCoLib lib = new MuJoCoLib();

	private mjModel m;
	private mjData d;
	private mjModel_ maccessable;
	private mjData_ daccessable;

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
	}
	
	public void close() {
		MuJoCoLib.mj_deleteData(d);
		MuJoCoLib.mj_deleteModel(m);
	}

	/**
	 * @return the maccessable
	 */
	public mjModel_ getModel() {
		return maccessable;
	}

	/**
	 * @param maccessable the maccessable to set
	 */
	private void setModel(mjModel_ maccessable) {
		this.maccessable = maccessable;
	}

	/**
	 * @return the daccessable
	 */
	public mjData_ getData() {
		return daccessable;
	}

	/**
	 * @param daccessable the daccessable to set
	 */
	public void setData(mjData_ daccessable) {
		this.daccessable = daccessable;
	}
	public void step() {
		stepOne();
		stepTwo();
	}
	public void stepOne() {
		MuJoCoLib.mj_step1(m, d);
	}
	public void stepTwo() {
		MuJoCoLib.mj_step2(m, d);
	}
}
