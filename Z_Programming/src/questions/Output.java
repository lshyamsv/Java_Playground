package questions;

public class Output {

	public static void main(String[] args) {

		int i = 1, j = 10;
		do {
			if (i > j)
				break;
			j--;
		} while (++i < 5);
		System.out.println("I = " + i + " and J = " + j);

	}

}
