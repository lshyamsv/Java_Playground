package Vishwa_Sorting;

public class Zeroandones {

//    Input :  arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
//    Output : arr[] = [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

    public static void zerosAndOnes(int [] arr){
     //   int index = 0;
        int start = 0;
        int end = arr.length-1;

        while(start<end){ // start and end which is just pointers
            while(arr[start]==0){ // two pointer one from left
                start++;
            } while(arr[end]==1){ // two pointer one from right
                end--;
            }
            // since we are traversing the array only once the time complexity is O(N)
            if(start<end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        zerosAndOnes(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    // three pointer approach and counter approach (BF)
// [0,0,1,2,0,1,2,1,0]
// [0,0,0,0,1,1,1,2,2]

}
