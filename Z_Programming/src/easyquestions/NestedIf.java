package easyquestions;

import java.util.Scanner;

public class NestedIf {

	public static void main (String[] args)
	{
		float a,b,c;
		Scanner comp = new Scanner(System.in); 
		System.out.println("Enter three numbers");
		a= comp.nextFloat();
		b= comp.nextFloat();
		c= comp.nextFloat();

		if(a>b){
			if(a>c)
			{
				System.out.println("A is the greatest");
			}
			else
			{
				System.out.println("C is the greatest");
			}
			}
			else 
				if(b>c)
				{
					System.out.println("B is the greatest");
				}
				else
				{
					System.out.println("C is the greatest");
				}
			{
				
		comp.close();
	}

}
}
