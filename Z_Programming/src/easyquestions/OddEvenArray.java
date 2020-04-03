package easyquestions;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		Scanner number = new Scanner(System.in);

		System.out.println("Enter the elements in a array");

		for (int i = 0; i < 5; i++) {
			intArray[i] = number.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (intArray[i] % 2 == 0) {
				System.out.println("Even list: " + intArray[i]);
				// System.out.print(" " + intArray[i]);
			} else {
				System.out.println("Odd list: " + intArray[i]);
			}
		}

	}
}