package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersectionarrays {

	public int[] intersection(int[] nums1, int[] nums2) {

		//creating 2 sets to store unique elements
		// goes through each element in array and it set which will add unique items
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i:nums1) 
		{
			set.add(i); 
		}

		// go through each element in array 2 and if it contains that element add it to the 
		// "contain" set
		HashSet<Integer> intersection = new HashSet<Integer>();
		for (int i:nums2)  
		{
			if(set.contains(i))  
			{
				intersection.add(i);
			}
		}
		// create an array of contain (intersection) size elements
		System.out.println(intersection.size());
		int [] output =  new int [intersection.size()];
		System.out.println(Arrays.toString(output));

		//set an index to fill up the array later
		int index = 0;

		for (int i: intersection)
		{
			output[index++] =  i; 
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		Intersectionarrays arr = new Intersectionarrays();
		int [] arr1 = new int [] {1,2,2,1};
		int [] arr2 = new int [] {2,2};
		int [] result = arr.intersection(arr1, arr2);
		System.out.println(Arrays.toString(result));


	}

}
