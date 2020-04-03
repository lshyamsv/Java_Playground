package interviewkickstart;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GenerateSubets {

/* COPIED CODE TRY URSELF */
	
	static String[] generate_all_subsets(String s) {
        List<String> list = new ArrayList<String>();
        generate_all_subsets(s, "", 0, list);
        return list.toArray(new String[list.size()]);
    }
    
    static void generate_all_subsets(String s, String prefix, int idx, List<String> list) {
        if(idx == s.length()) {
            list.add(prefix);
            return;
        }
        
        generate_all_subsets(s, prefix, idx+1, list);
        generate_all_subsets(s, prefix+s.charAt(idx), idx+1, list);
    }

	public static void main(String[] args) {

		
		GenerateSubets.generate_all_subsets("hack");


	}
}
