package Vishwa_Search;

public class LonelyElement {

   /* Given an array with 2n + 1 integer elements,
    n elements appear twice  in arbitrary places in the array and a single integer appears only once
    somewhere inside. Find the lonely integer with O(n) operations and  O(1) extra memory*/

    // {3,5,3,1,5}


    public static int lonelyElement(int [] arr){
        int result = arr[0];

        for (int i=1; i<arr.length;i++)
        {
            result = result^arr[i];
        } return result;
    }

    public static void main(String[] args) {
        int [] arr = {3,5,3,1,5};
        System.out.println(lonelyElement(arr));
    }



}
