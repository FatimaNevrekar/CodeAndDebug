// Write a program in java to average of n numbers using an array
package Assignment_1;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		double avg = 0;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		avg=(double) sum/2;
		System.out.println("Average of numbers is "+avg);

	}
}
