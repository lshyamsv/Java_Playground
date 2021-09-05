package questions;

public class Passbyvalue {
	
	public static void main(String[] args) {
	    int number = 1;
	    number = addThreeAndReturn(number);

	    System.out.println(number);
	}

	public static int addThreeAndReturn(int incremented) {
	    incremented = incremented + 3;

	    return incremented;
	}
	  

}
