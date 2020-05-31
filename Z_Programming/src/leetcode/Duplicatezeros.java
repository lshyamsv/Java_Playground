package leetcode;

import java.util.Arrays;

public class Duplicatezeros {

	public static void duplicateZeros(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i == 0) {
				count++;

			}
		}
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.println("arr[i] value is " + arr[i]);
			int temp = i + count;
			if (temp < len) {
				arr[temp] = arr[i];
//				System.out.println("arr[i] value is " + arr[i]);
				System.out.println("arr[temp] value is " + arr[temp]);
			}
			if (arr[i] == 0) {
				count--;
				temp = i + count;
				if (temp < len) {
					arr[temp] = arr[i];
//					System.out.println("arr[i] value is " + arr[i]);
					System.out.println("arr[temp] value is " + arr[temp]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
		Duplicatezeros.duplicateZeros(arr);

	}
}
