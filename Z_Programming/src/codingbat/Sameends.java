package codingbat;

public class Sameends {
	public boolean sameEnds(int[] nums, int len) {
		boolean end = true;
		for (int i = 0; i < len; i++) {
            end = nums[i] == nums[nums.length - len + i];
		}
		return end;
	}
}
