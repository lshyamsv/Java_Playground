package easyquestions;

import java.util.Scanner;

public class Reminderquo {

	public static void main (String [] args)

	{
		float a,b;
		Scanner quotRem = new Scanner (System.in);
		System.out.println("Enter the number: ");
		a=quotRem.nextFloat();
		b=quotRem.nextFloat();
		
		float quot =a/b;
		float remainder = a%b;
		
		System.out.println("The quotient is: " + quot);
		System.out.println("The remainder is: " + remainder);

	}
}
