package array;

public class Makemiddle {
	
	public int[] makeMiddle(int[] nums) {
		  if(nums.length<=2)
		  return nums;
		  int [] arr = new int [2];
		  int half  = nums.length/2;
		  
		  arr[0] = nums[half-1];
		  arr[1] = nums[half];
		  
		  return arr;
		}

}
