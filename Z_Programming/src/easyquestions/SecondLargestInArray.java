package easyquestions;

import java.util.Scanner;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int n;
		int largest = 0;
		int slargest = -1;
		int s;

		System.out.println("Enter size of array");
		Scanner size = new Scanner(System.in);
		n = size.nextInt();

		int[] intArray = new int[n];

		System.out.println("Enter the elements of the array");

		for (int i = 0; i < n; i++) {
			Scanner numbers = new Scanner(System.in);
			intArray[i] = numbers.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(largest<=intArray[i])
			{
				largest=intArray[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(slargest<=intArray[i]&&intArray[i]<largest)
			{
				slargest = intArray[i];
			}
		}
		
		System.out.println("Second Largest element is "+slargest);

	}
}