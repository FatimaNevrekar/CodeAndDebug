// Write a program in java to find second smallest number in an array
package Assignment_3;

import java.util.Scanner;

public class Q2 {
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
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		}
		int secondSmallest=a[1];

		System.out.println("second Smallest: "+secondSmallest);
	}
}
