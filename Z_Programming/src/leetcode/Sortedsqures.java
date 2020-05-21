package leetcode;

import java.util.Arrays;

public class Sortedsqures {
	public int[] sortedSquares(int[] A) {

		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		Arrays.sort(A);
		return A;
	}

}
