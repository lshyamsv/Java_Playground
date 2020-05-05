package leetcode;

import java.util.HashMap;

public class Ransomenote {
	    public boolean canConstruct(String ransomNote, String magazine) {
	        //https://www.youtube.com/watch?v=gWqbmAS3uxg
	        // Basically algo is to put the character in a map and make sure its present in magazine, that is it will 0 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(char c:magazine.toCharArray()){
	            map.put(c, map.getOrDefault(c,0) +1);     
	        }
	        for(char c:ransomNote.toCharArray()){
	        if(!map.containsKey(c)||map.get(c)<=0){
	            return false;
	        }
	            map.put(c, map.get(c) -1);
	        }  
	        return true;
	        
	    }
	}
