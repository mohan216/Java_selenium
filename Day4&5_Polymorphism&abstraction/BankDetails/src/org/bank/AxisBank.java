package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Inside Axis Bank deposit.");
		//super.deposit();
	}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
	}

}
