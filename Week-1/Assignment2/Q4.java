package Assignment2;

public class Q4 {
	public static void main(String args[]) {
		int a=10;
		int b=2;
		System.out.println("value of a before swaping is: "+a+" and b is: "+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a after swaping is: "+a+" and b is: "+b);
	}

}
