package easyquestions;

import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner number = new Scanner(System.in);
		int sumOfDigits = number.nextInt();

		int n = 0, r = 0;
		while (sumOfDigits > 0) {
			r=sumOfDigits%10;
			sumOfDigits = sumOfDigits/10;
			n=n+r;
			
		}
		System.out.println("Sum of digits is:" + n);

	}

}