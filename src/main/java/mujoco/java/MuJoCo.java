package mujoco.java;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;


@Properties(
    value = @Platform(
        includepath = {"/path/to/include/"},
        preloadpath = {"/path/to/deps/"},
        linkpath = {"/path/to/lib/"},
        include = {"NativeLibrary.h"},
        preload = {"DependentLib"},
        link = {"NativeLibrary"}
    ),
    target = "NativeLibrary"
)

public class MuJoCo implements InfoMapper {
	public void map(InfoMap infoMap) {
    }
}
