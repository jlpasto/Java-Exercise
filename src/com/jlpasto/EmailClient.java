package com.jlpasto;

public class EmailClient {
	
	
	// EmailClient class is tightly coupled / highly dependent
	// to BasicSpellChecker class.
	// Having tightly coupled class makes it hard to maintain, 
	// extend and unit test the code
	
	
	// If I wish to change BasicSpellChecker to AdvanceSpellChecker 
	// then we have to change our EmailClient class
	
	/* BEFORE CODE
	
	private BasicSpellChecker basicSpellChecker;
	
	EmailClient() {
		this.basicSpellChecker = new BasicSpellChecker();
	}
	
	void sendEmail(String emailMessage) {
		basicSpellChecker.checkSpelling(emailMessage);
		// logic to send email
	}
	*/
	
	
	// MODIFIED CODE that uses Interface polymorphism
	
	private SpellChecker spellChecker;
	
	EmailClient(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	void sendEmail(String emailMessage) {
		spellChecker.checkSpelling(emailMessage);
		// logic to send email
	}

}
