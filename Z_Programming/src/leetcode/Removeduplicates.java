package leetcode;

public class Removeduplicates {

	public int removeDuplicates(int[] nums) {

		if(nums.length<=1)
			return 0;
		int i= 0;
		for(int j=1;j<nums.length;j++)
		{
			if(nums[j]!=nums[i])
			{
				i++;
				nums[i]=nums[j];
			}
		} 
		return i+1;
		
	}

	public static void main (String [] args)
	{
		Removeduplicates arr1 = new Removeduplicates();
		int [] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
		int y = arr1.removeDuplicates(arr);
		System.out.println(y);

	}

}
