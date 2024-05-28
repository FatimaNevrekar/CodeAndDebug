package Assignment4;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours and min for 1st time:");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		
		System.out.println("Enter the hours and min for 2nd time:");
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		
		int sumofHours=(h1+h2)*60;
		int sumOfMins=m1+m2;
		
		int totalTime=sumofHours+sumOfMins;
		
		int hour=totalTime/60;
		int mins = totalTime%60;
		System.out.println("Hours : "+hour+" Minutes : "+mins);
	}

}
