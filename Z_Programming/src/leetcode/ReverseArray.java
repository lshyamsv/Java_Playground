package leetcode;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		Scanner number = new Scanner(System.in);

		System.out.println("Enter the elements in a array");

		for (int i = 0; i < 5; i++) {
			intArray[i] = number.nextInt();
		}
		
//		System.out.println(intArray.length);
		for (int i=intArray.length-1;i>=0;i--)
			
		{
			System.out.print(" " + intArray[i]);
		}

	}

}
