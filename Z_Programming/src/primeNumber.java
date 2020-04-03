import java.util.Scanner;

class primeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Empty String
		String primeNumbers = "";
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		scanner.close();
		
		int i = 0;
		int num = 0;
		for (i = 1; i <= n; i++) {
			int counter = 0;
			 System.out.println(counter);
			for (num = i; num >= 1; num--) {
				 System.out.println("Value of i is: " + i);
				 System.out.println("the number is " + num);
				if (i % num == 0) {
					counter = counter + 1;
					 System.out.println(counter);
//					 System.out.println("hi");
				}
			}
			if (counter == 2) {
				// System.out.println("yo" + counter);
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);
	}
}