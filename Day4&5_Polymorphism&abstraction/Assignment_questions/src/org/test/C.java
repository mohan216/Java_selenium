package org.test;

public class C extends A{
	public void methodC(){
		System.out.println("In class C.");
	}

	public static void main(String[] args) {
		A a = new A();
		C c = new C();
		a.methodA();
		c.methodC();
		c.methodA();
	}
}
