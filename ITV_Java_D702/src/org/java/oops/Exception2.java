package org.java.oops;

public class Exception2 {
	
	public static void main(String[] args) {
		
		System.out.println("Start----------------");
		
		try {
			int a=10;
			System.out.println(a);
			System.out.println(a/0);
			}
		catch (ArithmeticException e) {
				e.printStackTrace();
				
			}finally {
				System.out.println("I will get executred with or without EH");
			}
		
		System.out.println("End----------------");
	}

}
