package leetcode;

import java.util.Arrays;

public class Consecutiveones {
	public static int findMaxConsecutiveOnes(int[] nums) {

		// https://github.com/cherryljr/LeetCode/blob/master/Max%20Consecutive%20Ones.java
		int ans = 0;
		int count = 0;
		for (int num : nums) {
			if (num == 1) {
				ans = Math.max(ans, ++count);
			} else {
				count = 0;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
		int count = Consecutiveones.findMaxConsecutiveOnes(nums);
		System.out.println(count);

	}

}
