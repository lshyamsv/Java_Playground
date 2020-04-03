package leetcode;

public class ReverseString {
	 public void reverseString(char[] s) {
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
			char[] c = new char [s.length];
			c[i]=s[i];
			System.out.println(c[i]);
		}
		 
	 }
	

	public static void main(String[] args) {
		
		ReverseString chr = new ReverseString();
		char [] word = {'h','e','l', 'l','o'};
		chr.reverseString(word);
		
	}

}
