package leetcode;

import java.util.HashMap;
import java.util.Map;

public class romantointeger {
	
	class Solution {
	    public int romanToInt(String s) {
	        if(s.length()==0||s==null)
	            return 0;
	        
	        Map<Character, Integer> romanValues = new HashMap<Character, Integer>();
	        // I,V,X,L,C,D,M
	        
	        romanValues.put('I',1);
	        romanValues.put('V',5);
	        romanValues.put('X',10);
	        romanValues.put('L',50);
	        romanValues.put('C',100);
	        romanValues.put('D',500);
	        romanValues.put('M',1000);
	        
	        int length = s.length();
	        int result = romanValues.get(s.charAt(length-1));
	        
	        for (int i = s.length()-2;i>=0;i--)
	        {
	            if(romanValues.get(s.charAt(i)) >= romanValues.get(s.charAt(i+1)))
	            {
	                result = result + romanValues.get(s.charAt(i));
	            }
	            else {
	            result = result - romanValues.get(s.charAt(i));
	        }return result;
	                 
	                 
	    }
			return result; 
	}

	public void main(String[] args) {
		

	}

}
}

