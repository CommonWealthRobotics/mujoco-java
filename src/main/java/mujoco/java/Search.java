package mujoco.java;

import java.io.File;

public class Search {

	public static void main(String[] args) {
		System.out.println("Hello");
		search(new File("C:/"));
	}
	
	private static void search(File f) {
		if(f.isDirectory()) {
			for(File f1:f.listFiles()) {
				search(f1);
			}
		}
		else {
			if(f.getName().contains("mujoco"))
				System.out.println(f.getAbsolutePath());
		}
	}

}
