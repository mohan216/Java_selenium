package org.variabletypes;

public class Variables {
	
	//instance variables
	private int instance = 678;
	
	public static int staticVar = 78;
	
	//Local variables
	private void temp() {
		// inside method
		int x = 5;
		System.out.println(x);

	}
	
	//inside constructor
	public Variables() {
		int insideConst = 100;
		System.out.println(insideConst);
		System.out.println(this.staticVar);
	}
	
	public static void main(String[] args) {
		// inside loop
		for (int i=0; i<=6; i++) {
			System.out.println(i);
		}
		Variables a = new Variables();
		a.temp();
		System.out.println(a.instance);
		a.instance = 15;
		System.out.println(a.instance);
		System.out.println(staticVar);
		staticVar = 89;
		System.out.println(staticVar);
		a.staticVar = 109;
		System.out.println(staticVar);
	}

}
