package org.all;

import org.english.English;

public class LanguageClass extends English {
	
	private void alllanguage() {
		System.out.println("All Languages.");
	}
	
	public static void main(String[] args) {
		LanguageClass a = new LanguageClass();
		a.alllanguage();
		a.englishLanguage();
		a.tamilLanguage();
		a.telguLanguage();
	}

}
