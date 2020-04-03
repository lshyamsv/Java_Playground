package easyquestions;

import java.util.Scanner;

public class Average {

	public float average(float a,float b,float c,float d,float e)
	{
		float f = (a+b+c+d+e)/5;
		return f;
	}

	public static void main (String [] args)
	{
		Scanner avg = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		float g = avg.nextFloat();
		float h = avg.nextFloat();
		float i = avg.nextFloat();
		float j = avg.nextFloat();
		float k = avg.nextFloat();

		Average numbers = new Average();
		System.out.println("The average of all the numbers is: " + numbers.average(g,h, i, j, k));

		avg.close();

	}
}
