package leetcode;

import java.util.Arrays;

public class Maxprofit {
	
	 public int maxProfit(int[] prices) {
	        if(prices.length <=1 )
	            return 0;
	        
	        int maxProfit = 0;
	        // length -1 to prevent array index out of bounds because checking prices + 1
	        for(int i=0; i<prices.length-1;i++)
	        {
	            if(prices[i]<prices[i+1])
	            {
	                maxProfit = maxProfit + prices[i+1]-prices[i];
	                System.out.println(maxProfit);
	            }
	        } 
	        return maxProfit;
	       
	        
	    }

	public static void main(String[] args) {
		
		Maxprofit max = new Maxprofit();
		int [] arr = {1,2,0,3,0,2};
		System.out.println(max.maxProfit(arr));
		

	}

}
