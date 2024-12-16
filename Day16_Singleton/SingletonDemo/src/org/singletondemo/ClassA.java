package org.singletondemo;

public class ClassA {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.method1();
	}
}
