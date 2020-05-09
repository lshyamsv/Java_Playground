package codingbat;

public class Sameends {
	public boolean sameEnds(int[] nums, int len) {
		boolean end = true;
		for (int i = 0; i < len; i++) {
			if (nums[i] == nums[nums.length - len + i]) {
				end = true;
			} else {
				end = false;
			}
		}
		return end;
	}
}
