package Vishwa_Sorting;

public class RotateNTimes {

    public static void rotateArrayNTimes(int [] arr, int k){

        int start = 0;
        int end= arr.length-1;

            reverseArray(arr,0,k-1);
            reverseArray(arr,k,end);
            reverseArray(arr,0,end);

    }
    public static void reverseArray(int [] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }
    }

    public static void main(String[] args) {

        int [] arr = {7,6,4,5,3,1,2};
        for(int i:arr){
            System.out.print(i);
        }
        System.out.println(" ");
        rotateArrayNTimes(arr, 2);
        for(int i:arr){
            System.out.print(i);
        }
    }
}
