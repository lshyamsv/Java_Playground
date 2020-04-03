package easyquestions;

import java.util.Scanner;

public class Swaptwo {

	public static void main(String args[]) {
		int a, b;
		Scanner quotRem = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a = quotRem.nextInt();
		b = quotRem.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("New value of A is: " + a);
		System.out.println("New value of B is: " + b);
	}
}