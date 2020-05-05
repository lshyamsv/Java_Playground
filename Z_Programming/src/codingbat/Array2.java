package codingbat;

public class Array2 {

	public int matchUp(int[] nums1, int[] nums2) {
		int diff = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums2[i] > nums1[i] && nums2[i] - nums1[i] <= 2) {
				diff++;
			} else if (nums1[i] > nums2[i] && nums1[i] - nums2[i] <= 2) {
				diff++;
			}
		}
		return diff;

	}

}
