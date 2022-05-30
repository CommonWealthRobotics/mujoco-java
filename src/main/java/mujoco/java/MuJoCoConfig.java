package mujoco.java;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;


@Properties(
    value = @Platform(
        includepath = {"/tmp/mujoco/include/"},
        linkpath = {"/tmp/mujoco/lib/"},
        include = {
        		"mujoco/mjexport.h",
        		"mujoco/mjdata.h",
        		"mujoco/mjmodel.h",
        		"mujoco/mjrender.h",
        		"mujoco/mjtnum.h",
        		"mujoco/mjui.h",
        		"mujoco/mjvisualize.h",
        		"mujoco/mujoco.h"      		
        		},  
        link = {"mujoco"}
    ),
    target = "org.mujoco.MuJoCoLib"
)

public class MuJoCoConfig implements InfoMapper {
	public void map(InfoMap infoMap) {
		infoMap.put(new Info("MJ_STATIC").define(true));
		infoMap.put(new Info("mjtNum").cast().valueTypes("double").pointerTypes("DoublePointer"));
		infoMap.put(new Info("MJOPTION_VECTORS").skip());
		infoMap.put(new Info("MJMODEL_POINTERS").skip());
		infoMap.put(new Info("MJDATA_VECTOR").skip());
		infoMap.put(new Info("mjFREESTACK").skip());
		infoMap.put(new Info("mjMARKSTACK").skip());
		infoMap.put(new Info("mju_sqrt").skip());
		infoMap.put(new Info("mju_exp").skip());
		infoMap.put(new Info("mju_sin").skip());
		infoMap.put(new Info("mju_cos").skip());
		infoMap.put(new Info("mju_tan").skip());
		infoMap.put(new Info("mju_asin").skip());
		infoMap.put(new Info("mju_acos").skip());
		infoMap.put(new Info("mju_atan2").skip());
		infoMap.put(new Info("mju_tanh").skip());
		infoMap.put(new Info("mju_pow").skip());
		infoMap.put(new Info("mju_abs").skip());
		infoMap.put(new Info("mju_log").skip());
		infoMap.put(new Info("mju_log10").skip());
		infoMap.put(new Info("mju_floor").skip());
		infoMap.put(new Info("mju_ceil").skip());
		infoMap.put(new Info("MUJOCO_HELPER_DLL_IMPORT").skip());
		infoMap.put(new Info("MUJOCO_HELPER_DLL_EXPORT").skip());
		infoMap.put(new Info("MUJOCO_HELPER_DLL_LOCAL").skip());
		infoMap.put(new Info("mjCOLLISIONFUNC").skip());
    }
}