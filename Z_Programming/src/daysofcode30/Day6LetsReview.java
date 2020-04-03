package daysofcode30;

import java.io.*;
import java.util.*;

public class Day6LetsReview {

	public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner scan = new Scanner(System.in);
		        int T = scan.nextInt();
		        for (int i = 0; i < T; i++) {
		            String str = scan.next();
		            printEvensOdds(str);
		        }
		        scan.close();
		    }

		    /* For efficient appending, use a StringBuffer instead of a String */
		    public static void printEvensOdds(String str) {
		        StringBuffer evens = new StringBuffer();
		        StringBuffer odds  = new StringBuffer();
		        int stringLength = str.length() - 1;
		        if (stringLength < 0) {
		            System.out.println("Not valid string");
		        } else {
		            for (int i = 0; i <= stringLength; i++) {
		                if (i % 2 == 0) {
		                    char evenString = str.charAt(i);
		                    System.out.print(evenString);
		                }
		            }
		            for (int j = 0; j <= stringLength; j++)

		                if (j % 2 == 1) {
		                    char oddString = str.charAt(j);
		                    System.out.print(oddString);
		                }
		        }
		        System.out.println(evens + " " + odds);

		    }
//		       
		    
}
