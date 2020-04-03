package easyquestions;

public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber reversedNumber = new ReverseNumber();
		System.out.println("The reversed number is: "
				+ reversedNumber.reverseNumber(1021));
	}

	public int reverseNumber(int n) {
		int reverse = 0;
		while (n != 0) {
			reverse = (reverse * 10) + (n % 10);
			// System.out.println(reverse);
			n = n / 10;
			// System.out.println(n);
		}
		return reverse;

	}

}
