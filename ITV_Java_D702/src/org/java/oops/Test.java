package org.java.oops;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Abstract Class---------------");
		AbstractionTest obj=new AbstractionTest();
		
		obj.m1();
		
		System.out.println("Interface---------------");
		InterfaceClass obj2=new InterfaceClass();
		System.out.println(InterfaceClass.a);
		obj2.m1();
		obj2.m2();
	}

}
