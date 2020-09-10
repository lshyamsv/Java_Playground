package easyquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateHashArray {
	
	public void duplicateInArrayHash(int [] number)
	{
		Set<Integer> num = new HashSet<Integer>();
		for(int numb:number)
		{
			if(num.add(numb)==false)
			{
				System.out.println("Duplicate element is:" + numb );
			}
		}
		
	
	}
	
	public static void main(String[] args)
	{
		DuplicateHashArray nums = new DuplicateHashArray();
		int [] numbe = {5,10,15,20,25,30,10,20};
		nums.duplicateInArrayHash(numbe);
	}

}
