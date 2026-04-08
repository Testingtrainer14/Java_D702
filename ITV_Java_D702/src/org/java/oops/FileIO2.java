package org.java.oops;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO2 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("File Write----------------------");
		FileWriter writer=new FileWriter("example.txt");
		writer.write("Hi Team, I am learning Java");
		writer.close();
		
		System.out.println("File Read----------------------");
		FileReader reader=new FileReader("example2.txt");
		
		int a;
		
		while((a=reader.read())!=-1) {
			System.out.print((char)(a));
		}
		
		reader.close();
		
		System.out.println();
		System.out.println("File Delete----------------------");
		
		
		File file=new File("example2.txt");
		if(file.delete()) {
			System.out.println("Delete the file "+file.getName());
		}else {
			System.out.println("file has not been deleted");
		}
	}

}
