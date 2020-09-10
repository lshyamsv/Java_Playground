package leetcode;

import java.util.Arrays;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
		// Arrays.sort(A);
		if (A.length <= 1)
			return A;
		// Two pass algorithm O(N) runtime O(N) space
		int[] result = new int[A.length];
		int count = 0;
		// [3,1,2,4] => [1,2,3,4]

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				result[count] = A[i];
				count++;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 1) {
				result[count] = A[i];
				count++;
			}
		}
		return result;

	}

	public static void main(String[] args) {

	}

}
