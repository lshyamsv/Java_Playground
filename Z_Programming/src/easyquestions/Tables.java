package easyquestions;

import java.util.Scanner;

public class Tables {

	public int multiply(int a)
	{
		for(int i=1;i<=10;i++)
		{
			int multiply =  a*i;
			System.out.println(multiply);
		}
		return a;
	}

	public static void main (String [] args)
	{

		Scanner multiply =  new Scanner(System.in);
		System.out.println("Enter the number for multiplication table: ");
		int tables = multiply.nextInt();
		Tables table = new Tables();
		table.multiply(tables);
		multiply.close();
	}

}
