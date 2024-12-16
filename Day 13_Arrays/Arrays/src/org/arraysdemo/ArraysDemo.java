package org.arraysdemo;

public class ArraysDemo {

		public static void main(String[] args) {
			
			// 1d array
			int a[] = new int[5];
			
			for(int i=0; i<5; i++) {
				a[i] = 10*i -1;
			}
			
			for (int b: a) {
				System.out.println(b);
			}
			
			// 2 d array
			int c[][] = new int[3][3];
			
			
			for (int i= 0; i<=2;i++) {
				for (int j=0; j<2;j++) {
					c[i][j]= 5*i+5*j+3;
				}
			}
			
			for (int d[]: c) {
				for (int e: d) {
					System.out.print(e + " ");
				}
				System.out.println();
			}
			
			// Hardcode values
			// 1d array
			int f[]= {9,0,54};
			
			for (int b: f) {
				System.out.println(b);
			}
			
			// 2d array
			int g[][] = {{25,85,14},{3,5,78},{56,2,23}};
				
			for (int d[]: g) {
				for (int e: d) {
					System.out.print(e + " ");
				}
				System.out.println();
			}
			
		}
}
