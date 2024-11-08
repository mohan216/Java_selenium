package org.edu;

public class Education extends Arts {
	
	private void ug() {
		System.out.println("First ug.");
	}
	
	private void pg() {
		System.out.println("Second pg.");
	}
	
	public static void main(String[] args) {
		Education a = new Education();
		a.ug();
		a.pg();
		a.bsc();
		a.bEd();
		a.bA();
		a.bBA();
		a.bE();
		a.bTech();
		a.physiyo();
		a.dental();
		a.mbbs();
	}

}
