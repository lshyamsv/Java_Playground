package array;

import java.util.Arrays;

public class Array {
	
	public int maxTriple(int[] nums) {
		  			  
			  int half = nums.length/2;
			  
			  int max = 0;
			  
			  if(nums[0]>nums[half]&&nums[0]>nums[nums.length-1])
			  {
			    max = nums[0];
			  } else if(nums[nums.length-1]>nums[0]&&nums[nums.length-1]>nums[half])
			  {
			    max = nums[nums.length-1];
			  } else
			  {
			    max = nums[half];
			  } return max;

			  	//	  return Arrays.stream(nums).max().getAsInt();
			}
		  
		}
