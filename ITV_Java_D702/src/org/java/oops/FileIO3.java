package org.java.oops;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO3 {
	
	public static void main(String[] args) throws IOException {
		
		//File file=new File("example2.txt");
		Scanner reader=new Scanner(new File("example2.txt"));
		
		while(reader.hasNextLine()) {
			String data=reader.nextLine();
			System.out.println(data);
		}
		
		reader.close();
	}

}
