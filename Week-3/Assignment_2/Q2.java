//Write a program in java to enter two arrays of size n, multiply both
//array and store result in the third array.

package Assignment_2;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i]=a[i]*b[i];
			System.out.println(c[i]);

		}

}
		}
