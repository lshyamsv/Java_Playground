package ds.array;

public class Lengtharray {

	public static void main(String[] args) {
		int[] intArray = new int[6];
		int length = 0;

		for (int nums : intArray) {
//			System.out.println("The value at position: " + nums + " is " + nums);
		}
		System.out.println("----------------------------");
		for (int i = 0; i < 3; i++) {
			intArray[length] = i;
//			System.out.println(length);
			System.out.println(intArray[length]);
			length++;
//			System.out.println(intArray[length]);
//			System.out.println("The value at position: " + i + " is " + intArray[length]);
//			System.out.println(intArray[length]);
//			
		}
		intArray[3] = 10;
		System.out.println("----------------------------");

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("The value at position: " + i + " is " + intArray[i]);
		}
		System.out.println("----------------------------");
		for (int i = 3; i >= 0; i--) {
			intArray[i + 1] = intArray[i];
			System.out.println("The value at position: " + i + " is " + intArray[i]);
		}
		intArray[0] = 20;
		System.out.println("----------------------------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("The value at position: " + i + " is " + intArray[i]);
		}

	}

}
