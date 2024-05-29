//Write a program in java to enter an array of size n. Display these
//elements in reverse order

package Assignment_1;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
