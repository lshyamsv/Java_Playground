package codingbat;

public class Has12 {
	public static boolean has12(int[] nums) {
		boolean has1 = false;
		// boolean has2 = false;
		for (int i = 0; i < nums.length; i++) {
			if(has1){
				if(nums[i]==2){
					return true;
				}
				} else if(nums[i]==1){
					has1=true;
				}
			} return false;
		}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Has12.has12(new int[] { 2, 1, 4, 1, 6 }));

	}

}
