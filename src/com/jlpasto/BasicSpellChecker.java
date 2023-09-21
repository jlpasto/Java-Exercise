package com.jlpasto;

// the first step to making it loosely coupled
// we implement SpellChecker interface 

// We can then pass a SpellChecker object to
// the contructor parameter in EmailClient class

public class BasicSpellChecker implements SpellChecker {
	
	public void checkSpelling(String emailMessage) {
		if(emailMessage != null) {
			System.out.println("Checking spelling...");
			System.out.println("Spell checking completed...");
		} else {
			throw new RuntimeException("An exception occured");
		}
	}

}
