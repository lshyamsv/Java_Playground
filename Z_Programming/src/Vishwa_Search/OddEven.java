package Vishwa_Search;

public class OddEven {

   /* Separate even and odd numbers: Given an array A[],
    write a function  that segregates even and odd numbers. The functions should put all  even numbers first, and then odd numbers. Example: Input =  {12,34,45,9,8,90,3} Output = {12,34,90,8,9,45,3}
     Note: In the output,  the order of numbers can be changed,
    i.e., in the above example 34 can  come before 12,
    and 3 can come before 9*/

    public static int [] evenOdd(int [] arr){
        int start =0;
        int end = arr.length-1;

        /*int [] arr1 = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr1[evenindex] = arr[i];
                evenindex++;
            }else {
                arr1[oddindex] = arr[i];
                oddindex--;
            }
        } return arr1;
*/
      // {12,1,45,9,8,90,3}
        while(start<end){
            if(arr[start]%2!=0&&arr[end]%2==0){
                swap(arr,start,end);
                start ++;
                end --;
            }else if(arr[start]%2==0&&arr[end]%2!=0){
                start++;
                end--;
            }else if(arr[start]%2==0&&arr[end]%2==0){
                start++;
            } else{
                end --;
            }
        }
        return arr;
    }

    public static void swap(int [] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        int [] arr = {12,34,45,9,8,90,3};
        int [] arr1 = evenOdd(arr);

        for (int i:arr1){
            System.out.print(i + " ");
        }

    }
}
