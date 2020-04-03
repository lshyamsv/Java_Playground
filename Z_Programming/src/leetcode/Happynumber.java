package leetcode;

import java.util.HashSet;

public class Happynumber {
	public boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<Integer>();
		while(n!=1)
		{
			if(set.contains(n))
				return false;
			set.add(n);
			n= findNext(n);
		} return true;

	} 

	private int findNext(int n)
	{
		int res =0;
		while(n>0)
		{
			res += (n%10) * (n%10);
			n/=10;
		} return res ;
	}
}
