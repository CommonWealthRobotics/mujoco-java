package org.mujoco;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(value = { @Platform(includepath = { "/tmp/mujoco/include/" }, linkpath = { "/tmp/mujoco/lib/" }, include = {
		"mujoco/mjtnum.h",

		"mujoco/mjexport.h", "mujoco/mujoco.h", "mujoco/mjmacro.h", "mujoco/mjthread.h", "mujoco/mjdata.h",
		"mujoco/mjmodel.h", "mujoco/mjrender.h", "mujoco/mjui.h", "mujoco/mjvisualize.h",

		"mujoco/mjplugin.h", "mujoco/mjspec.h",
				// "mujoco/mjxmacro.h" // This will not work with JavaCPP
		}, link = { "mujoco" }),
		@Platform(value = "windows-x86_64", includepath = { "mujoco/include/",
				"C:/Users/runneradmin/AppData/Local/Temp/mujoco/include/" }, linkpath = { "mujoco/lib/",
						"C:/Users/runneradmin/AppData/Local/Temp/mujoco/lib/" }) }, target = "org.mujoco.MuJoCoLib")

public class MuJoCoConfig implements InfoMapper {
	public void map(InfoMap infoMap) {
		infoMap.put(new Info("MJ_STATIC").define(true));
		infoMap.put(new Info("mjtNum").cast().valueTypes("double").pointerTypes("DoublePointer"));
//		infoMap.put(new Info("mjString")
//			    .cast()
//			    .valueTypes("@StdString String")
//			    .pointerTypes("@StdString BytePointer"));
		// Define mjString as an opaque pointer type to avoid direct conversions
		// Add this to your JavaCPP configuration
		//infoMap.put(new Info().define("mjString std::string"));

		// Then skip the mjString type and use String/BytePointer directly
//		infoMap.put(new Info("mjString").skip());
//		infoMap.put(new Info("std::string").annotations("@StdString").pointerTypes("BytePointer").valueTypes("String"));

		// Handle mjString (std::string)
		infoMap.put(new Info("mjString").skip());
		infoMap.put(new Info("std::string").annotations("@StdString").pointerTypes("BytePointer").valueTypes("String"));

		// Handle mjStringVec (std::vector<std::string>)
		infoMap.put(new Info("mjStringVec").skip());
		infoMap.put(new Info("std::vector<std::string>").pointerTypes("StringVector").valueTypes("StringVector"));

		// Handle mjIntVec (std::vector<int>)
		infoMap.put(new Info("mjIntVec").skip());
		infoMap.put(new Info("std::vector<int>").pointerTypes("IntPointer").valueTypes("IntBuffer"));

		// Handle mjIntVecVec (std::vector<std::vector<int> >)
		infoMap.put(new Info("mjIntVecVec").skip());
		infoMap.put(new Info("std::vector< std::vector<int> >").pointerTypes("PointerPointer<IntPointer>"));

		// Handle mjFloatVec (std::vector<float>)
		infoMap.put(new Info("mjFloatVec").skip());
		infoMap.put(new Info("std::vector<float>").pointerTypes("FloatPointer").valueTypes("FloatBuffer"));

		// Handle mjFloatVecVec (std::vector<std::vector<float> >)
		infoMap.put(new Info("mjFloatVecVec").skip());
		infoMap.put(new Info("std::vector< std::vector<float> >").pointerTypes("PointerPointer<FloatPointer>"));

		// Handle mjDoubleVec (std::vector<double>)
		infoMap.put(new Info("mjDoubleVec").skip());
		infoMap.put(new Info("std::vector<double>").pointerTypes("DoublePointer").valueTypes("DoubleBuffer"));

		// Handle mjByteVec (std::vector<std::byte>)
//		infoMap.put(new Info("mjByteVec").skip());
//		infoMap.put(new Info("std::vector<std::byte>").pointerTypes("BytePointer").valueTypes("ByteBuffer"));
		// For unsigned char:
		infoMap.put(new Info("mjByteVec").skip());
		infoMap.put(new Info("std::vector<unsigned char>").pointerTypes("BytePointer").valueTypes("ByteBuffer"));
		
		// mjString
		// infoMap.put(new
		// Info("mjString").cast().valueTypes("String").pointerTypes("StringPointer"));
		// Skip mjString type

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
		infoMap.put(new Info("mjEXTERNC").skip());
		infoMap.put(new Info("mjDLLMAIN").skip());
		infoMap.put(new Info("XMJV").skip());
		// infoMap.put(new Info("X").skip());
		// infoMap.put(new Info("MJOPTION_FLOATS").skip());
		// infoMap.put(new Info("MJOPTION_INTS").skip());
		// infoMap.put(new Info("MJOPTION_SCALARS").skip());
		infoMap.put(new Info("mjPLUGIN_LIB_INIT").skip());
		infoMap.put(new Info("mjfPluginLibraryLoadCallback").skip());
		infoMap.put(new Info("mjfGeneric").skip());
		infoMap.put(new Info("mjfConFilt").skip());
		infoMap.put(new Info("mjfSensor").skip());
		infoMap.put(new Info("mjfTime").skip());
		infoMap.put(new Info("mjfAct").skip());
		infoMap.put(new Info("mjfCollision").skip());
		// mj__freeStack
		infoMap.put(new Info("mj__freeStack").skip());
		// mj__markStack
		infoMap.put(new Info("mj__markStack").skip());

		// XNV
		infoMap.put(new Info("XNV").skip());
		// mjs_findElement
		infoMap.put(new Info("mjs_findElement").skip());

		// mjs_firstElement
		infoMap.put(new Info("mjs_firstElement").skip());
		// mjs_firstChild
		infoMap.put(new Info("mjs_firstChild").skip());
		// mjSpec_modelfiledir
		infoMap.put(new Info("mjs_setString").skip());
		infoMap.put(new Info("mjs_getString").skip());
		//modelname

		infoMap.put(new Info("modelname").skip());
		//modelfiledir
		infoMap.put(new Info("modelfiledir").skip());
		
	}
}