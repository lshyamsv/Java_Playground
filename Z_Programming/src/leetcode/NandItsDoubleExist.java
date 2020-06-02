package leetcode;

import java.util.HashSet;

public class NandItsDoubleExist {
	public boolean checkIfExist(int[] arr) {
		// https://leetcode.com/problems/check-if-n-and-its-double-exist/discuss/504918/JAVA-Easy-5-
		// // Line-Solution-with-EXPLANATION
		// Using HashSet give O(1) lookup
		// [10,2,5,3]
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			if (set.contains(i * 2) || (set.contains(i % 2 == 0) && set.contains(i / 2 == 0))) {
				return true;
			} else {
				set.add(i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
