package leetcode;

public class Powerofthree {
	    public boolean isPowerOfThree(int n) {
	        if (n<=0)
	            return false;
	        while(n%3==0)
	        {	          
	            n=n/3;
	            
	        }  return n == 1;
	        
	    }

	public static void main(String[] args) {
		
		Powerofthree num = new Powerofthree();
		System.out.println(num.isPowerOfThree(45));

	}

}
