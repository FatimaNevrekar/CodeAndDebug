package Assignment5;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person's Age:");
		int age = sc.nextInt();

		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");

		}

		
	}
}
