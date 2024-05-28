package Assignment5;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num1<num2) {
			System.out.println(num1+" is Smallest Number");
		}else {
			System.out.println(num2+" is Smallest Number");

		}

		
	}
}
