package codingbat;

public class Fizzarry {

	public static int[] fizzArray(int n) {
		int[] fizzarr = new int[n];
		for (int i = 0; i < n; i++) {
			fizzarr[i] = i;
		}
		return fizzarr;

	}

	public static void main(String[] args) {
		System.out.println(Fizzarry.fizzArray(5));

	}

}
