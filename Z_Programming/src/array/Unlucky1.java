package array;

public class Unlucky1 {
	
	public boolean unlucky1(int[] nums) {
		  
		  if(nums.length<=1)
		  return false;

		for(int i=0;i<=nums.length;i++)
		{
            return (nums[i] == 1 && nums[i + 1] == 3) || (nums[i + 1] == 1 && nums[i + 2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
		  
		} return true;
		  
		}

}