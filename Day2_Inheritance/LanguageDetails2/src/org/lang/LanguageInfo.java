package org.lang;

public class LanguageInfo extends StateDetails {
	
	private void tamilLanguage() {
		System.out.println("This is Tamil.");
	}
	
	private void englishLanguage() {
		System.out.println("We speak English.");
	}
	
	private void hindiLanguage() {
		System.out.println("Here they speak Hindi.");
	}
	
	public static void main(String[] args) {
		LanguageInfo a = new LanguageInfo();
		a.tamilLanguage();
		a.englishLanguage();
		a.hindiLanguage();
		a.southIndia();
		a.northIndia();
		
	}

}
