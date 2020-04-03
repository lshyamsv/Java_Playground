package strings;

public class Capitalize {
	
	public String capitalizeString(String s)
	{
	 String []  words =	s.split("\\s");
	 String combined = "";
	 for(int i= 0; i<words.length;i++)
	 {
		String first = words[i].substring(0, 1).toUpperCase();
		String rest = words[i].substring(1);
		
		System.out.println(first);
		System.out.println(rest);
		
		combined = combined + first + rest + " " ;
		System.out.println(combined);
		
		
	 } 
	return combined;
	}

	public static void main (String args [])
	{
		Capitalize word = new Capitalize();
		word.capitalizeString("this is coding");
	}
}
