package array;

public class Double23 {
	
	public boolean double23(int[] nums) 
	{
		  if(nums.length<=1)
		  {
		    return false;
		  }
		  if((nums[0]==2&&nums[1]==2))
		  {
		    return true;
		  }else return nums[0] == 3 && nums[1] == 3;

    }


}
