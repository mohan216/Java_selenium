package org.emp;

public class Employee {
	
	private void empId(int empId) {
		System.out.println("Employee Id is: "+ empId);
	}
	
	private void empId(long empId) {
		System.out.println("Employee Id is: "+ empId);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(3456);
		e.empId(4564654645646464l);
	}
}

/*
Find the answer for below questions and tell whether it is possible or not?
I implements I-f
I implements C-f
I implements A-f
I extends I-f
I extends C-f
I extends A-f

C implements I-y
C implements C-f
C implements A-f
C extends I-f
C extends C-y
C extends A-y

A implements I-y
A implements C-f
A implements A-f
A extends I-f
A extends C-f
A extends A-y

A-abstract class
C-class
I- interface

Summary Table of Possibility (True/False)
Statement	Possible (True/False)
I implements I-f	False
I implements C-f	False
I implements A-f	False
I extends I-f	True
I extends C-f	False
I extends A-f	False
C implements I-y	True
C implements C-f	False
C implements A-f	False
C extends I-f	False
C extends C-y	True
C extends A-y	True
A implements I-y	True
A implements C-f	False
A implements A-f	False
A extends I-f	False
A extends C-f	True
A extends A-y	True
*/