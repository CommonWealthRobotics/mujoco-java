package mujoco.java;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;


@Properties(
    value = @Platform(
        includepath = {"/tmp/mujoco/include/mujoco/"},
        linkpath = {"/tmp/mujoco/lib/"},
        include = {
        		"mjdata.h",
        		"mjexport.h",
        		"mjtnum.h",
        		"mjmodel.h",
        		"mjrender.h",
        		"mjui.h",
        		"mjvisualize.h",
        		"mjxmacro.h",
        		"mujoco.h"},  
        link = {"MuJoCoLib"}
    ),
    target = "org.mujoco.MuJoCoLib"
)

public class MuJoCoConfig implements InfoMapper {
	public void map(InfoMap infoMap) {
    }
}