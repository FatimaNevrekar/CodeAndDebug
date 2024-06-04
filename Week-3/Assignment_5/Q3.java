//Write a program in java to replace the spaces of a string with a specific
//character.
package Assignment_5;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= sc.nextLine();
		System.out.println("Enter the Character to replace with space:");
		char c=sc.nextLine().charAt(0);
		
		String ns="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch)) {
				ns=ns+ch;

			}else {
				ns=ns+c;
			}
			
			
		}
		System.out.println("String without Spaces: "+ns);
	}
	
	

}
