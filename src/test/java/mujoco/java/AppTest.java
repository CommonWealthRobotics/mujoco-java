/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mujoco.java;

import org.junit.Test;
import org.mujoco.MuJoCoLib;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        MuJoCoLib lib = new MuJoCoLib();
        System.out.println("Starting "+lib.mj_versionString());
    }
}
