class Foo {
	static int size =20;

	public void calcSize(int size1) {
		System.out.println(size1);
		size = size1;
		System.out.println(size);

	}

	public static void main(String[] args) {

		Foo d = new Foo();
		d.calcSize(10);
		System.out.println(size);

	}

}
