package codingbat;

import java.util.Arrays;

public class Zeromax {

	// public static int[] zeroMax(int[] nums) {
	//
	// for (int i = 0; i < nums.length - 1; i++) {
	// if (nums[i] == 0 && nums[i + 1] % 2 == 1 && i < nums.length - 1) {
	// nums[i] = nums[i + 1];
	// }
	//
	// }
	// return nums;
	// }

	public static 	int[] zeroMax(int[] nums) {
		int max = 0;
		for (int j = 0; j < nums.length - 1; j++) {
			if (nums[j] == 0) {
				for (int i = j + 1; i <= nums.length - 1; i++) {
					if (nums[i] > max && nums[i] % 2 == 1)
						max = nums[i];
				}
				nums[j] = max;
				max = 0;
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(Zeromax.zeroMax(new int[] { 0, 5, 0,
				3 })));

	}

}
