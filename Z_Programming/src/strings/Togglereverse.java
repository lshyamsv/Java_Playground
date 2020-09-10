package strings;

public class Togglereverse {

	public String toggleReverse(String s) {
		String[] words = s.split("\\s");
		String combined = "";

		for (int i = 0; i < words.length; i++) {

			StringBuilder sb = new StringBuilder(words[i]);
			sb.reverse();

			// Getting first character

			String firstChar = sb.substring(0, 1);

			// System.out.println(firstChar);

			// Getting rest of characters
			String restChar = sb.substring(1).toUpperCase();
			// System.out.println(restChar);

			combined = combined + firstChar + restChar + " ";

			// System.out.println(combined);

		}
		System.out.println(combined);
		return combined;
	}

	public static void main(String[] args) {
		Togglereverse rev = new Togglereverse();
		rev.toggleReverse("this is coding");

	}

}
