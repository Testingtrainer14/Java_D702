package org.java.oops;

public class AbstractionTest extends AbstractClass1 {

	@Override
	void m1() {
		for(int i=1; i<=100000; i++) {
			System.out.println(i*20);
		}
		System.out.println("I became normal method");
		
	}
	
	

}
