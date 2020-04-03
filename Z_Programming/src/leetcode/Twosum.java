package leetcode;

class Twosum {
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2)

			return new int[0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };

				}
			}

		}

		return new int[0];
	}

	public static void main(String[] args) {
		Twosum ts = new Twosum();
		int[] arr = { 2, 7, 8, 9 };
		ts.twoSum(arr, 9);

	}
}