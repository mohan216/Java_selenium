package org.india;
import org.tamilnadu.TamilNadu;

public class India extends TamilNadu{

	private void india() {
		System.out.println("Indian Languages.");
	}
	
	public static void main(String[] args) {
		India a = new India();
		a.india();
		a.tamilLanguage();
		a.malayalam();
		a.telgu();
	}
	
}
