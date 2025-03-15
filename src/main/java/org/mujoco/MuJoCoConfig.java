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
		// Add this to your MuJoCoConfig.java
		// Add this to your JavaCPP configuration class
		// This adds custom code at the beginning of the generated file
		infoMap.put(new Info().cppText(
		    // Add a macro that will be used for string assignments
		    "#include <string>\n" +
		    "#define ASSIGN_TO_STRING_PTR(ptr, val) if(ptr) *ptr = val;\n" +
		    
		    // Create a function to override the problematic assignments
		    "template<typename T>\n" +
		    "void assign_string(T* ptr, const std::string& val) {\n" +
		    "    if(ptr) *ptr = val;\n" +
		    "}\n" +
		    
		    // This is the critical part - redefine the cast operator to call our safe function
		    "#define __JAVACPP_HACK\n" +
		    "#ifdef __JAVACPP_HACK\n" +
		    "#define JAVACPP_STRING_CAST(x)\n" +
		    "#endif\n"
		));

		// Tell JavaCPP how to handle specific problematic cases
		infoMap.put(new Info("ptr->meshdir = (std::basic_string< char >&)adapter0")
		    .define(false)
		    .cppText("    assign_string(ptr->meshdir, adapter0)"));

		infoMap.put(new Info("ptr->modelname = (std::basic_string< char >&)adapter0")
		    .define(false)
		    .cppText("    assign_string(ptr->modelname, adapter0)"));

		infoMap.put(new Info("ptr->modelfiledir = (std::basic_string< char >&)adapter0")
		    .define(false)
		    .cppText("    assign_string(ptr->modelfiledir, adapter0)"));

		// Add similar entries for other problematic assignments


	}
}