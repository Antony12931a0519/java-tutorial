package com.core.java.training.method.overloading;

public class MethodOverloadingDemo {

	public void add(int a, int b) {

	}
	
	public void add(int a, int b,int c) {

	}
	
	public void add(int a, int b,int c,int d) {

	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo ref = new MethodOverloadingDemo();
		ref.add(1,2);
		
	}

}
