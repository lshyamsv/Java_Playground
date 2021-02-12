package Vishwa_Sorting;

public class SortbyFrequency {

//    Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
//    Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
    // arr =  new int[]

//    1. Find the max element [6,7,8,8]   - 8  -- will be found by iteration
//
//   2. Initialize the temp  array int[] temp = new int[max+1];
//
//   3. Generate the frequence of each element in temp array by iterating // [0, 0, 1, 0, 0, 0, 0, 0, 0]
//
//   4. Use this freqency to sort the original array

    public static int [] sortByFrequency(int [] arr){
        int max = arr[0];
        for (int i:arr){
            if(i>max){
                max = i;
            }
        }
        int [] temp = new int [max+1];

        for (int i =0; i<arr.length;i++){
            temp[arr[i]] = temp[arr[i]]+1;
            }
        for(int i =0;i<arr.length;i++){
            int smallest =i;
            for(int j =i+1;j<arr.length;j++){
//                {2, 5, 2, 8, 5, 6, 8, 8}
//                002002103
                if(temp[arr[j]]>temp[arr[smallest]]){
                    smallest = j;
                }
            }
            int temp1 = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp1;
        }

        return arr;
        }

    public static void main(String[] args) {

       int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
       int [] temp =  sortByFrequency(arr);
       for(int i:temp){
           System.out.print(i);
       }
    }
    }

