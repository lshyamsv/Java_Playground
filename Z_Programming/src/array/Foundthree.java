package array;

public class Foundthree {

	public boolean haveThree(int[] nums) {
		int count = 0;
		boolean found = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 3)
				found = false;
			if (nums[i] == 3 && found == true)
				return false;
			if (nums[i] == 3 && found == false) {
				found = true;
				count++;
			}
		}
		if (count == 3)
			return true;
		else
			return false;
	}

}
