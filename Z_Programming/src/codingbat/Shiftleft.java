package codingbat;

import java.util.Arrays;

public class Shiftleft {
	public static int[] shiftLeft(int[] nums) {

		if (nums.length == 1)
			return nums;

		int[] arr = new int[nums.length];

		for (int i = 0; i < nums.length - 1; i++) {

			int temp = nums[0];
			arr[i] = nums[i + 1];
			arr[nums.length - 1] = temp;

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(shiftLeft(arr)));

	}

}
