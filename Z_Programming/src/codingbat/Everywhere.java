package codingbat;

public class Everywhere {

	public boolean isEverywhere(int[] nums, int val) {
		// if(nums.length<=1||nums==null)
		// return true;
		// int counter =0;
		// for(int i=0;i<nums.length;i++){
		// if(nums[i]==val){
		// counter++;
		// } else if(counter==0){
		// return false;
		// }
		// }
		// if((nums.length/counter)==0){
		// return true;
		// } return false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val)
				return false;
		}
		return true;
	}

}
