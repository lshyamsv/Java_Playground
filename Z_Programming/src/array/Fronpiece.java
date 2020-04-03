package array;

public class Fronpiece {
	public int[] frontPiece(int[] nums) {
		  
		  if (nums.length<=2)
		  return nums;

		   int[] arr = null;
		  if(nums.length >2)
		  arr = new int[2];
		  arr[0]= nums[0];
		  arr[1]= nums[1];
		  
		  
		  return arr;
		}
}