
public class Reversenumber {

	public int numberReverse(int number)
	{
		int reverse = 0;
		while (number!=0)
		{
			reverse = (reverse*10)+(number%10);
			System.out.println(reverse);
			number = number/10;
			System.out.println(number);
		}
		return reverse;
	}
	public static void main(String[] args) {
		Reversenumber rev = new Reversenumber();
		System.out.println("The Reversed number is " +rev.numberReverse(1234));

	}

}
