package Assignment3;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println( "Enter the Quantity of Centimeter: ");
//		int c=sc.nextInt();
//		int m,c2=0;
//
//		 m=c/100;
//
//		c2=m*100;
//		System.out.println(m +" Meter = "+c2+" Centemiter");
		
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter Centimeter: ");
        int cm=sc.nextInt();
        int meter1,cm1;  
        meter1=cm/100;
        cm1=cm%100;
        System.out.println("Meter: "+meter1+"\nCentimeter: "+cm1);  
	}

}
