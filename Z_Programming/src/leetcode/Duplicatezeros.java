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
			}
			if (arr[i] == 0) {
				count--;
				temp = i + count;
				if (temp < len) {
					arr[temp] = arr[i];
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
		Duplicatezeros.duplicateZeros(arr);

	}
//Another Solution
	public void duplicateZerosAnother(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 1; j > i; j--) {
					arr[j] = arr[j - 1];
				}
				i++;
			}
		}
	}
}
