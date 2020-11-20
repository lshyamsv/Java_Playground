        package Vishwa_Sessions;

        public class Rotatearray {

            public static void rotateArray(int [] arr, int k) {
    /*              int value =1;
                    int n = arr.length-1;
                  int temp = arr[0];
                        }
                        int i =0;
                        while(value<k && i< n){
                            arr[i] = arr[i + 1];
                            i++;
                        }
                            arr[n] =  temp;
                         value++;
                          k++;
                            temp = arr[0];*/
        for (int i =1 ; i<=k;i++){
            swap(arr);

        }

            }
            public static void swap (int [] arr){
            int temp = arr[0];
                for(int i = 0; i < arr.length-1;i++) {

                        arr[i] = arr[i + 1];
                    }
                arr[arr.length-1] = temp;

            }


            public static void main(String[] args) {

                int [] arr =  {1,2,3,4,5};
                rotateArray(arr, 3);

                for(int i: arr){
                    System.out.println(i);
                }

            }
        }
