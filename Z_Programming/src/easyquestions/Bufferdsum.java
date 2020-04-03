package easyquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bufferdsum {
	
	public static void main (String [] args) throws IOException
	{
		int a,b,c;
		Scanner sum = new Scanner(System.in);
		InputStreamReader read =  new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(read);
		
		a= Integer.parseInt(buff.readLine());
		b= Integer.parseInt(buff.readLine());
		
		c= a+b;
		System.out.println("The sum of buffered numbers is: " + c);
		sum.close();
		
	}

}
