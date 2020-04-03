package leetcode;

import java.util.Arrays;

public class Validanagram {
	
	public boolean isAnagram(String s, String t)
	{
		if(s.length()!=t.length())
			return false;
		int [] count = new int[26];
		for (int i=0;i<s.length();i++){
			count[s.charAt(i)-'a']++;
			System.out.println(Arrays.toString(count));
//			System.out.println(count);
			count[t.charAt(i)-'a']--;
			System.out.println(Arrays.toString(count));
//			System.out.println(count);
		}
		for (int i:count)
		{
			if(i!=0)
			{
				System.out.println(i);
				return false;
			}
		} return false;
	}
	

	public static void main(String[] args) {
		
		Validanagram anagram  = new Validanagram();
		anagram.isAnagram("anagram", "nagaram");
		

	}

}
