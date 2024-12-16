package org.test;

public class B extends A{
	public void methodA(){
		System.out.println("In class B.");
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.methodA();
		b.methodA();
	}
}
