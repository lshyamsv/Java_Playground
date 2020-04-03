package easyquestions;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		System.out.println("Enter the Range of prime:");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int sum = 0;

		if (n == 1 || n == 0) {
			System.out.println("Enter a different number");
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
					sum = sum + i;
					System.out.println("Sum of prime number is: " + sum);
				} else if (i % j == 0) {
					break;
				}

			}

		}
		System.out.println("Sum of all the prime number is: " + sum); 

	}

}
