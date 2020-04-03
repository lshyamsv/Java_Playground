package easyquestions;

import java.util.Scanner;

public class Add {

	public int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner scansum = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int c =  scansum.nextInt();
		System.out.println("Enter the second number: ");
		int d =  scansum.nextInt();
		
		
		Add sum = new Add();
		System.out.println(sum.add(c, d));
		scansum.close();
	}

}
