package codingbat;

public class Only14 {
	public boolean only14(int[] nums) {
		boolean isTrue = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				isTrue = false;
			}
		}
		return isTrue;
	}

}
