package org.java.oops;

import java.io.File;
import java.io.IOException;

public class FileIO1 {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("example.txt");
		
		if(file.createNewFile()) {
			System.out.println("File created-"+file.getName());
		}else {
			System.out.println("Files is already exist");
		}
	}

}
