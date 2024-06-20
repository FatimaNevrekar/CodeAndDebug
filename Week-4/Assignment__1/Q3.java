//Q3. Write a program in java to reverse words in string.
//Example
//Sample Input: Hi my name is Nilay
//Sample Output: Nilay is name my Hi

package Assignment__1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[] words= input.split(" ");
        String rev="";
        for(int i=words.length-1;i>=0;i--) {
        	rev=rev+words[i];
        	if(i!=0) {
        		rev=rev+" ";
        	}
        }
        System.out.println("Reversed String : "+rev);
	}

}
