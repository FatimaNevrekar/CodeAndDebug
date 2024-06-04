//Write a program in java to remove all the white spaces from a string.
package Assignment_5;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		String ns="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				ns=ns+ch;
			}
		}
		System.out.println("String without Spaces: "+ns);
	}

}
