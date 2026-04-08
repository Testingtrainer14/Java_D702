package org.java.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
	
	void m1() {
		
		throw new ArithmeticException();
	}

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		System.out.println("Strat----");

		FileInputStream fis=new FileInputStream("");
		Exception1 obj=new Exception1();
		obj.m1();
		
		Thread.sleep(10000);

		System.out.println("End----");
	}

}