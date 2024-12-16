package org.constructor;

public class Employee extends Department{
	
	//method
	private void name() {
		System.out.println("Rohit.");

	}
	
	//Default Constructor
	public Employee() {
		this(5255);
		System.out.println("Inside default constructor.");
	}
	
	public Employee(int id) {
		this("Charan.");
		System.out.println("Your id is:"+ id);
	}
	
	public Employee(String name) {
		super();
		System.out.println("Employee name is:"+ name);
	}
	
	public static void main(String[] args) {
		
		Employee a = new Employee();
		a.name();
		
		
	}

}
