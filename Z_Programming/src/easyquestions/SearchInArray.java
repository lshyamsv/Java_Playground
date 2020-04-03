package easyquestions;

public class SearchInArray {

	public int searchInArray(int [] nums, int s)
	{

		for(int i=0;i<=nums.length-1;i++)
		{
			if(nums[i]==s)
			{
				System.out.println("Element found: " + s);
			} else
			{
				System.out.println("Element not found: " + s);
			}

		}
		return s;


	}

	public static void main(String[] args) {

		SearchInArray arr = new SearchInArray();
		int [] nums = {5,10,15,20,25,30};
		arr.searchInArray(nums, 10);


	}

}
