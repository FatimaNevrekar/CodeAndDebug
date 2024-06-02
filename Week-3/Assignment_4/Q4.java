//Write a program in java to count 
//total number of Characters, spaces,digits, lowercase, uppercase alphabets and special characters.

package Assignment_4;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= sc.nextLine();

		int sp=0;int digit=0;int l=0;int u=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
		   char ch=str.charAt(i);
		   if(Character.isDigit(ch)) {
			   digit++;
		   }else if(Character.isSpace(ch)) {
			   sp++;
		   }
		   else if(Character.isLowerCase(ch)) {
			   l++;
		   }
		   else if(Character.isUpperCase(ch)) {
			   u++;
		   }
		}
		
		System.out.println("No of Spaces: "+sp+" Digits :"+digit+" Lowercase: "+l+" Upercase: "+u);

	}

}
