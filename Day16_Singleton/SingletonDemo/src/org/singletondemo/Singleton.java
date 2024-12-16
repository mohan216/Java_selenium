package org.singletondemo;

public class Singleton {
	// Singleton Class removes the need to create multiple objects of the same class
	// to use the methods of the class.
	// Only one instance(object) of the class is present throughout the session
	// This is achieved by using private constructor, a static getInstance method and a static variable.
	
	public static Singleton sing = new Singleton();//static instance of the class
	
	// private constructor
	private Singleton() {
	}
	
	// static getInstance method
	
	public static Singleton getInstance() {
		if (sing == null) {
			sing = new Singleton(); 
		}
		return sing;
	}
	
	public void method1() {
		System.out.println("In method1 of Singleton class. "
				+ "Contains username and password.");
	}

}
