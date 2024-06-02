// Write a program in java that exchanges the values of first half side
//elements with second half side elements of the array.
//Input: arr[] = { 6, 8, 7, 10, 9, 12}
//Output: arr[] = {10, 9, 12, 6, 8, 7}
		package Assignment_3;


import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];

		System.out.println("Enter the Elements of 1st Array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int mid = n%2==1?n/2+1:n/2;
//		System.out.println("Mid: "+mid);
//
//		for(int i=0;i<mid;i++) {
//			b[i]=a[mid+i];
//		}
//		
//		for(int i=0;i<mid;i++) {
//			b[mid+i]=a[i];
//		}

		for(int i=0;i<n/2;i++) {
			int temp=a[i];
			a[i]=a[mid];
			a[mid]=temp;
			mid++;
		}
//		
		System.out.println("The Elements of Output Array:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
}
