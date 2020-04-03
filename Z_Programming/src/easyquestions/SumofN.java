package easyquestions;

import java.util.Scanner;

public class SumofN {

	public int sumOf(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {

		int n;
		Scanner quotRem = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = quotRem.nextInt();

		SumofN sum = new SumofN();
		int sumOfNumbers = sum.sumOf(n);
		System.out.println("Sum of Natural numbers is :" + sumOfNumbers);

	}

}
