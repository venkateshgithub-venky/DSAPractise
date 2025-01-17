/**
 * 
 */
package com.DSC.Math;

import java.util.Scanner;

/**
 * Check given number is palindrome or not
 */
public class PalindromeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter number to check palindrome or not: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		checkPalindrome(num);
	}

	static void checkPalindrome(int num) {
		int temp=num, rev=0;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		if (rev==num) {
			System.out.println("GIven Number is Palindrome");
		} else {
			System.out.println("Given number is not palindrome");
		}
	}

}
