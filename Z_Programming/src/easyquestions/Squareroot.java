package easyquestions;

import java.util.Scanner;

public class Squareroot {
	
	public static void main (String [] args)
	{
		double a, root;
		Scanner square = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		a =  square.nextFloat();
		root = Math.sqrt(a);
		System.out.println("The Square root of number is : "+  root);
	}

}

