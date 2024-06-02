//Write a program in java to input a string and check whether it is palindrome or not
package Assignment_4;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= sc.nextLine();

		String ns="";
		int l=str.length();
		for(int i=0;i<l;i++) {
		    char ch=str.charAt(l-1-i);
		    ns=ns+ch;
		}
		if(ns.equalsIgnoreCase(str)) {
			System.out.println("String is PAlindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

		

	}
}
