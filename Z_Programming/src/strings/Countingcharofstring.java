package strings;

import java.util.HashMap;

public class Countingcharofstring {

	public int countCharOfString(String s) {

		// create a map to store character and integer values
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		// to store count of character

		int value = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// putting characters in a map or default index if not available
			// hm.put(c, hm.get(c)+1);
			hm.put(c, hm.getOrDefault(c, 0) + 1);
			value = hm.get(c);
			System.out.println(c + " = " + value);
		}
		return value;
	}

	public static void main(String[] args) {
		Countingcharofstring chr = new Countingcharofstring();
		chr.countCharOfString("Hello World");
	}

}
