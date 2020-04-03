package leetcode;

import java.util.HashMap;

public class Firstunique {
	public int firstUnique(String s)
	{
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int n = s.length();
		for (int i=0; i<n;i++)
		{
			char c = s.charAt(i);
			count.put(c, count.getOrDefault(c, 0)+1);
			System.out.println(count.get(c));
		}
		for (int i =0;i<n;i++)
		{
			if(count.get(s.charAt(i))==1)
			{
				return 1;
			}
		} return -1;
		
		
	}
	
	

	public static void main(String[] args) {
		
		Firstunique first =  new Firstunique();
		first.firstUnique("shyamisimproving");
	}

}
