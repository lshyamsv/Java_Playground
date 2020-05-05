package codingbat;

public class either24 {

	public boolean either24(int[] nums) {
		// boolean hastwo = false;
		// boolean hasfour = false;
		// for(int i =0;i<nums.length-1;i++){
		// if(nums[i]==2&&nums[i+1]==2||nums[i]==4&&nums[i+1]==4){
		// twoAndFour = true;
		// } else if (nums[i]==2&&nums[i+1]==2&&nums[i]==4&&nums[i+1]==4){
		// twoAndFour = false;
		// }
		// } return twoAndFour;

		boolean has22 = false;
		boolean has44 = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				has22 = true;

			if (nums[i] == 4 && nums[i + 1] == 4)
				has44 = true;
		}

		return has22 != has44;
	}

}
