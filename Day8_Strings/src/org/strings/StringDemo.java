package org.strings;

public class StringDemo {
	
	private void empName() {
		String s1 = "Java";
		String s4 ="java";
		String s5 = "  Country  ";
		char a = s1.charAt(1);
		int b = s1.indexOf('v');
		int c = s1.lastIndexOf('a');
		String s2,s3;
		
		s2 = s1.toUpperCase();
		s3 = s1.toLowerCase();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s2);
		System.out.println(s3);
		
		boolean aB = s1.isEmpty();
		System.out.println(aB);
		
		boolean startsWith = s1.startsWith("Ja");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("va");
		System.out.println(endsWith);
		
		boolean contains = s1.contains("av");
		System.out.println(contains);
		
		boolean equals = s1.equals(s4);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s4);
		System.out.println(equalsIgnoreCase);
		
		int compareTo = s1.compareTo(s4);
		System.out.println(compareTo);
		
		int length = s1.length();
		System.out.println(length);
		
		String replace = s1.replace('a', 'e');
		System.out.println(replace);
		
		String replaceAll = s1.replaceAll("av", "Hello");
		System.out.println(replaceAll);
		
		System.out.println(s5);
		String trim = s5.trim();
		System.out.println(trim);
		
		String subString = s5.substring(6);
		System.out.println(subString);
		
		String subString2 = s5.substring(6,7);
		System.out.println(subString2);
		
		String concat = s1.concat(s5);
		System.out.println(concat);
		
		String[] split = s1.split("v");
		
		 for (String part : split) {
	            System.out.print(part+ " "); // Printing each part
	        }	

	}
	
	public static void main(String[] args) {
		
		StringDemo a = new StringDemo();
		a.empName();
		
	}

}
