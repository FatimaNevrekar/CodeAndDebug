//Q1. Write a program in java to find length of last word in a string.
package Assignment__1;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine(); 
        int i,c=0;
        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                break;
            }
            c++;
        }
        System.out.println("Length of Last Word: "+c);
	}
	


}
