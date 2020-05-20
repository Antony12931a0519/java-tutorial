package com.core.java.training.methods;

public class MethodDemo {

	

	public void addition(int a, int b) {

		System.out.println(a + b);
	}

	public void div() {

		int a = 10;
		int b = 3;

		System.out.println(a / b);
	}

	//pre defined
	public static void main(String[] args) {

		MethodDemo ref = new MethodDemo();

		int subtraction = subtraction(10, 8);
		System.out.println(subtraction);
		String message = wish("Antony");
		System.out.println(message);
		ref.addition(12, 2);
		ref.div();

	}
	public static int subtraction(int a, int b) {

		
		return (a - b);
	}

	public static String wish(String name) {

		return "Hello " + name;
	}
	

}
