package leetcode;

class Sumofprime {
	public int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (i % 1 == 0 && i % i == 0) {
				count++;
			}

		}
		return count;

	}
	
	public static void main (String [] args)
	{
		Sumofprime result = new Sumofprime();
		result.countPrimes(10);
	}
}