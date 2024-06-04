//Write a program in java to swap two string variables without using third or temp variable
package Assignment_5;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st String:");
		String str1= sc.nextLine();
		System.out.println("Enter the 2nd String:");

		String str2= sc.nextLine();
		System.out.println("String Before Swapping: "+str1+" "+str2);

		str1=str1+str2;// HelloWorld
		//str2= World
		
		str2=str1.substring(0,str1.length()-str2.length());
		
		str1=str1.substring(str2.length());

		System.out.println("String After Swapping: "+str1+" "+str2);

		
	}
	

}
