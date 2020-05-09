package codingbat;

public class Fizzarray3 {
	public int[] fizzArray3(int start, int end) {
		int n = end - start;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = start++;
			;
		}
		return arr;
	}

}
