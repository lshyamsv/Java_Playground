public class Fibonacci {

	public int fibonacci(int count)
	{

		int[] fib = new int[count];
		fib[0]=0;
		fib[1]=1;

		for(int i=2; i < count; i++)
		{
			fib[i] = fib[i-1] + fib[i-2];

		}
		for(int i=0; i< count; i++)
		{
			System.out.print(fib[i] + " ");
		}
		return count;
	}
	public static void main(String[] args) {
		Fibonacci fibonacciSeries = new Fibonacci();
		fibonacciSeries.fibonacci(10);
	}

}
