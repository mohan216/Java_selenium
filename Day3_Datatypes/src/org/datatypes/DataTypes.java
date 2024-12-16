package org.datatypes;

public class DataTypes {
	
	//byte, short, int, long
	//float, double
	//char, String
	//boolean
	
	private void dataTypes() {
		
		byte a = 11;
		short a2 = 456;
		int a3 = 3435;
		long a4 = 78787887l;
		
		float b1 = 5.6f;
		double b2 = 67.78970;
		
		char c = 'a';
		String c2 = "How are you?";
		
		boolean d1 = true;
		boolean d2 = false;
		
				
		System.out.println("Value of byte is:" + a + ".\n" +
				"Value of short is:" + a2 + ".\n" +
				"Value of integer is:" + a3 + ".\n" +
				"Value of long is:" + a4 + ".\n" +
				"Value of float is:" + b1 + ".\n" +
				"Value of double is:" + b2 + ".\n" +
				"Value of char is:" + c + ".\n" +
				"Value of String is:" + c2 + ".\n" +
				"Value of boolean d1 is:" + d1 + ".\n" +
				"Value of boolean d1 is:" + d2 + ".\n");
		
		
	}
	
	public static void main(String[] args) {
		
		DataTypes temp = new DataTypes();
		temp.dataTypes();
		System.out.println("My name is \"Ashok\".");
	}

}
