package Vishwa_Search;

public class Binarysearch {

    public static int binarySearch(int[] arr, int start, int end, int target) {

 //       start = 0;
 //       end = arr.length - 1;

//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (target < mid) {
//                start = 0;
//                end = mid;
//            } else if (target > mid) {
//                start = mid+1;
//            } else {
//                System.out.println("Element found");
//                return true;
//            }
//        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                //            start = 0;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
                //        end = arr[arr.length-1];
            } else {
                System.out.println("Element found");
                return mid;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 13, 19, 21, 23};
        binarySearch(arr, 0, arr.length, 0);
    }
}