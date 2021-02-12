package Vishwa_Sorting;

public class TwoSumRotated {

    public static void twoSumRotated (int [] arr, int target){

        // [5,8,11,1,3,4]

      /*  for (int i= 0; i<arr.length;i++){
        int start =0;
        int end = arr.length -1;*/

        int index = 0;
        for (int i= 0; i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                index= i+1 ;
            }
        }
        System.out.println(index);

        int start =0;
        int end = index-1;
        int start1 =  index;
        int end2 =  arr.length-1;

        for(int i =0; i<end2;i++){
            if(arr[start]+arr[start1]==target){
                System.out.println(arr[start]);
                System.out.println(arr[start1]);
                break;
            } else if (arr[start]+arr[start1] < target){
                start++;
            } else if (arr[end+1]+arr[start1]<target){
                   end++;
                   start1++;

            }
            }

        System.out.println(arr[end]);
        System.out.println(arr[start1]);

            }


    public static void main(String[] args) {
      //  int [] arr = {5,8,11,13,1,2};
        int [] arr = {8,1,2,3};
        twoSumRotated(arr, 5);



    }
}
