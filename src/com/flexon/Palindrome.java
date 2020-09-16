package com.flexon;

import java.util.Scanner;

public class Palindrome {
	private String userInput;
	private boolean isPalindrom;
	public Palindrome() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String userInput = myObj.nextLine();
		this.userInput = userInput;
		this.isPalindrom = true;
	}
	
	public Palindrome(String input) {
		this.userInput = input;
		this.isPalindrom = true;
	}
	
	public void setUserInput(String newInput) {
		this.userInput = newInput;
	}
	
	public boolean ReverseAndCheckPalindrom() {
		char[] inputArray = this.userInput.toCharArray();
		int l = 0;
		int r = inputArray.length - 1;
		while(l < r) {
			if(!String.valueOf(inputArray[l]).toLowerCase().equals(String.valueOf(inputArray[r]).toLowerCase())) {
				this.isPalindrom = false;
			}
			char temp = inputArray[l];
			inputArray[l] = inputArray[r];
			inputArray[r] = temp;
			l++;
			r--;
		}
		System.out.println("Origin: " + this.userInput);
		System.out.println("Reversed: " + String.valueOf(inputArray));
		if(this.isPalindrom == true)
			System.out.println("It is palindrome.");
		else
			System.out.println("It is not palindrome");
		
		return this.isPalindrom;
	}
}
