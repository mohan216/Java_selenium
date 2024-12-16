package org.scannerclass;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		//Create Scanner Object to use Scanner methods
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String nextLine = scan.nextLine();
		
		System.out.println("Enter a word:");
		String next = scan.next();
		
		System.out.println("Enter a Integer:");
		int nextInt = scan.nextInt();
		
		System.out.println("Enter a byte:");
		byte nextByte = scan.nextByte();
		
		System.out.println("Enter a short:");
		short nextShort = scan.nextShort();
		
		System.out.println("Enter a long:");
		long nextLong = scan.nextLong();
		
		System.out.println("Enter a float:");
		float nextFloat = scan.nextFloat();
		
		System.out.println("Enter a double:");
		double nextDouble = scan.nextDouble();
		
		System.out.println("Enter a boolean:");
		boolean nextBoolean = scan.nextBoolean();
		
		System.out.println("String is:" + nextLine + "Word is:" + next + " Int is:" + nextInt 
				+ "\nByte is:" + nextByte + "Short is:" + nextShort + " Long is:" + 
				nextLong + "\nFloat is:" + nextFloat + " Double is:" + nextDouble
				+ "Boolean is:" + nextBoolean);
		
		
		
		
	}
	
	
	
	
	
	

}
