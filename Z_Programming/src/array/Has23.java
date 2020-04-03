package array;

public class Has23 {
	
	public boolean has23(int[] nums) {

		if (nums[0]==2||nums[1]==2)
		{
		return true;  
		} else if(nums[0]==3||nums[1]==3)
		{
		  return true;
		} else
		{
		  return false;
		}
		}


}
