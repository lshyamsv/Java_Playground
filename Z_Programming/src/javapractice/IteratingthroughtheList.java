package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingthroughtheList {

	public static void main(String[] args) {

		ArrayList<String> series = new ArrayList<String>();
		series.add("Asshole");
		series.add("MF");
		series.add("CS");
		series.add("Bastard");
		series.add("Chutiyae");

		// for each loop Java 1.8 lambda expression

		System.out
				.println("-------------Java 8 Lambda Expression---------------");
		series.forEach(iter -> {
			System.out.println(iter);
		});

		// using iterator
		
		System.out.println("-------------using Tterator---------------");

		Iterator<String> shows = series.iterator();
		while (shows.hasNext()) {
			String stupid = shows.next();
			System.out.println(stupid);
		}
		
		// using iterator and remaining method

		System.out
				.println("-------------using Iterator and Java 8 remaining method---------------");

		shows = series.iterator();
		shows.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		//using for each

		System.out.println("-------------using for each---------------");
		for(String show:series)
		{
			System.out.println(show);
		}
		
		// using index
		
		System.out.println("-------------using index and standard for---------------");
		
		for(int i=0;i<series.size();i++)
		{
			System.out.println(series.get(i));
		}
		

	}
}
