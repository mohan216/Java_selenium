package org.singletondemo;

public class ClassB {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.method1();
	}
}
