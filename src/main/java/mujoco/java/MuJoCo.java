package mujoco.java;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;


@Properties(
    value = @Platform(
        includepath = {"/tmp/mujoco/include/mujoco/"},
        preloadpath = {"/tmp/mujoco/lib/"},
        linkpath = {"/tmp/mujoco/lib/"},
        include = {"mujoco.h"},
        preload = {"libmujoco.so"},
        link = {"MuJoCoLib"}
    ),
    target = "MuJoCoLib"
)

public class MuJoCo implements InfoMapper {
	public void map(InfoMap infoMap) {
    }
}