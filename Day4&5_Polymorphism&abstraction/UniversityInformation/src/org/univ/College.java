package org.univ;

public class College extends University{
	
	
	public void ug() {
		System.out.println("You are inside College ug.");
	}
	
	public void pg() {
		System.out.println("You are inside College pg.");
	}
	
	public static void main(String[] args) {
		College a = new College();
		a.ug();
		a.pg();
	}

}
