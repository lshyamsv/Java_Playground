package array;

public class Firstlast {

	public boolean sameFirstLast(int[] nums) {
		if (nums.length==0)
		{
			System.out.println("False");
			return false;
		}
		else if (nums.length>1&&nums[0]==nums[nums.length-1])
		{
			System.out.println("True");
			return true; 
		} else if (nums[0]!=nums[nums.length-1])
		{
			System.out.println("False");
			return false;
		}
		return true ;
	}

	public static void main(String[] args)
	{
		Firstlast arr = new Firstlast();

		int [] nums = new int [] {1,2,1};
		arr.sameFirstLast(nums);

	}
}

//Actual solution 
// return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);