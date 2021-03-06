package leetcode;

public class MximumProductSubarray {

	public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		// int max = nums[0], min = nums[0], result = nums[0];
		// for (int i = 1; i < nums.length; i++) {
		// if (nums[i] > 0) {
		// max = Math.max(nums[i], max*nums[i]); // nums[1] = 3, max(3,2*3),
		// max(3,6) = 6//num[3]=4 max(4,-2*4)=4
		// min = Math.min(nums[i], min*nums[i]);// nums[1] = 3, min(3,2*3),
		// min(3,6) = 3//min(4,0*4) =0
		// } else {
		// int temp =0;
		// max = Math.max(nums[i], max*nums[i]); // nums[2] = -2, max(-2,6*-2),
		// max(-2,-12) = -2
		// min = Math.min(nums[i], temp*nums[i]);//nums [2] =-2, min(0*-2 =0
		// }
		// result = Math.max(result, max);
		// }
		// //4
		// return result;

		if (nums == null || nums.length == 0)
			return 0;

		int ans = nums[0], min = ans, max = ans;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] >= 0) {
				max = Math.max(nums[i], max * nums[i]);
				min = Math.min(nums[i], min * nums[i]);
			} else {
				int tmp = max;
				max = Math.max(nums[i], min * nums[i]);
				min = Math.min(nums[i], tmp * nums[i]);
			}

			ans = Math.max(ans, max);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, -2, 4 };
		System.out.println(maxProduct(arr));

	}

}
