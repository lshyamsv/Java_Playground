package Vishwa_Search;

public class SearchlastindexDuplicates {

    public static int searchDuplicateIndex(int[] arr, int target) {

        int index = binarySearchNew(arr, 0, arr.length - 1, target);

        for (int i = index; i < arr.length; i++) {
            if (arr[i] == arr[index]) {
                index = i;
            }
        }return index;
    }

    private static int binarySearchNew(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                if(mid +1 <arr.length && arr[mid+1] == target) {
                    start = mid + 1;
                }
                 else {
                        return mid;
                    }
                }

            }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,5};
        System.out.println(binarySearchNew(arr,0, arr.length-1,3));


    }
}
 /*An element is a majority if it appears more than n/2 times. Give an  algorithm takes an array of n element as argument and identifies a  majority (if it exists).
        {1,2,3,5,5,5,5,5,6}
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