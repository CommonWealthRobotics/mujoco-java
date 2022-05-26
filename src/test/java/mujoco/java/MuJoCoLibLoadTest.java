package mujoco.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MuJoCoLibLoadTest {

	@Test
	void test() {
		System.out.println("Statup test..");
		MuJoCo m= new MuJoCo();
		System.out.println("Loaded MuJoCo "+m);
	}

}
