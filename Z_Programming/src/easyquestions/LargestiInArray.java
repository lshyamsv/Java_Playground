package easyquestions;

import java.util.Scanner;

public class LargestiInArray {

	public static void main(String[] args) {

		int n;
		int largest = 0;
		int s;
		System.out.println("Enter size of array");
		Scanner size = new Scanner(System.in);
		n = size.nextInt();

		int[] intArray = new int[n];

		System.out.println("Enter the elements of the array");

		for (int i = 0; i < n; i++) {
			Scanner numbers = new Scanner(System.in);
			intArray[i] = numbers.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (largest <= intArray[i]) {
				largest = intArray[i];
			}
		}
		System.out.println("The largest number in the array is:" + largest);

	}

}
