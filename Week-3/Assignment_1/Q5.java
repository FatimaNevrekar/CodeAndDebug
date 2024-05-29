//Write a program in java to print sum of all odd indexes in an array.

package Assignment_1;

import java.util.Scanner;

public class Q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			if(i%2==1) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of all Odd Indexes "+sum);

	}
}
