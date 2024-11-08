package org.bank;

public class BankInfo extends AxisBank {
	
	private void saving() {
		System.out.println("You have a savings account.");
	}
	
	private void fixed() {
		System.out.println("You have a fixed account.");
	}
	
	public static void main(String[] args) {
		BankInfo a = new BankInfo();
		a.saving();
		a.fixed();
		a.deposit();
	}
	
}
