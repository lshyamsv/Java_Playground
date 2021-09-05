package Vishwa_Sessions;

public class Arrayshuffle {

    // [a,b,c,d,A,B,C,D] -> [a,A,c,d,b,B,C,D]
    // [a,A,b,B,c,C,d,D]

    public static void arrayDivide(int [] arr, int arr1start,int arr1end, int arr2start, int arr2end){

        if(arr1start>=arr2end)
            return;

        int mid = (arr1start+arr1end)/2; // [a,b,c,d] [A,B,C,D]
        int mid1 = (arr2start+arr2end)/2; // [A,B,C,D]

        int p = mid +1;
        int q = arr2start;
        int j = arr1end;
        int l =mid1;


        while(p<=j && q<=l){
            swap(arr,p,q);
            p++;
            q++;
        }

        arrayDivide(arr, arr1start, mid, mid+1, arr1end);
        arrayDivide(arr, arr2start, mid1, mid1+1, arr2end);
     }

     public static void swap(int [] arr, int i, int j){

            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;

        }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};
        arrayDivide(arr,0, 3,4,arr.length-1);

        for(int i:arr){
            System.out.print(i);
        }

    }
    }

