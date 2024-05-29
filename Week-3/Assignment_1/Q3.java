//Write a program in java to find sum of odd and even elements in an
//array.
package Assignment_1;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sumOfOdd = 0,sumOfEven=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==1) {
				sumOfOdd+=+a[i];
			}else {
				sumOfEven+=a[i];
			}
		}
		System.out.println("Sum of Even numbers is "+sumOfEven);
		System.out.println("Sum of odd numbers is "+sumOfOdd);

	}
}
