    package Vishwa_Sorting;

    import java.util.Arrays;

    public class Selectionsort {
        public static void selectionSort(int[] arr) {

            int n = arr.length;
            for (int i = 0; i < n; i++) {
                int smallest = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[smallest]) {
                        smallest = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }


        }

        public static void main(String[] args) {
            int[] arr = {2, 3, 1, 4, 5};

            selectionSort(arr);
            for (int element : arr) {
                System.out.print(element);

                ;


            }
        }
    }
