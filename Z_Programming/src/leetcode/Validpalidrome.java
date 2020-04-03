package leetcode;

public class Validpalidrome {

	public boolean validPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
				System.out.println("Letter i is: " + s.charAt(i));
				i++;
			}
			while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
				System.out.println("Letter i is: " + s.charAt(j));
				j--;
			}
			if (i < j
					&& Character.toLowerCase(s.charAt(i++)) != Character
							.toLowerCase(s.charAt(j--))) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Validpalidrome string = new Validpalidrome();
		string.validPalindrome("A man, a plan, a canal: Panama");

	}

}
