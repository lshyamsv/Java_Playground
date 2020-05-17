package codingbat;

public class evenOdd {
	public int[] evenOdd(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0 || nums[i] == 0) {
				arr[left] = nums[i];
				left++;

			} else if (nums[i] % 2 == 1 || nums[i] == 1) {
				arr[right] = nums[i];
				right--;
			}
		}
		return arr;
	}

}
