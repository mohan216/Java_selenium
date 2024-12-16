package org.test;

public class CC {

	public CC() {
		System.out.println("In default constructor of CC.");
	}
	
	public CC(int a) {
		this();
		System.out.println("In parameterized constructor of CC with int.");
	}
	public CC(String b) {
		this(5);
		System.out.println("In parameterized constructor of CC with String:" + b);
	}
	
	public static void main(String[] args) {
		CC a = new CC("Hi");
	}
	
}
