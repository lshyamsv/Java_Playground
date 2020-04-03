package easyquestions;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner number = new Scanner(System.in);
		int sumOfDigits = number.nextInt();

		int r, r1 = 0, sum;
		r = sumOfDigits % 10;
		sumOfDigits = sumOfDigits / 10;

		while (sumOfDigits > 0) {
			r1 = (r1 * 10) + (sumOfDigits % 10);
			sumOfDigits = sumOfDigits / 10;

		}
		// System.out.println(r1);
		r1 = r1 % 10;
		sum = r + r1;
		System.out.println("Sum of first and last digits is " + sum);

	}
}
