package easyquestions;

public class Primenumbers {

	public int calculateprimenumbers(int number) {
		int primenumber = number;
		if (number == 1) {
			return 1;
		} else
			for (int i = 2; i <= primenumber; i++) {
				if(primenumber%i==0&&primenumber/1==primenumber)
				{
					System.out.println("Number is prime: " + primenumber);
					break;
				}else
					System.out.println("Number is not prime: " + primenumber);
				break;

			}
		return primenumber;
	}

	public static void main(String[] args) {
		Primenumbers primenumbers = new Primenumbers();

		primenumbers.calculateprimenumbers(12);
	}

}
