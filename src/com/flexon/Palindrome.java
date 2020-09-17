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
	public String Reverse(String str) {
		char[] inputArray = str.toCharArray();
		int l = 0;
		int r = inputArray.length - 1;
		while(l < r) {
			char temp = inputArray[l];
			inputArray[l] = inputArray[r];
			inputArray[r] = temp;
			l++;
			r--;
		}
		return String.valueOf(inputArray);
	}
	
	public boolean isPalindrome(String str) {
		char[] inputArray = str.toCharArray();
		int l = 0;
		int r = inputArray.length - 1;
		while(l < r) {
			while(inputArray[l] < 'a' || inputArray[l] > 'z') {
				l++;
			}
			while(inputArray[r] < 'a' || inputArray[r] > 'z') {
				r--;
			}
			if(l < r) {
				if(inputArray[l] != inputArray[r]) {
					this.isPalindrom = false;
					return this.isPalindrom;
				}
			}
			l++;
			r--;
		}
		return this.isPalindrom;
	}
	
	public void ReverseAndCheckPalindrom() {
		String target = this.userInput.trim().toLowerCase();
		char last = ' ';
		int len = target.length()-1;
		if(target.charAt(len) < 'A' || target.charAt(len) > 'Z' && target.charAt(len) < 'a' || target.charAt(len) > 'z') {
			last = target.charAt(len);
			target = target.substring(0,len);
		}
		String reversed = Reverse(target);
		
		if(this.userInput.charAt(0) >= 'A' && this.userInput.charAt(0) <= 'Z')
			reversed = reversed.substring(0,1).toUpperCase() + reversed.substring(1);
		reversed += last;
		System.out.println("Origin: " + this.userInput);
		System.out.println("Reversed: " + reversed);
		if(isPalindrome(target))
			System.out.println("It is palindrome.");
		else
			System.out.println("It is not palindrome.");
	}
}
