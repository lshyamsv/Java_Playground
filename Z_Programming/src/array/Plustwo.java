package array;

public class Plustwo {
	
	public int[] plusTwo(int[] a, int[] b) {
		  
		  int [] arr = new int [4];
		  arr[0] = a[0];
		  arr[1] = a[1];
		  arr[2] = b[0];
		  arr[3] = b[1];
		  
		  return arr;
		  
		}

}


/*Given 2 int arrays, each length 2, return a new array length 4 containing all their elements. 
	public int[] plusTwo(int[] a, int[] b)
	{
	int[] combArr = {a[0], a[1], b[0], b[1]};
	return combArr;
}
*/
 