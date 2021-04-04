    package Vishwa_Search;

     public class BitonicSearch {

            /**
             * This function should return if the data is present in the array or not
             * @param arr
             * @param data
             * @return
             */
            public boolean isElementPresent(int[] arr , int data){
                // First find the inflexion point
                int inflexionP = findInflexion(arr, 0, arr.length-1);
                return searchElement(arr,0, arr.length-1 , inflexionP , data);
            }

            private boolean searchElement(int[] arr, int start, int end, int inflexionP , int data) {

                /**
                 * Binary search if data is present between start and inflexionP
                 *
                 * start -> inflexionP : ascending order
                 */

                boolean present = binearySearch(arr, start, inflexionP, data);
                if(present){
                    return true;
                }

                /**
                 * inflexionpoint+1 -> end ...descending order
                 */
                present = binarySearchWhichWorksOnDescedingOrderElements(arr,inflexionP+1,end, data);
                return present ;

            }

            private static boolean binarySearchWhichWorksOnDescedingOrderElements(int[] arr, int i, int end, int data) {
                /**
                 * Fill the code here
                 *
                 * "INDEX depending on the mid always"
                 */

                while (i <= end) {
                    int mid = (i + end) / 2;
                    if (arr[mid] > data) {
                        i = mid + 1;
                    } else if (arr[mid] < data) {
                        end = mid - 1;
                    } else {
                        return true;
                    }
                }return false;
            }

            private boolean binearySearch(int[] arr, int start, int inflexionP, int data) {
                /**
                 * Fill the code here
                 */
                while(start<=inflexionP){
                    int mid = (start+inflexionP)/2;
                    if(arr[mid]<data){
                        start = mid + 1;
                    } else if(arr[mid] > data){
                        inflexionP = mid -1;
                    } else {
                        return true;
                    }

                }

                return false;
            }

           private static int findInflexion(int[] arr, int start, int end) {

                /**
                 * this we have already implemented
                 */

                while (start <= end) {
                    int mid = (start + end) / 2;

                    if(mid==0 && arr[mid+1]<arr[mid]){
                        return mid;
                    }
                    if(mid==arr.length-1 && arr[mid-1]<arr[mid]){
                        return mid;
                    }
                    // finding inflection point

                    if(arr[mid-1]<arr[mid] && mid+1 < arr.length && arr[mid+1] <arr[mid]){
                        return mid;
                    } else if (mid +1 < arr.length && arr [mid+1] > arr [mid]){
                        start = mid+1;
                    } else {
                        end = mid-1;
                    }
                } return -1;
            }

       /* public static int binarySearchinflectionPoint(int[] arr, int start, int end) {

                // {3,4,5,7,11,8,6,1}

                //{9,8,7,6,5,3,2,1}

                //{1,2,3,4,5,6,7,9}

                while (start <= end) {
                    int mid = (start + end) / 2;

                    if(mid==0 && arr[mid+1]<arr[mid]){
                        return mid;
                    }
                    if(mid==arr.length-1 && arr[mid-1]<arr[mid]){
                        return mid;
                    }
                    // finding inflection point

                    if(arr[mid-1]<arr[mid] && mid+1 < arr.length && arr[mid+1] <arr[mid]){
                        return mid;
                    } else if (mid +1 < arr.length && arr [mid+1] > arr [mid]){
                        start = mid+1;
                    } else {
                        end = mid-1;
                    }
            } return -1;
            }
    */
            public static void main(String[] args) {
                int[] arr = {9,8,7,6,5,3,2,1};
           //     System.out.println(findInflexion(arr, 0, arr.length));
                System.out.println(binarySearchWhichWorksOnDescedingOrderElements(arr, 0, arr.length-1, 6));
            }
        }
