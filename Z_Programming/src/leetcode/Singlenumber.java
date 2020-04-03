package leetcode;

public class Singlenumber {
	
	    public int singleNumber(int[] nums) {
	        if(nums.length<=0)
	        return 0;
	        
	        // We can USE SET which uses extra memory and find the unique number
	        int result =0 ;
	        for(int value:nums)
	        {
	        	System.out.println(value);
	        	 //Bit manipulation using XOR, So it becomes 2^2 =0, that is duplicate 0 XOR 2 = 2
	            result = result^value;
	            System.out.println(result);
	        } return result;
	       
	    }

	public static void main(String[] args) {
		Singlenumber sn = new Singlenumber();
		int[] nums = new int[]{4,1,2,1,2};
		System.out.println(sn.singleNumber(nums));

	}

}
