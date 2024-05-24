package Assignment3;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the radius of sphere: ");
		float r=sc.nextFloat();
		double volume=(4/3)*Math.PI*r*r*r;
		
		System.out.println("Volume of Sphere is : "+Math.round(volume*100)/100);
		
	}

}
