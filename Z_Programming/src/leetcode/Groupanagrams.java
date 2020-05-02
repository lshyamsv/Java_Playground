package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groupanagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null)
            return Collections.EMPTY_LIST;
        
        //Algorithm is to sort and group the words together, if they look the same then we can say they are anagrams.
        List<List<String>> groupanagrams = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(String current:strs)
        {
            // creating it to character array so we sort them
            char[] character = current.toCharArray();
            // Sort the character array accordingly
            Arrays.sort(character);
            // Store the current sorted string to compare
            String sorted = new String (character);
            // checking if the map contains the sorted word
            if(!map.containsKey(sorted))
	        	{
                // add sorted word list to the array list mapping
	        		map.put(sorted, new ArrayList<>());
	        	}
            
            // add current word to sorted word list to the array list mapping
            //List associated with the sorted word
            map.get(sorted).add(current);
        } 
        
        //adding all the "MAP VALUES" to the grouped anagrams
        groupanagrams.addAll(map.values());
        // returning the list of grouped anagrams
	    return groupanagrams;
         
        
    }
}