    package Vishwa_Sorting;

    public class WaveformSorting {

        public static void waveForm(int [] arr){
            for (int i=1; i<arr.length;i=i+2){
                if(arr[i]<arr[i-1]){
                    swap(arr, i, i-1);
                }
                if(arr[i+1] > arr[i] && i < arr.length){
                    swap(arr, i+1,i);
                }

            }

        }

        public static void swap (int [] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        public static void main(String[] args) {

//            int [] arr1 = {3,5,6,7,8,1,2};
            int [] arr1 = {1,4,8,2,9,1,2};
            waveForm(arr1);

            for(int i:arr1){
                System.out.println(i);
            }

        }
        }

