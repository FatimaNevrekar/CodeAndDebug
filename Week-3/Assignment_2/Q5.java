//Write a program in java to find smallest of n numbers.
package Assignment_2;

import java.util.Scanner;

public class Q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];

		int smallestNumber=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			
			if(a[i]<a[i+1]) {
				smallestNumber=i;
			}
		}
			System.out.println(smallestNumber);
		
		
	}

}
