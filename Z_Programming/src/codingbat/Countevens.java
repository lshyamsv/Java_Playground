package codingbat;

public class Countevens {
	public static int countEvens(int[] nums) {

		int counter = 0;
		if (nums.length == 0)
			return 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				counter = counter + 1;
		}
		return counter;

	}

	public static void main(String[] args) {
		System.out.println(Countevens.countEvens(new int[] { 2, 3, 5, 13, 8, 8,
				7 }));

	}

}
