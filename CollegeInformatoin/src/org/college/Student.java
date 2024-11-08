package org.college;

public class Student extends College{
	
	private void studentName() {
		System.out.println("Nitin");
	}
	
	private void studentDept() {
		System.out.println("Maths");
	}
	
	private void studentId() {
		System.out.println("5632");
	}

	public static void main(String[] args) {
		Student a = new Student();
		a.studentName();
		a.studentDept();
		a.studentId();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		a.hostelName();
		a.deptName();		
	}
}
