package Vishwa_Sorting;

public class OnetoNSorting {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid + 1, right);

    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int startFirst = left;
        int endFirst = mid - 1;
        int startSecond = mid;
        int endSecond = right;

        int[] temp = new int[arr.length];
        int index = left;

        while (startFirst <= endFirst && startSecond <= endSecond) {
            if (arr[startFirst] < arr[startSecond]) {
                temp[index++] = arr[startFirst++];
            } else {
                temp[index++] = arr[startSecond++];
            }
        }
        while (startFirst <= endFirst) {
            temp[index++] = arr[startFirst++];
        }
        while (startSecond <= endSecond) {
                temp[index++] = arr[startSecond++];
        }
        // main array sorting
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6};
        mergeSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i);

        }
    }
}
