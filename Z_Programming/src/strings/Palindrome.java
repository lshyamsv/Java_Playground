package strings;

public class Palindrome {

	public boolean checkPalindrome(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String comp =  sb.toString();
		
		if(s.equals(comp))
		{
			return true;
		} else
		{
			return false;
		}
	}
	
		
		
	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		pal.checkPalindrome("madam");
	}

}
