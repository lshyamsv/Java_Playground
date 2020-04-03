package interviewkickstart;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GroupNNumbers {

	/*
	 * Complete the function below.
	 */
	static int[] solve(int[] arr) {

		// intiating the pointer left to index 0
		int left = 0;
		// intiating the pointer right to index -1
		int right = arr.length - 1;

		while (right >= left) {
			System.out.println("\nRight value is " + arr[right]);
			if (arr[right] % 2 == 0) {
				// System.out.println("Right value is "+ arr[right]);
				// System.out.println("Array index value  "+ right);
				int tmp = arr[right];
				// System.out.println("Temporary value is : "+ tmp);
				arr[right] = arr[left];
				// System.out.println("New right value is : " + arr[right]);
				arr[left] = tmp;
				System.out.println("Left value is  :" + arr[left]);
				left++;
				// System.out.println(left);
			} else {
				right--;
				// System.out.println(right);
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] array = { 5, 1, 8, 1 };
		GroupNNumbers.solve(array);
		System.out.println(Arrays.toString(array));

	}
}
