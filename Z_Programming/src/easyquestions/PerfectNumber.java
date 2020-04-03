package easyquestions;

import java.util.Scanner;

class PerfectNumber {
	public static void main(String args[]) {

		int n, i, s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		n = sc.nextInt();

		for (i = 1; i < n; i++) {
			// System.out.println("Value of i is:" + i);
			if (n % i == 0)
				s = s + i;
			// System.out.println("Value of s is: "+s);
		}
		if (s == n) {
			System.out.println("\nIt is a Perfect Number :" + n);
		} else {
			System.out.println("\nIt is Not a Perfect Number :" + n);
		}

	}
}