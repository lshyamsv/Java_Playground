package easyquestions;

public class DuplicateInArray {
	
	public void duplicateInArray(int[] number)
	{
		for(int i=0;i<number.length;i++)
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]==number[j]&&i!=j)
				{
					System.out.println("Duplicate element is:"+ number[i]);
				}
			}
		
	}
	
	public static void main(String args[])
	{
		DuplicateInArray nums = new DuplicateInArray();
		int [] numbe = {5,10,15,20,25,30,10,20};
		nums.duplicateInArray(numbe);
		
	}

}
