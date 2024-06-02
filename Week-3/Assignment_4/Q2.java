// Write a program in java to count the total number of vowels and consonants in a string

package Assignment_4;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= sc.nextLine().toLowerCase();

		int vowels=0;
		int consonants=0;
		
		for(int i: str.toCharArray()) {
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
				vowels++;
			}else {
				consonants++;
			}
		}

		System.out.println("Total number of vowels->"+ vowels);
		System.out.println("Total number of consonants->"+ consonants);

	}
}
