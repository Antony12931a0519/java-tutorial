package com.core.java.training.datatypes;

public class DatatypesDemo {
//non local variables(variable initilizations)
	String name = "JavaTraining";
	static int age = 20;
	char initial = 'A';
	final double weight = 65.7;//final non static  variable
	final static double weight1 = 65.7;//final  static  variable
//	int age= 30;

	public static void main(String[] args) {
		int age= 30;//local variables
		
		
		DatatypesDemo ref = new DatatypesDemo();
		
		System.out.println("Hey am executed!");
		
		System.out.println("The value of name is :"+ref.name);
		
		System.out.println("The value of weight is :"+ref.weight);
		System.out.println("The value of weight1 is :"+weight1);
		System.out.println(age);

	}

}
