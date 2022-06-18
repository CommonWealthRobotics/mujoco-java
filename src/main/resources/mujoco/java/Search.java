package mujoco.java;

import java.io.File;

public class Search {

	public static void main(String[] args) {
		System.out.println("Hello");
		search(new File("D:/"),0);
		search(new File("C:\\Users\\runneradmin\\AppData\\Local\\Temp\\"),0);
	}
	
	private static void search(File f,int depth) {
		
		if(f.isDirectory()) {
			if(depth<5) {
				if(depth<2)
					System.out.println("\tSearching "+f.getAbsolutePath());
			}else {
				// bailing
				return;
			}
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
