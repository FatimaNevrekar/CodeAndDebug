//Q4. Write a program in java to print even length words.
package Assignment__1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[] words= input.split(" ");
        for(String word: words) {
        	if(word.length()%2==0) {
                System.out.println("evenLengthWords  : "+word);
        	}
        }
	}

}
