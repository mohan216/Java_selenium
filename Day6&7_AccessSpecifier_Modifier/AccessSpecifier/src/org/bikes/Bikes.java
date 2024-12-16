package org.bikes;
import org.cars.Cars;

public class Bikes implements Cars{
	
	public void carName() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Bikes a = new Bikes();
		a.carName();
	}

}
