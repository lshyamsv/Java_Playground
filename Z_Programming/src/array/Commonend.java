package array;

public class Commonend {
	
	public boolean commonEnd(int[] a, int[] b) {
		 
		if(a.length<=0||b.length<=0)
		  {
		    return false;
		  }
		  for (int i=0; i<a.length;i++)
		  {
		  for (int j=0;j<b.length;j++)
		  {
		    if(a[0]==b[0]||a[a.length-1]==b[b.length-1])
		    {
		      return true;
		    } else
		    {
		      return false;
		    }
		  }
		  }return true;
		}

	public static void main(String args[])
	{
		Commonend arr = new Commonend();

		int [] nums = new int [] {1,2,3};
		int [] nums1 = new int [] {1,2,3};
		
		arr.commonEnd(nums,nums1);

	}

}
