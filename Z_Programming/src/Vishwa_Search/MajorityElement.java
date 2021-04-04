package Vishwa_Search;

import java.util.Arrays;

public class MajorityElement {
    /*An element is a majority if it appears more than n/2 times.
    Give an  algorithm takes an array of n element as argument and identifies a  majority (if it exists).
        {1,1,3,5,5,5,5,5,6}
index = n/2 =4
for(0;<-1;i++)
arr[i]= 1
count =1
arr[i] =2
count =1
arr[i]=3
count =1
arr[i]=5
count =5*/

    public static int majorityElement(int[] arr) {
        // O(nlogn)

        Arrays.sort(arr);

        // To find the Max number of times use this code

        int count = 1;
        int maxCount = 1;
        int maxElement = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                    maxElement = arr[i];
                }
            } else {
                count = 1;
            }
        }
        if (maxCount > arr.length / 2) {
            return maxElement;
        } return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,3,5,5,5,5,5,6};
        System.out.println(majorityElement(arr));

    }
    }
