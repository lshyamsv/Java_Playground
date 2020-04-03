package easyquestions;

import java.util.Scanner;

public class SquareRootPrime {

	public static void main(String[] args) {
		System.out.println("Enter the number for finding Square root: ");
		Scanner number = new Scanner(System.in);
		int sqrt = number.nextInt();

		double sqrtNumber = Math.sqrt(sqrt);
		int p = 1;

		for (int i = 2; i < sqrtNumber; i++) {

			if (sqrtNumber % i == 0) {
				p = 0;
				break;
			}
		}
		if (p == 1) {
			System.out.println("\nThe Numbers is Prime :" + sqrtNumber);
		} else {
			System.out.println("\nThe Numbers is Not Prime :" + sqrtNumber);
		}

		// for (int i = 2; i <= sqrtNumber; i++) {
		// if (sqrtNumber % i == 0 && sqrtNumber % 1 == 0) {
		// System.out.println(sqrtNumber + " Is prime");
		// }
		//
		// System.out.println(sqrtNumber + " Is not prime");
		// }
	}
}
