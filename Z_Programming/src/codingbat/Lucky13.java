package codingbat;

public class Lucky13 {
	public static boolean lucky13(int[] nums) {
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==1||nums[i]==3){
		      return false;
		    }
		   
		  } return true;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Lucky13.lucky13(new int[] { 2, 2, 5, 13, 8, 8, 7 }));
	}

}
