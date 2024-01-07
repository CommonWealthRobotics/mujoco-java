package org.mujoco;

import org.mujoco.MuJoCoLib.mjData_;
import org.mujoco.MuJoCoLib.mjModel_;

public interface IMujocoController {
	public void controlStep(mjData_ data,mjModel_ model);
}
