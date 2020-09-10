package vishwa_sessions;

public class Maxelementrecursion {
	
	public static int maxElement(int [] arr, int si) {
		if(si >= arr.length) {
			return Integer.MIN_VALUE;
		}
			return Math.max(arr[si], maxElement(arr,si+1));
		}
		

	public static void main(String[] args) {
		
		int [] array = new int [] {3,4,1,2,9};
		System.out.println(maxElement(array, 0));
	}

}