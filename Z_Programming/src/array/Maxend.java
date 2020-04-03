package array;

public class Maxend {
	public int[] maxEnd3(int[] nums) {
		if(nums[0]>=nums[2])
		{
		  nums[1]=nums[0];
		  nums[2]=nums[0];
		}else if(nums[2]>=nums[0])
		{
		  nums[0]=nums[2];
		  nums[1]=nums[2];
		}return nums;
		}

}


//public int[] maxEnd3(int[] nums) {
//	  int max = Math.max(nums[0], nums[2]);
//	  nums[0] = max;
//	  nums[1] = max;
//	  nums[2] = max;
//	  return nums;
	  
	  // Solution notes: you could write if-logic to figure out
	  // which element is the biggest, but here we use Math.max()
	  // to solve that part nicely.
//	}