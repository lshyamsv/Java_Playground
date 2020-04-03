package daysofcode30;

import java.util.Scanner;

public class BinaryDecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println(consecutiveOnes(n));
	}

	public static int consecutiveOnes(int n) {
		int count = 0;
		int max = 0;
		
		
		while (n > 0) 
		{
			System.out.println("Value of n in for loop is :" + n);
			if (n % 2 == 1) 
			{
				System.out.println("Value of n in if loop is :" + n);
				count++;
				max = Math.max(max, count);
			} else 
			{
				count = 0;
			}
			
			n = n >> 1;
			System.out.println(n);
		}
		return max;
	}
}