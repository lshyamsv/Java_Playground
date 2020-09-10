package codingbat;

public class More14 {
	public boolean more14(int[] nums) {
		int counterOne = 0;
		int counterFour = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				counterOne++;
			} else if (nums[i] == 4) {
				counterFour++;
			}
		}
        return counterOne > counterFour;

    }

}
