package leetcode;

import java.util.HashSet;

class Containsduplicate {
	public boolean containsDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < nums.length; i++) 
		for (int i:nums)
		{
			if (set.contains(i)) 
			{
				System.out.println(i);
				return true;
			} 
			else 
			{
				System.out.println(set.add(i));
			}
		}
		return false;

	}
	public static void main (String [] args)
	{
		Containsduplicate dup = new Containsduplicate();
		int [] arr = {1,2,3,4};
		System.out.println(dup.containsDuplicate(arr));
		
	}
}