//Write a program in java to convert lowercase characters to uppercase
//characters and vice versa in a string
package Assignment__1;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
    System.out.print("Enter String: ");
    String s=sc.nextLine(); 
    
    String ns="";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isLetter(ch)) {
			if (Character.isUpperCase(ch)) {
				ns = ns + Character.toLowerCase(ch);

			} else {
				ns = ns + Character.toUpperCase(ch);
			}
		} else {
			ns = ns + ch;
		}
	}
    System.out.println("New String: "+ns);
    
	}

}
