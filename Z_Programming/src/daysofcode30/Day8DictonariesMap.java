package daysofcode30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictonariesMap {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phonebookMap = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phonebookMap.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if (phonebookMap.containsKey(s)) {
				System.out.println(s + "=" + phonebookMap.get(s));
			} else {
				System.out.println("Not found");
			}
		}

			in.close();

		}

	}

