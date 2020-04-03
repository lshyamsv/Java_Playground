package leetcode;

import java.util.Arrays;

public class Reversearrayrework {
	    public void reverseString(char[] s) {
	        if(s.length==0||s.length==1)
	            return;
	        
	        int i=0;
	        int j=s.length-1;
	        while(i<j)
	        {
	            char temp = s[i];
	            s[i]=s[j];
	            s[j]=temp;
	            i++;
	            j--;
	            
	        }
	        
	    }

	public static void main(String[] args) {
		
		Reversearrayrework arr = new Reversearrayrework();
		char [] word = new char[] {'h','e','l','l','o'};
		arr.reverseString(word);
		System.out.println(Arrays.toString(word));
		
		
		
		
	

	}

}
