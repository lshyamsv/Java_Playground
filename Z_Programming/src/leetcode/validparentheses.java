package leetcode;

import java.util.Stack;

public class validparentheses {

	    public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for (char c : s.toCharArray())
	        {
	            if(c=='(' || c=='[' || c=='{')
	            {
	                stack.push(c);
	            } else
	            {
	                if(stack.isEmpty())
	                    return false;
	                if(c == ')' && stack.pop() != '(')
	                    return false;
	                if(c ==']' && stack.pop() != '[')
	                    return false;
	                if(c =='}' && stack.pop() != '{')
	                    return false;
	            }
	                
	        } return stack.isEmpty();        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
