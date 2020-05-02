package ds.stack;

public class app {

	public static void main(String[] args) {
		 Stack stk = new Stack(2);
		 stk.push(10);
		 stk.push(20);
		 stk.push(30);
		 stk.push(10);
		
		 while(!stk.isEmpty()){
		 System.out.println(stk.pop());
		 }
//		String S = "Hello";
//		int lengthstk = S.length();
//		Charstack cstk = new Charstack(lengthstk);
		reverseString("Hello");
	}

	public static String reverseString(String S) {
		int lengthstk = S.length();
		Charstack cstk = new Charstack(lengthstk);
		for (int i = 0; i < lengthstk; i++) {
			cstk.push(S.charAt(i));
			// System.out.println(cstk.peek());
		}
		while (!cstk.isEmpty()) {
			System.out.print(cstk.pop());
		}

		return null;
	}

}
