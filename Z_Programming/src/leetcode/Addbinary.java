package leetcode;

public class Addbinary {
	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			int sum = carry;
			// checking if they are not going out of bounds
			if (i >= 0)
				// converting character to a number
				sum = sum + a.charAt(i) - '0';
			if (j >= 0)
				sum = sum + b.charAt(j) - '0';

			// basically converting the number 1+1 = 2 to 0 and carrying it
			sb.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;

		}
		// checking if the last carry is not equal to zero and appending it
		// accordingly
		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();

	}
	
	public static void main(String [] args){
		System.out.println(Addbinary.addBinary("111", "101"));
	}
}
