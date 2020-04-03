package easyquestions;

import java.util.Scanner;

public class SumOddEvenArray {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		Scanner number = new Scanner(System.in);

		System.out.println("Enter the elements in a array");

		for (int i = 0; i < 5; i++) {
			intArray[i] = number.nextInt();
		}

		int se = 0;
		int sod = 0;
		for (int i = 0; i < 5; i++) {
			if (intArray[i] % 2 == 0) {
				se = se + intArray[i];
			} else {
				sod = sod + intArray[i];
			}
		}

		System.out.print("\nSum of Even is :" + se);
		System.out.print("\nSum of Odd is :" + sod);

	}

}
