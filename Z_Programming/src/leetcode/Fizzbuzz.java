package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {

	public List<String> fizzBuzz(int n) {
		List<String> word = new ArrayList<String>();
		if (n == 0)
			return null;
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				word.add("Fizz Buzz");
			} else if (n % 3 == 0) {
				word.add("Fizz");
			} else if (i % 5 == 0) {
				word.add("Buzz");
			} else {
				word.add(Integer.toString(i));
			}
		}
		return word;
	}

}
