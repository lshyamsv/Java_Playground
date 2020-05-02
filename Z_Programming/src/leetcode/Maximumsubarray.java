package leetcode;

public class Maximumsubarray {
	public int maxSubArray(int[] nums) {
		if(nums.length==0)
			return 0;   

		int preValue = nums[0];
		int max = nums[0];

		for(int i=1;i<nums.length;i++)
		{
			// Checking if the previous value is > 0 so it adds to the total else skip and have nums[i             //  ] as the number
			// if else statement represented like this 
			// preValue = preValue > 0 ? nums[i] + preValue : nums[i];
			// max = Math.max(preValue, max);

			if(preValue>0)
			{
				preValue = nums [i] + preValue;
			} else
			{
				preValue =nums[i];                    
			}
			max = Math.max(preValue, max);
		}

		return max;

	}
}
