package com.flexon;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////////Test Vowels////////////
		////test Input////
		System.out.println("///////Start test Vowels////////");
		Vowels testVowels = new Vowels("Can you hear me?");
		testVowels.countVowels();
		////User Input////
		Vowels testVowels1 = new Vowels();
		testVowels1.countVowels();
		
		//////////Test Palindrome////////////
		////test Input////
		System.out.println("");
		System.out.println("///////Start test Palindrome///////");
		Palindrome testPalindrome = new Palindrome("Alllmllla");
		testPalindrome.ReverseAndCheckPalindrom();
		////User Input////
		Palindrome testPalindrome1 = new Palindrome();
		testPalindrome1.ReverseAndCheckPalindrom();
		
		//////////Test Words////////////
		////test Input////
		System.out.println("");
		System.out.println("///////Start test Vowels////////");
		Words testWords = new Words("I'm fine thank you!");
		testWords.countWords();
		////User Input////
		Words testWords1 = new Words();
		testWords1.countWords();
	}

}
