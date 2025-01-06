/**
 * 
 */
package com.DSC.Math;
import java.util.Scanner;

/**
 * Print reverse of any number
 */
public class ReverseNum {

	/**
	 * @author bvenkatesh
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number to reverse");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		reverse(num);
	}

	private static void reverse(int num) {
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		System.out.println("reverse number:"+rev);
		
	}
}
