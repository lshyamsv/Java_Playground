package easyquestions;

public class PalindromeNumber {

	private int reverseNumber(int number) {
		 int palindrome = number;
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);// 0+ 1234%10 =4 4*10 +3 =43 
			number = number / 10;
		}
		if (palindrome == reverse) {

			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not a palindrome");
		}
		return reverse;
	}

	public static void main(String[] args) {
		PalindromeNumber palnumber = new PalindromeNumber();
		int reverseNumber = palnumber.reverseNumber(101);
	}

}
