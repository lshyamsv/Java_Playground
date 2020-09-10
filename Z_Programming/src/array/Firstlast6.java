package array;

public class Firstlast6 {

	public boolean firstLast6(int[] nums) 
	{
		for(int i=0; i<nums.length;)
		{

            return nums[0] == 6 || nums[nums.length - 1] == 6;

		}
		return true;

	}


	public static void main(String[] args)
	{
		Firstlast6 arr = new Firstlast6();
		
		int [] nums = new int [] {6,4,3,4};
		arr.firstLast6(nums);

	}
}
