package org.java.oops;

public class InterfaceClass implements Interface1, Interface2 {

	@Override
	public void m1() {
		System.out.println("I became normal method");		
	}

	@Override
	public int m2() {
		System.out.println("M2");
		return 10;
	}

	@Override
	public void m3() {
		System.out.println("M3 ");
	}

}
