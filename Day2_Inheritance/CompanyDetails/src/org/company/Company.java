package org.company;

public class Company extends Client {
	
	private void companyName() {
		System.out.println("Nvidia");
	}
	
	public static void main(String[] args) {
		Company a = new Company();
		a.companyName();
		a.clientName();
	}
}
