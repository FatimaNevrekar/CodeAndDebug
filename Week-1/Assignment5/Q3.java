package Assignment5;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int year = sc.nextInt();

		if(year%4==0) {
			System.out.println("Year is Leap year");
		}else {
			System.out.println("Year is not leap year");

		}

		
	}

}
