package com.core.java.training.inheritance;

public class Child extends Parent {
	int c;
	
	public void m4() {
		
	}
	
	public static void main(String[] args) {
		
		Child refChild = new Child();
		refChild.m2();
		refChild.m3();
		int b = refChild.a;
		
		Parent parentRef = new Parent();
		parentRef.m1();
		refChild.c = parentRef.a;
		
		
	}
	

}
