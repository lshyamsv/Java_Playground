package Vishwa_Search;

public class Linearsearch {

    public static int searchElement(int [] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                return i;
            }

        } return -1;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5}; //4

        System.out.println(searchElement(arr, 5));
    }
}
