package array;

public class Midthree {
	
	public int[] midThree(int[] nums) {

		int [] arr = new int[3];
		int half=nums.length/2;
		arr[0] =  nums[half-1];
		arr[1] = nums[half];
		arr[2] = nums[half+1];

		return arr;

		  
		}

}


// Given an array of ints of odd length, return a new array length 3 containing the elements from
// the middle of the array. The array length will be at least 3.

/* public int[] midThree(int[] nums)
{
	int[] halfArr = new int[3];
	int half = nums.length/2;
	halfArr[0] = nums[half-1];
	halfArr[1] = nums[half];
	halfArr[2] = nums[half+1];
	return halfArr;
}

*/