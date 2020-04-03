package easyquestions;

import java.util.Scanner;

class Primecopypaste {
	public static void main(String args[]) {

		int n, i, j, p = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Upto Prime Numbers :");
		n = sc.nextInt();

		for (j = 2; j <= n; j++) {
			System.out.println("value of J is: " + j);
			p = 1;
			System.out.println("Value of P is: " + p);
			for (i = 2; i < j; i++)

			{
				System.out.println("value of J is: " + j);
				System.out.println("value of I is: " + i);

				if (j % i == 0) {
					p = 0;
					break;
				}
			}
			if (p == 1) {
				System.out.println("The Number is Prime :" + j);
			}
		}

	}
}