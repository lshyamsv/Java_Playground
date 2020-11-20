package Vishwa_Sorting;

public class Movingindex {

    // [3,4,6,7,1,2] i = 2
    // [3,4,0,6,7,1]

    public static void movingIndex(int [] arr, int i){

        int prev = arr[i]; // 6
        for( int j = i+1;j<arr.length;j++){ // j=3 // j=4 //j =5
             int temp = arr[j]; // 7 // 1 // 2
             arr [j] = prev;  // [3,4,6,6,1,2] // [3,4,6,6,7,2] // [3,4,6,6,7,1]
            prev = temp;  // 7 // 1 // 2

        }
        arr [i] =0 ; // [3,4,0,6,7,1]

    }

    public static void movingIndex1(int [] arr, int i){
        // [3,4,6,7,1,2] i = 2
        // [3,4,0,6,7,1]

        for( int j = arr.length-1; j>i; j--){  // j = 5 // j=4 / j=3
            arr[j] = arr[j-1]; // arr[5] = arr [4] => [3,4,6,7,1,1] // [3,4,6,7,7,1] // [3,4,6,6,7,1]

        }
        arr [i] =0 ; // [3,4,0,6,7,1] // // [3,4,0,6,7,1]

    }

    public static void main(String[] args) {

        int []  arr = {3,4,6,7,1,2};
        movingIndex1(arr, 2);
        for (int i: arr)
        {
            System.out.println(i);
        }
    }
}
