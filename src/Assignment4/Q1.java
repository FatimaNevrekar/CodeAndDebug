package Assignment4;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int totalDays = sc.nextInt();
		
		int years=totalDays/365;
		int rem_days= totalDays%365;
		
		int months=rem_days/30;
		int days = rem_days%30;
		System.out.println("Year : "+years+" Month : "+months+" Days : "+days);
		
	}

}
