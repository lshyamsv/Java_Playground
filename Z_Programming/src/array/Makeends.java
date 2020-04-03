package array;

public class Makeends {
	
	public int[] makeEnds(int[] nums) {
		  
		  if(nums.length<=0)
		  {
		    return nums;
		  }
		  int [] ends = {nums[0],nums[nums.length-1]};
		  return ends;

		}

}
