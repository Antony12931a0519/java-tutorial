package com.core.java.training.method.overriding;

public class BasicCalculator extends Calculator {
	public void add() {
		System.out.println("Addition methodhikjiojojiojoo");
	}
	
	public static void main(String[] args) {
		BasicCalculator ref = new BasicCalculator();
		ref.add();
	}

}
