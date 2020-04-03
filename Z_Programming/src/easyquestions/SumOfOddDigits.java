package easyquestions;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner number = new Scanner(System.in);
		int sumOfDigits = number.nextInt();

		int n = 0, r = 0;
		while (sumOfDigits > 0) 
		{
			r=sumOfDigits%10;
			if(r%2==1)
			{
			n=n+r;
			}
			sumOfDigits = sumOfDigits/10;
		}
		System.out.println("Sum of digits is:" + n);

	}

}