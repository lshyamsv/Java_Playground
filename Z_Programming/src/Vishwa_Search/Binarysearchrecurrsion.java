package Vishwa_Search;

public class Binarysearchrecurrsion {

    // int[] arr = {2, 4, 8, 10, 13, 19, 21, 23};
    // 19

    public static int binarySearchRec(int [] arr, int start, int end, int target){
        // start = 0;
        // end = arr.length-1;
        if(start>end)
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]<target){
          return  binarySearchRec(arr,mid+1,end,target);
        } else if (arr[mid]>target) {
          return  binarySearchRec(arr, start, mid - 1, target);
        } else {
            return mid;
        }
    }
}
