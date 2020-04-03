package leetcode;

import java.util.Arrays;

public class Movezeroes {
	
	public void moveZeroes(int [] nums)
	{
		int index =0;
		for( int i =0 ; i <nums.length;i++)
		{
			if(nums[i]!=0)
			{
				nums[index++]=nums[i];
			}
		}
			for(int i=index;i<nums.length;i++)
			{
				nums[i]=0;
			}
		}
	
	public static void main(String [] args)
	{
		Movezeroes zero = new Movezeroes();
		int [] arr = {1,2,0,3,0,2};
		zero.moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}
	}


