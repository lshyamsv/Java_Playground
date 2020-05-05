package codingbat;

public class No14 {
	public boolean no14(int[] nums) {
		boolean hasOne = false;
		boolean hasFour = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				hasOne = true;
			} else if (nums[i] == 4) {
				hasFour = true;
			}
		}
		if (hasOne == true && hasFour == true) {
			return false;
		}
		return true;
	}

}
