package array;

public class Sum3 {
	
	public int sum3(int[] nums) {
		  if(nums.length<=0)
		  {
		    return -1;
		  }
		   int add = nums[0]+nums[1]+nums[2];
		   return add;
		} 

}

//  Solution
//public int sum3(int[] nums)
//{	return (nums[0] + nums[1] + nums[2]);	}