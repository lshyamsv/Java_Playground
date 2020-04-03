package daysofcode30;

import java.io.*;
import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int i;
		for (i=1;i<=100;i++)
		{
			//            if(i%3==0&&i%5==0)
			//            System.out.println("FizzBuzz");            
			//        
			//        else if(i%3==0)
			//        {
			//           System.out.println("Fizz");
			//        }
			//        else if(i%5==0)
			//         {
			//           System.out.println("Buzz");
			//         }
			//         else
			//         {
			//             System.out.println(i);
			//         }
			//    }

			System.out.println((i%3==0 && i%5 ==0)?"FizzBuzz":(i%5==0)?"Buzz":(i%3==0)?"Fizz":i);

		}

	}
}
