package leetcode;

public class Besttimetosellstock {

	public int maxProfit(int[] prices) {
		if (prices.length <= 1)
			return 0;
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			System.out.println(minPrice);
			if (prices[i] < minPrice) {
				minPrice = prices[i];
				System.out.println(minPrice);
			} 
			else if (prices[i] - minPrice > maxProfit) {
				System.out.println("Price of array element" + prices[i]);
				System.out.println("Min price" + minPrice);
				System.out.println("Max profit " + maxProfit);
				maxProfit = prices[i] - minPrice;
				System.out.println(maxProfit);
			}
		}
		return maxProfit;

	}
	public static void main(String [] args)
	{
		Besttimetosellstock stock = new Besttimetosellstock();
		int [] stockValueRange =  {7,1,5,3,6,4,10};
		stock.maxProfit(stockValueRange);
	}
}