//Write a program in java to check whether all the numbers in an array
//are equal or not.
package Assignment_3;

import java.util.Scanner;

public class Q5 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int n = sc.nextInt();
			
			int a[]=new int[n];

			System.out.println("Enter the Elements of 1st Array:");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int i;
			for(i=0;i<n;i++) {
				if(a[i]!=a[0]) {
					break;
				}
			}
			System.out.println("Value of i Outside Loop->"+i);

			if(i==n) {
				System.out.println("All the numbers in an array are equal");
			}else {
				System.out.println("All the numbers in an array are not equal");

			}
		}
}
