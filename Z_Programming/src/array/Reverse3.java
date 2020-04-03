package array;

public class Reverse3 {
	public int[] reverse3(int[] nums) {
	    
		  if(nums.length<=0)
		  {
		    return nums;
		  }
		 int[] rotated = {nums[2], nums[1], nums[0]};
			return rotated;
		  
		}
		}


// https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Array-1.java
