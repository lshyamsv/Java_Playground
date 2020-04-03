package easyquestions;

import java.util.Scanner;

public class Evenodd {

	public static void main(String []args)
	{
		int a, oddEven,remainder;
		Scanner odd = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a= odd.nextInt();

		oddEven = a%2;
		if(oddEven==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is odd");

		}
	}
}