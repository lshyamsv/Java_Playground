package strings;

public class Reverseeachwords {

	public String reverseWords(String s) {
		String[] words = s.split("\\s");
		String combined = "";

		for (int i = 0; i < words.length; i++) {

			StringBuilder sb = new StringBuilder(words[i]);

			combined = combined + sb.reverse() + " ";
			System.out.println(combined);
		}
		return combined;
	}

	public static void main(String[] args) {

		Reverseeachwords word = new Reverseeachwords();
		word.reverseWords("this is coding");

	}

}
