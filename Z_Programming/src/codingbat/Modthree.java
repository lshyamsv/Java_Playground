package codingbat;

public class Modthree {

	public boolean modThree(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == nums[i + 1] % 2
					&& nums[i] % 2 == nums[i + 2] % 2)
				return true;
		}
		return false;

		// int oddcounter =0;
		// int evencounter =0;
		// for(int i =0;i<nums.length-1;i++){
		// if(nums[i]%2==0&&nums[i+1]%2==0&&i<nums.length -1){
		// evencounter++;
		// }else if(nums[i]%2==1&&nums[i+1]%2==1){
		// oddcounter++;
		// }
		// } if (evencounter>=3||oddcounter>=3){
		// return true;
		// }
		// return false;
	}

}
