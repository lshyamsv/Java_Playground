package questions;

public class factorial {


	public int fact(int a)
	{
		int i =1, n = 1;
		for (i= 1;i<=a;i++)
		{
			System.out.println("the value of I is: " + i);
			n = n*i;
			System.out.println(n);
		}

		return n;
	}


	public static void main(String[] args)
	{
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("Enter the value of n:");
		//		int num = scanner.nextInt();
		//		scanner.close();
		factorial facto = new factorial ();
		facto.fact(5);



	}

}
