package Vishwa_Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyWithoutSpace {

//    Find the element with highest frequency w/o space
//    First in O(n*2)
//    Improve it to a better TC
//    Try to solve it in linear time if the elements of the array are in the ranges [0,n-1] where n is the size of the array.

//    {1,1,3,1,2,1,4,5,3,1,3,3,3,3}

/*    public static int frequencyArray(int [] arr) {

        if(arr.length<=1){
            return 1;
        }
        // o(n*2)
         // frequency
        int maxcount = 1;
        int element = arr[0];

        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if (count > maxcount){
                    maxcount = count;
                    element = arr[i];
                }
            }

        } return element;

    }*/

    /*public static int frequencyArrayWithSpace(int[] arr) {

        if (arr.length <= 1) {
            return 1;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxcount = 1;
        int element = arr[0];
        for (int i : map.keySet()) {
            int count = map.get(i);
            if (count > maxcount) {
                maxcount = count;
                element = i;
            }

        }
        return element;

    }*/



    public static int frequencyArrayBetterrComplexity(int[] arr) {

        if (arr.length <= 1) {
            return 1;
        }
        Arrays.sort(arr);

        int maxcount = 1;
        int count = 1;
        int element = arr[0];

        // first it evaluates the left side and throws an exception right there instead of evaluating the right side as well.

        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length && arr[i] == arr[i + 1] ) { // if should always be comparison of same type
                count++;
            } else {
                count = 1;
            }
            if (count > maxcount) { // different if block because different condition is being evaluated


                maxcount = count;
                element = arr[i];
            }
        }
        return element;
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 1, 2, 1, 4, 5, 3, 1, 3, 3, 3, 3};
        System.out.println(frequencyArrayBetterrComplexity(arr));
/*
        for(int i:arr){
            System.out.print(i + " ");
        }*/

        // 1 1 1 1 1 2 3 3 3 3 3 3 4 5
    }


    // if and else should be comparison of same type (not data type) but of same logical type
    // if and if else must be of same scenario, should not be a different scenario

}

 //   int[] arr = {1,4,2,3,2} 0 and <n-1


