package Vishwa_Sorting;


//1. Alternative Sorting
//        Given an array of integers, print the array in such a way that the first element is first maximum and second element is first minimum and so on.
//        Examples :
//        Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
//        Output : 7 1 6 2 5 3 4

//        Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
//        Output : 9 1 8 2 7 3 6 4


//Create a new array of the same length
//Traverse the array and find max element
//store it in max
//        Traverse the array and find min element
//store it in min
//Place the max and min element in the array accordingly


import java.util.Arrays;

public class MaxMinSorting {

    public static int[] alternativeSort(int[] arr) {
        if (arr.length <= 1 || arr == null)
            return arr;

        Arrays.sort(arr);
        for (int i:arr){
            System.out.print(i);
        }
        System.out.println();
        int[] arr1 = new int[arr.length];

//        int max = arr[0];
//        int min = arr[0];
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (start <= end) {
            if(start==end) {
                arr1[i] = arr[start];
                break;
            }
            arr1[i] = arr[end];
            i++;
            arr1[i] = arr[start];
            i++;
            start++;
            end--;
        }

//        for (int i = 0; i<arr.length; i++){

        return arr1;
    }

    public static void main(String[] args) {

        int [] arr =  {7, 1, 2, 3, 4, 5, 6};
        int [] result = alternativeSort(arr);
        for (int i:result){
            System.out.print(i);
        }
    }
    }
