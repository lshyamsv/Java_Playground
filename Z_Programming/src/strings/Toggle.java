package strings;

public class Toggle {

	public String toggleWord(String s) {

		String[] words = s.split("\\s");
		String combined = "";
		for (int i = 0; i < words.length; i++) {
			
//			StringBuilder sb = new StringBuilder();
			String firstChar = words[i].substring(0,1);
//			System.out.println(firstChar);
			String restOfChar = words[i].substring(1);
//			System.out.println(restOfChar);
			String caps = restOfChar.toUpperCase();
			combined = combined +  firstChar + caps +" ";
			System.out.println(combined);
			
			
		} System.out.println(combined); 
		return combined;
	} 
	public static void main (String [] args)
	{
		Toggle word = new Toggle();
		word.toggleWord("this is coding");
		
	}
}
