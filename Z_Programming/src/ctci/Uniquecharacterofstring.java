package ctci;

public class Uniquecharacterofstring {

	public boolean uniqueCharacter(String s) {
		if (s.length() == 0 || s.length() > 128)
			return false;

		// char [] uni = s.toCharArray();
		// System.out.println(uni);

		boolean[] chararr = new boolean[128];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			System.out.println(val);
			if (chararr[val]) {
				return false;
			}
			chararr[val] = true;

		}
		return true;

	}

	public static void main(String[] args) {

		Uniquecharacterofstring letters = new Uniquecharacterofstring();
		letters.uniqueCharacter("ijkl");

	}

}
