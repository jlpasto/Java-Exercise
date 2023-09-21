package com.jlpasto;

// this application demos Dependency Injection

public class EmailApplication {
	
	public static void main(String[] args) {
		
		// We add instance of BasicSpellChecker in the constructor
		// this makes the EmailClient less dependent to BasicSpellChecker ,
		// we can use AdvanceSpellChecker as replacement if we want to 
		// without changing the EmailCleint class.
		// EmailClient emailClient = new EmailClient();
		 EmailClient emailClient = new EmailClient(new AdvanceSpellChecker());
		//EmailClient emailClient = new EmailClient(new BasicSpellChecker());
		emailClient.sendEmail("Hey sample email");
		emailClient.sendEmail("Second email");
		
		// To sum up, we are injecting the dependencies to the 
		// EmailClient class in the creation time
	}
}
