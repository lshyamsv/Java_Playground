package Vishwa_Sorting;

public class FindingMedian {

    public static int findMedianSortedArray(int [] arr, int [] arr1){

        // (1,4,6,8,10)
        // (2,5,7,9,11) merge in O(N)

        int start = 0;
        int end = arr.length;
        int start1 = 0;
        int end1 = arr1.length;

        int [] merge = new int [arr.length + arr1.length];
        int index =0;

        while (start < end && start1 < end1){
            if (arr[start]<arr1[start1]){
                merge [index] =  arr[start];
                index ++;
                start ++;
            } else {
                merge [index] = arr1[start1];
                index ++;
                start1++;
            }
        }
        while (start < end){
            merge [index] = arr[start];
            index ++;
            start ++;
        }

        while (start1 < end1){
            merge [index] = arr[start1];
            index ++;
            start1 ++;
        }
        // (1,3,5,7,9)
        // (6,10,12,14,16)

       // arr = (1,3,5,7,8,9)
       // int median = merge[merge.length/2]; //

        int median = merge[merge.length/2];
        int median1 = merge[(merge.length/2) -1];

        int actualMedian = (median +median1)/2;

        // actualMedian = (merge[merge.length/2] + merge[(merge.length/2) -1])/2;

        return actualMedian;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        int[] arr1 = {2,4,6,8,10};
        System.out.println(findMedianSortedArray(arr, arr1));
    }
}

