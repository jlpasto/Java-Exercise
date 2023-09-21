package com.jlpasto;

public class AdvanceSpellChecker implements SpellChecker{
	
	public void checkSpelling(String emailMessage) {
		if(emailMessage != null) {
			// Determine the language of email
			// Check grammar 
			// Check spelling
			System.out.print("Spell checking completed...");
		} else {
			throw new RuntimeException("An error occured");
		}
	}
}
