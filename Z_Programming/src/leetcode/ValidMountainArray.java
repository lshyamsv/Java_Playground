package leetcode;

public class ValidMountainArray {
	public static boolean validMountainArray(int[] A) {
		// Binary Search based problem
		// https://leetcode.com/problems/valid-mountain-array/discuss/293527/JAVA-100
		int start = 0;
		int end = A.length - 1;
		if (A.length < 3)
			return false;
		int max = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[max]) {
				max = i;
			}
		}
		if(max == 0 || max == A.length-1) 
			return false;
		System.out.println("The value of max " + max);
		for (int i = 0; i < max; i++) {
			if (A[i] < A[i + 1]) {
			//	System.out.println(A[i]);
//				System.out.println(A[i+1]);
				continue;
			} else {
				return false;
			}
		}

		for (int i = max; i < A.length-1; i++) {
			if (A[i] > A[i + 1]) {
				System.out.println(A[i]);
				System.out.println(A[i+1]);
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 3, 2, 1 };
		System.out.println(ValidMountainArray.validMountainArray(arr));

	}

}
