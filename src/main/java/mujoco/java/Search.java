package mujoco.java;

import java.io.File;

public class Search {

	public static void main(String[] args) {
		System.out.println("Hello");
		search(new File("D:/"),0);
		search(new File("C:/"),0);
	}
	
	private static void search(File f,int depth) {
		if(depth<3) {
			if(f.isDirectory())
				System.out.println("\tSearching "+f.getAbsolutePath());
		}else {
			// bailing
			return;
		}
		if(f.isDirectory()) {
			for(File f1:f.listFiles()) {
				search(f1,depth+1);
			}
		}
		else {
			if(f.getName().contains("mujoco"))
				System.out.println("FOUND!= "+f.getAbsolutePath());
		}
	}

}
