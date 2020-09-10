package vishwa_sessions;

public class Printreverse {
	
	public static void printReverseRecursively(int [] arr, int i) {
		if(i>=arr.length)
			return;
		printReverseRecursively(arr, i+1);
		System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		
		int [] array = new int [] {1,2,3,4,5};
		printReverseRecursively(array, 0);


	}

}
