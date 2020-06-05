package leetcode;

public class Binarysearch {
	public static int binarySearch(int[] nums, int target) {

		// https://leetcode.com/problems/binary-search/discuss/157435/Java-Solution
		int lo = 0;
		int hi = nums.length - 1;
		System.out.println(nums.length);

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] < target) {
				lo = mid + 1;
			} else if (nums[mid] > target) {
				hi = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 5, 6, 7 };
		System.out.println(Binarysearch.binarySearch(arr, 2));
	}

}
