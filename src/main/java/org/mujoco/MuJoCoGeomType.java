package org.mujoco;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum MuJoCoGeomType {
	mjGEOM_PLANE(MuJoCoLib.mjGEOM_PLANE), // plane
	mjGEOM_HFIELD(MuJoCoLib.mjGEOM_HFIELD), // height field
	mjGEOM_SPHERE(MuJoCoLib.mjGEOM_SPHERE), // sphere
	mjGEOM_CAPSULE(MuJoCoLib.mjGEOM_CAPSULE), // capsule
	mjGEOM_ELLIPSOID(MuJoCoLib.mjGEOM_ELLIPSOID), // ellipsoid
	mjGEOM_CYLINDER(MuJoCoLib.mjGEOM_CYLINDER), // cylinder
	mjGEOM_BOX(MuJoCoLib.mjGEOM_BOX), // box
	mjGEOM_MESH(MuJoCoLib.mjGEOM_MESH), // mesh
	mjGEOM_SDF(MuJoCoLib.mjGEOM_SDF); // signed distance field

	private static final Map<Integer, MuJoCoGeomType> lookup = new HashMap<Integer, MuJoCoGeomType>();

	static {
		for (MuJoCoGeomType s : EnumSet.allOf(MuJoCoGeomType.class))
			lookup.put(s.getCode(), s);
	}

	private int code;

	private MuJoCoGeomType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static MuJoCoGeomType get(int code) {
		return lookup.get(code);
	}
}
