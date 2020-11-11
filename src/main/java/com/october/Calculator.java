package com.october;

public class Calculator {
	
	public int addition(int a, int b) {
		if (a>b) {
			System.out.println("a>b");
		} else {
			System.out.println("a<b");
		}
		return a+b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}
	
	public double division(int a, int b) {
		return a/b;
	}
	

}
