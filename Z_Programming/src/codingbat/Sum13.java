package codingbat;

public class Sum13 {

	public static int sum13(int[] nums) {
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
			} else {
				sum = sum + nums[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(Sum13.sum13(new int[] { 2, 3, 5, 13, 8, 8, 7 }));

	}

}
