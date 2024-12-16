package org.test;

public class CCC extends CC{
	public CCC() {
		super("Hello.");
		System.out.println("In default constructor of CCC which uses super.");
	}
	
	public static void main(String[] args) {
		CCC b = new CCC();
	}
}
