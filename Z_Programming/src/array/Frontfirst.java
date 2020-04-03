package array;

public class Frontfirst {

	public int[] front11(int[] a, int[] b) {
		int [] arr = null;

		if(a.length==0&&b.length ==0)
		{
			return arr;
		}
		if (a.length==0)
		{
			arr = new int[1];
			arr[0] = b[0];
		} else if(b.length ==0)
		{
			arr = new int[1];
			arr[0] = a[0];
		} else
		{
			arr = new int[2];
			arr [0] = a[0];
			arr[1] = b[0];
		}
		return arr;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
