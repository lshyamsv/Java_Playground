package Vishwa_Sessions;

public class Lengthofstring {

	static String s;

	public static int lengthOfString(char[] a, int i) {
		if (i >= a.length) {
			return 0;
		}
		a = s.toCharArray();
		lengthOfString(a, i + 1);
		return i + 1;

	}

	public static void main(String[] args) {

		s = "tour";
		lengthOfString(s.toCharArray(), 0);
		// System.out.println(j);
	}

}
