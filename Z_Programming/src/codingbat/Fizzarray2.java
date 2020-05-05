package codingbat;

public class Fizzarray2 {
	public String[] fizzArray2(int n) {
		String[] fizz = new String[n];
		for (int i = 0; i < n; i++) {
			fizz[i] = String.valueOf(i);
		}
		return fizz;
	}

}
