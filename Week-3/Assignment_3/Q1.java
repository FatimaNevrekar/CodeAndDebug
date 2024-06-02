//Write a program in java to find index of smallest number in an array

package Assignment_3;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];

		System.out.println("Enter the Elements of Array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int smallestIndex=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]<a[i+1]) {
				smallestIndex=i;
			}

		}
		System.out.println("smallestIndex: "+smallestIndex);


		
	}

}
