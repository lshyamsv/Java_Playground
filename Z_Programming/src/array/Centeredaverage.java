package array;

import java.util.Arrays;

public class Centeredaverage {

	public static int centeredAverage(int[] nums) {

		int max = nums[0]; //1
		int min = nums[0];//1
		int sum = nums[0];//1
	//	int n = nums.length - 1;

		for (int i = 1; i < nums.length; i++) { //1, 1, 5, 5, 10, 8, 7 
			// 1, 5, 5, 10, 8, 7 
			sum = sum + nums[i]; // sum =1+nums[1] =1 = 2 //sum = 2 + nums[2](5) =7 //sum = 7+ nums[3](5) = 12 //sum =12 +nums[4] (10) = 22//sum =22 +nums[5] (8) = 30////sum =30 +nums[6] (7) = 37
			System.out.println(sum);
			if (nums[i] > max) { // nums [2](5) > max (1)
 				max = nums[i]; //max = nums[2] = 5;nums[4]=10
			} else if (nums[i] < min) {
				min = nums[i];
			}

		}
		sum = sum-max-min;
		System.out.println(sum);
		return sum / (nums.length - 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 1, 5, 5, 10, 8, 7 };
		System.out.println(centeredAverage(arr));

	}

}
