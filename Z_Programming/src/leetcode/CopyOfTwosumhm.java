package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CopyOfTwosumhm {

	public static int[] twoSumHm(int[] nums, int target) {
		if (nums == null || nums.length < 2)
			return new int [0];
	
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			
			if (hm.containsKey(target - nums[i])) {
				System.out.println("Inside For: " + nums[i]);
				System.out.println(hm.get(target - nums[i]));
//				return new int[] hm.get(target - nums[i]);
//				return nums[i];
			}
			hm.put(nums[i], i);
			System.out.println("Outside For index: " + hm.get(nums[i]));
			System.out.println("Outside For value: " + nums[i]);
		}
		return new int [0];

	}

	public static void main(String[] args) {
		int[] result = twoSumHm(new int[] {1, 2, 3, 6, 8 }, 10);
		System.out.println(Arrays.toString(result));
	}

}
	