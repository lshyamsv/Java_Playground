package easyquestions;

import java.util.Scanner;

public class RemaiderModulus {

	public static void main (String[] args)
	{
		int a, b;
		Scanner mod = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		a=mod.nextInt();
		b=mod.nextInt();

		if(b==0)		
		{
			System.out.println("Dividing by zero not allowed");
		}
		else
		{
			while(a>=b)
			{
				a=a-b;
				//			b=b-a;
			}

			{

			}

			System.out.println("Modulus is:" + a);
			//		System.out.println("Modulus is:" + b);

		}

	}
}