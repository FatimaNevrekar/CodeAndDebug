//Write a program in java to store 5 numbers in an array. Create another
//array to contain squared values of all the elements of the first array.

package Assignment_2;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array:");
//		int n = sc.nextInt();
		
		int a[]=new int[5];
		int b[]=new int[5];

		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			b[i]=a[i]*a[i];
		}
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		
	}

}
