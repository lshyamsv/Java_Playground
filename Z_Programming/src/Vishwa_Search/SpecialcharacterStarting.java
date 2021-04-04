package Vishwa_Search;

public class SpecialcharacterStarting {

    // [0,1,2,3,4,5,6,7,8,9,*,*,*]
    // not allowed to use array.length

    private static int specialCharacter(char[] arr, int start, int end) {

        /**
         * this we have already implemented
         */
        while (start <= end) {
            int mid = (start + end) / 2;

            if(Character.isDigit(arr[mid-1])&&!Character.isDigit(arr[mid+1])){
                return mid +1;
            } else if (Character.isDigit(arr[mid-1])&&Character.isDigit(arr[mid+1])){
                start = mid +1;
            } else {
                end = mid -1 ;
            }
            } return -1;
    }

    public static void main(String[] args) {

        char [] arr = {'0','1','2','3','5','6','*','*','*'};
        System.out.println(specialCharacter(arr, 0, arr.length-1));


    }
}
