package easyquestions;

import java.util.Scanner;
public class SumOfArray {
	
	public static void main (String []args)
	{
		
		int [] intArray=  new int[5];
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the elements in a array");
		
		for(int i=0;i<5;i++)
		{
			intArray[i]=number.nextInt();
		}
		
		int sa =0;
		for (int i =0; i<5;i++)
		{
			sa = sa + intArray[i];
		}
		
		System.out.println(sa);
		
		
		
	}

}
