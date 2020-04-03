package easyquestions;

import java.util.Scanner;

public class DescendingOdd {
	
	public static void main(String [] args)
	{
		System.out.println("Enter the number: ");
		Scanner number = new Scanner(System.in);
		int rangeNumber = number.nextInt();
		
		int i;
		rangeNumber = rangeNumber*2;
		for(i=rangeNumber;i>=rangeNumber;rangeNumber--)
		{
			if(rangeNumber%2==1)
			System.out.println(rangeNumber);

		}
		
	}

}
