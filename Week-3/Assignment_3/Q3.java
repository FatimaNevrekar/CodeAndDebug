// Write a program in Java to merge two arrays.
//Input: arr1[] = {5, 8, 9}, arr2[] = {4, 7, 8, 10, 12}
//Output: arr3[] = {5, 8, 9, 4, 7, 8, 10, 12}
 package Assignment_3;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		
		int a[]= {5,8,9};
		int b[]= {4, 7, 8, 10, 12};

		int n=a.length;
		int m=b.length;
		int k=m+n;

		int c[]= new int[n+m];
	
		for(int i=0;i<n;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<m;i++) {
			c[n+i]=b[i];
		}
		System.out.println("The Mergerd Array is: ");
		for(int i=0;i<k;i++) {
			System.out.println(c[i]);
		}
		
	}
}
