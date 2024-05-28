package Assignment4;

import java.util.Scanner;

public class Q5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the 2ns Number:");
		int number2 = sc.nextInt();
		
		if(number1>number2) {
			System.out.println(number1+" is Biggest Number");
		}else {
			System.out.println(number2+" is Biggest Number");

		}
	}

}
