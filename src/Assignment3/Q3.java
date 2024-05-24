package Assignment3;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the temperature in Farheniet: ");
		double f=sc.nextDouble();
		double c;
		c=(f-32)*(5/9);
		System.out.println("Temperature in Celcius is : "+ Math.round(c*100/100));
	}
}
