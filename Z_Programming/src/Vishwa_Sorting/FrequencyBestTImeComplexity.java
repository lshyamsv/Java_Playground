package Vishwa_Sorting;

import java.util.Arrays;

public class FrequencyBestTImeComplexity {


    public static int frequencyArray(int[] arr) {
/*//        if (arr.length <= 1) {
//            return 1;
//        }

        //   int[] arr = {1,4,2,3,2} 0 and <n-1*/
//  {1,9,2,3,2} // {1,9,7,8,2} // {1,9,12,8,7}
        int n = arr.length; // n= 5
        for (int i = 0; i < n; i++) {
           arr[arr[i]] = arr[arr[i]] + n;

        }

        //  one loop for each logic needs to written
        for (int i = 0; i < n; i++) { // {0,1,2,1,1}
            arr[i] = arr[i] / n;
        }

        int maxcount = arr[0];
        int element = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxcount) {
                maxcount = arr[i];
                element = i;
            }
        }
        return element;

    }

    public static void main(String[] args) {

        int[] arr = {3,1,3,3,2};
        System.out.println(frequencyArray(arr));
    }
}
