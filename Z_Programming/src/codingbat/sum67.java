package codingbat;

public class sum67 {
	public static int sum67(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				while (nums[i] != 7) {
					i++;
				}
			} else {
				sum = sum + nums[i];
			}
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println(sum67.sum67(new int[] { 2, 3, 5, 6, 8, 8, 7 }));

	}

}
