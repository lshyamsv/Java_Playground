public class fibo {

	public int fib(int n) {
		if (n <= 1)
			return n;
		int number = fib(n - 1) + fib(n - 2);
		// System.out.println(number);
		return number;

	}

	public static void main(String[] args) {
		int n = 5;
		fibo series = new fibo();

		System.out.println(series.fib(n));

	}
}