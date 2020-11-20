package Vishwa_Sessions;

public class Recursionpalindrome {
	
	
	static String S;
	boolean isPalindrome = false;
	
	public static boolean isPalindrome(char [] arr, int i) {
		arr = S.toCharArray();
		if(S.length()==1||S.length()==0)
			return false;
		
		isPalindrome(arr, i+1); 
		return true;
	}
	
public static void main(String[] args) {
		
		//int [] array = new int [] {1,2,3,4,5};
		S = "madam";
		isPalindrome(S.toCharArray(),0);
}
}