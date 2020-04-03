package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosumrework {
	    public int[] twoSum(int[] nums, int target) {
	        if(nums.length==0||nums.length<1)
	            return new int[0];
	        
	        int [] result = new int [2];
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(map.containsKey(target-nums[i]))
	        	{
	        		result[0]=map.get(target-nums[i]);
	        		result[1]=i;
	        	}
	        	map.put(nums[i], i);
	            
	        } return result;
	        
	    }
	

	public static void main(String[] args) {
		
		Twosumrework res = new Twosumrework();
		int [] arr = new int[] {2, 7, 11, 15};
		
//		System.out.println(arr);
//		res.twoSum(arr, 9);
		int [] resarr = res.twoSum(arr, 9);
		System.out.println(Arrays.toString(resarr));
//		System.out.println(resarr);
		
		//  [2, 7, 11, 15], target = 9,

	}

}
