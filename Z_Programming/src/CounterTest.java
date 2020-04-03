public class CounterTest {

	static int data;

	CounterTest(int var1) {
		var1 = data;
	}

	public void increment() {
		++data;
	}

	public int getData() {
		return data;
	}

	public static void main(String[] args) {
		CounterTest a = new CounterTest(10);
		// int data2 = ;
		// System.out.println(data+1);
		System.out.println(data++);
		System.out.println(data);
		// a.increment();
		a.increment();
		// this.data;
		System.out.println(data);
		// System.out.println(a.getData());
		// System.out.println(a.getData());

		// CounterTest b = new CounterTest(25);
		// b.increment();
		// System.out.println(b.getData());

	}
}