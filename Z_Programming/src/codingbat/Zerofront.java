package codingbat;

public class Zerofront {
	public int[] zeroFront(int[] nums) {
		// int [] arr = new int[nums.length];
		// int left = 0;
		// int right = nums.length-1;
		// for (int i =0;i<nums.length;i++){
		// if(nums[i]==0){
		// arr[left]=nums[i];
		// left++;
		// }else if(nums[i]==1||nums[i]==-1){
		// arr[right] = nums[i];
		// right--;
		// }else if(nums[i]!=0&&nums[i]!=1)
		// {
		// arr[i]= nums[i];
		// }
		// } return arr;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;
			}
		}
		return nums;
	}

}
