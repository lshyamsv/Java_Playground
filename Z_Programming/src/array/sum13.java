package array;

public class sum13 {
	public static int sum13(int[] nums) {
		  int sum =0;
		  int counter =0;
		  for(int i=0;i<nums.length;i++)
		  {
		    if(nums[i]==13)
		    {
		     i++;
		    }
		    else{
		      sum = sum + nums[i];
		    }
		} 

		return sum; 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 1, 5, 5, 10, 8, 7 };
		System.out.println(sum13(arr));

	}

}
