package easyquestions;

import java.util.Scanner;

public class MinimumvalueArray {

	public static void main(String[] args) {

		int min=0;
		Scanner size = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int n=size.nextInt();
		int[] nums = new int[n];

		for(int i=0;i<n;i++)
		{
			Scanner numbers = new Scanner(System.in);
			nums[i] = numbers.nextInt();
		}
		for(int i=0; i<n;i++)
		{
			if(min>=nums[i])//0>=-10 // -10 >=10 //-10>=20 //-10>-200
			{
				min=nums[i]; // min = -10 //min =-900
			}
		}
		System.out.println("The minium value in the array is:" + min);
	}
	

}
