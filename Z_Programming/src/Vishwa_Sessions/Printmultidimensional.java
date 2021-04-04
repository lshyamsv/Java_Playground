package Vishwa_Sessions;

import java.util.Arrays;

public class Printmultidimensional {

    public static int[][] printMultiDimensional(int [] [] arr){
        /*int start =0;
        int end = arr.length-1;

        while(start<=end){
            arr[start] [start] = 1;
            start ++;
        }*/

        for (int row =0; row < arr.length;row++){
            for(int col = 0;col < arr.length;col++){
                arr [row] [col] = row++;


            }
        }


        return arr;
    }

    public static void main(String[] args) {
        int [] [] arr =  new int [5] [7];
        String array = Arrays.deepToString((arr));
        System.out.println(array);

    }
}
