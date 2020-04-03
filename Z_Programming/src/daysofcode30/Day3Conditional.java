package daysofcode30;

public class Day3Conditional

{
	public static void conditionStatements(int n) {
		if (n % 2 == 1 && n > 2) {
			System.out.println("Weird");
		} else
		{
		if (n >=2 && n <= 5 && n % 2 == 0) {
			System.out.println("Not Weird");
		} else if (n >= 6 && n<=20&&n % 2 == 0) {
			System.out.println("Weird");
		}
		else if (n>20&&n%2==0)
		{
			System.out.println("Not Weird");
		}
		}
	}
	public static void main(String[] args) {

		Day3Conditional.conditionStatements(2);
	}

}
