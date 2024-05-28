package Assignment3;

import java.util.Scanner;

public class Q5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the number of minutes");
		int m=sc.nextInt();
		int h,m2;
		h=m/60;
		m2=h%60;
		System.out.println(h +" hours = "+ m2+" Minutes");
	}

}
