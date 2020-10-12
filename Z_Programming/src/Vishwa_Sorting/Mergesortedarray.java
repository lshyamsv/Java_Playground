package Vishwa_Sorting;

public class Mergesortedarray {

    public static void mergeSorted(int [] arr1, int m, int n, int [] arr2)
    {
        int i =0;
        m = arr1.length;
        n = arr2.length;
        while(m>=0&&n>=0){
            if (arr1[i]<arr2[i] && i<arr1.length-1) {
                arr1[i] = arr1[i];
                i++;
                m--;
                n--;

            } else {
                int temp = arr1[i];
                int temp1 = arr1[i+1];

                arr1 [i+1] = temp;
                arr1[i+2] =  temp1;

                arr1 [i] = arr2[i];
                i++;
                m--;
                n--;

            }

        }
    }

    public static void main(String[] args) {

        int [] arr1 = {1,3,5,0, 0, 0};
        int [] arr2 = {2,4,6};

        int m = arr1.length;
        int n = arr2.length;

        mergeSorted(arr1 ,m, n, arr2);

        for(int i:arr1){
            System.out.println(i);
        }

    }

}
