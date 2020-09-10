package leetcode;

public class ReplaceElements {

	// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/discuss/482693/Java-O(n)-TimeO(1)-Space-SimpleClear-(100)-Solution
	// O(N) and O(1)
	// [17,18,5,4,6,1]
	public int[] replaceElements(int[] arr) {
		int max = arr[arr.length - 1];
		arr[arr.length - 1] = -1;
		for (int i = arr.length - 2; i > -1; i--) {
			int curVal = arr[i];
			arr[i] = max;
			max = Math.max(max, curVal);
		}
		return arr;
	}
}
