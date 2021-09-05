package Vishwa_Sessions;

public class ArraySetQuestion19 {
 /**   Given an array of elements,
       how do you check whether the list is  pairwise sorted or not? A list is considered pairwise sorted if each
       successive pair of numbers is in sorted (non-decreasing) order.
   // [3,4,2,4,1,5,7,8]
    [3,4,2,4,1,5,7,1]
  **/

 public static boolean arrayPair(int [] arr){
     for(int i =0 ;i<arr.length-1;i=i+2){
         if(arr[i+1]>=arr[i]){
             continue;
         } else{
             return false;
         }
     } return true;
 }

    public static void main(String[] args) {
        int [] arr = {3,4,2,4,1,5,7,8};
        System.out.println(arrayPair(arr));

    }

}
