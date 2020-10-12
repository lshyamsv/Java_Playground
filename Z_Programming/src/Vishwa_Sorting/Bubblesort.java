package Vishwa_Sorting;

public class Bubblesort {

    public static void bubbleSort(int [] arr){

        // long startTime = System.nanoTime();
        int n = arr.length;

        // {3,5,1,9,2}
        for (int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;

                }

            }

        }
//        for(int i =n-1;i>=0;i--){
//            for(int j=0;j<i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp =  arr[j+1];
//                    arr [j+1] = arr[j];
//                    arr[j]= temp;
//                }
//            }
//        }

//        long endTime = System.nanoTime();
//        System.out.println("Took "+(endTime - startTime) + " ns");

    }

    public static void main(String[] args) {
        {
//            int [] arr = {3,5,1,9,2};
            int [] arr = {9,7,6,5,4,3,2,1};
            Bubblesort.bubbleSort(arr);
            for (int i:arr){
                System.out.println(i);
            }

        }
    }
}
