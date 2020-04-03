package easyquestions;

import java.util.Scanner;

public class PrimeActualTry {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		
		int sum =0;
		for (int i = 2; i <= n; i++) {
//			System.out.println("Value of I is: " + i);

			for (int j = 2; j <= i; j++) {
//				System.out.println("Value of J is: " + j);
 				if (j == i) 
 				{
					System.out.println(i);
//					sum = sum + i;
				} else if (i % j == 0) 
				{
//					System.out.println("Value of I is: " + i
//						 	+ " and Value of J is: " + j);
					break;
				}

			}

		}
//		System.out.println(sum);

	}

}
