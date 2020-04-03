package easyquestions;

import java.util.Scanner;

public class Factorial {

	public int factOfN(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {

		int n;
		Scanner quotRem = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = quotRem.nextInt();

		Factorial sum = new Factorial();
		int sumOfNumbers = sum.factOfN(n);
		System.out.println("Factorial of number is :" + sumOfNumbers);

	}

}
