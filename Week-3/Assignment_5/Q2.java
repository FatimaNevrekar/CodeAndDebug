// Write a program in java to replace lower-case characters with upper-case and vice-versa

package Assignment_5;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= sc.nextLine();
		
		String ns="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					ns=ns+Character.toUpperCase(ch);
				}else if(Character.isUpperCase(ch)) {
					ns=ns+Character.toLowerCase(ch);
				}
			}else {
				ns=ns+ch;
			}
			
			
		}
		System.out.println("String without Spaces: "+ns);
	}
}
