package org.mujoco;

import org.mujoco.MuJoCoLib.mjData;
import org.mujoco.MuJoCoLib.mjModel;

public interface IMujocoController {
	public void controlStep(MuJoCoModelManager manager);
}
