//Write a program in java that performs following operations on a 1D
//array.
//Replace every even element with its square in a new array
//Replace every odd element with its cube in a new array
package Assignment_2;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			
			if(a[i]%2==0) {
				b[i]=a[i]*a[i];
			}else {
				b[i]=a[i]*a[i]*a[i];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
	}
}
