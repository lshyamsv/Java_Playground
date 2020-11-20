package Vishwa_Sessions;

public class Fibonaccirec {

    public static double fibSeriesRec(int n) {
        double fib = 0;
//
        if (n <= 1)
            return n;
            fib = fibSeriesRec(n - 1) + fibSeriesRec(n - 2);
        return fib;
    }



    public static void main(String[] args) {
        System.out.println(fibSeriesRec(25));
    }
}
