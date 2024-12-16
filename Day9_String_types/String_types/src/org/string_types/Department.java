package org.string_types;

/*
Literal String 
Non literal String 
Immutable
Mutable
*/

public class Department {
	
	
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		String s2 = "Gopal";
		
		String s3 = s1.concat(s2);
		
		s1=s3+s2;
		
		StringBuffer s4 = new StringBuffer("India is my country.");
		
		StringBuffer s5 = new StringBuffer("I am in India.");
		
		StringBuffer s6 = s4.append(s5);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		int x = 12;
		
		System.out.println();
		System.out.println(System.identityHashCode(x));
		System.out.println();
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		System.out.println();
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println();
		
		 System.out.println("China: \u20A5 12,324.13"); 
		 
		 String yuanSymbol = new String(new char[] { 0x20A5 });
	        System.out.println(yuanSymbol);
	        
        int age = 17;
		int creditScore = 780;
		if (age >= 18 && creditScore >=700) {
			System.out.println("Eligible for loan.");
		}
		else {
			System.out.println("Not eligible for loan.");
		}
			
		
	}

}
