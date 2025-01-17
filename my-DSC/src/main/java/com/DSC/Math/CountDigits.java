/**
 * 
 */
package com.DSC.Math;

import java.util.Scanner;

/**
 * Print number of digits of a number
 */
public class CountDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter number to count digits of a number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int count=countDigits(num);
		System.out.println("Num of digits of a number "+num+" is: "+count);
	}

	static int countDigits(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;		
	}

}
