package Vishwa_Sorting;

public class TwoSum {

    public static void twoSum(int[] arr, int target) {

        // { 1,3,5,7,11,15 } Output = 12

        int start = 0;
        int end = arr.length - 1;

        if (start == end)
            return;

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                System.out.println(arr[start]);
                System.out.println(arr[end]);
                break;
            } else if (arr[start] + arr[end] > target) {
                end--;

            } else {
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = { 1,3,5,7,11,15 };
        twoSum(arr, 12);

        }

    }

