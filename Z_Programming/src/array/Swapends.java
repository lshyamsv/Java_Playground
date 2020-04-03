package array;

public class Swapends {
	
	public int[] swapEnds(int[] nums) {
		  
		  if (nums.length<=1)
		  return nums;
		  
		  int size =  nums.length;
		  int [] arr = new int[size];
		  
		  for(int i=1; i<size;i++)
		  {
		  arr[0] =  nums[nums.length-1];
		  arr[i]=nums[i];
		  arr[arr.length-1] = nums[0];
		  }
		  return arr;
		  
		}

}



// Given an array of ints, swap the first and last elements in the array.
// Return the modified array. The array length will be at least 1. 

/* public int[] swapEnds(int[] nums)
{
	int temp = nums[0];
	nums[0] = nums[nums.length-1];
	nums[nums.length-1] = temp;
	return nums;  */
