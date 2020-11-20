package Vishwa_Sessions;

public class IsPalindromeRecursion {
    static String s;

    public static boolean isPalindromerec (char [] arr, int i, int j){
        arr = s.toCharArray();
        if(i>=j)
            return true;
        if(arr[i]!=arr[j])
            return false;

        return isPalindromerec(arr,i+1,j-1);
    }

    public static void main(String[] args) {
        s = "madam";
        char [] arr1 = s.toCharArray();
        System.out.println(isPalindromerec(arr1,0,arr1.length-1));
}
    }

