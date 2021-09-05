    package Vishwa_Search;

    public class BS {

        public static boolean binaryS(int [] arr, int target){

            int start = 0;
            int end = arr.length-1;

            while(start<=end){
                int mid = (start+end)/2;
                if(target>arr[mid]){
                    start = mid+1;
                } else if(target<arr[mid]){
                    end = mid-1;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static int bsRecursion(int [] arr, int target, int start, int end){

            if (start>end)
                return -1;

                int mid = (start+end)/2;
                if(target > arr[mid]){
                    return bsRecursion(arr, target, mid+1, end);
                }else if(target<arr[mid]){
                    return bsRecursion(arr, target,0, mid-1);
                } else {
                    return mid;
                }
        }

        public static void main(String[] args) {

            int [] arr = {1,2,3,4,5};
          //  System.out.println(binaryS(arr, 8));
            System.out.println(bsRecursion(arr,0,0,arr.length-1));
        }

    }
