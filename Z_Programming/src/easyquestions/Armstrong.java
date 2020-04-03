package easyquestions;

import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {

        int n, t, r, rev = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();
        t = n;

        while (n > 0) {
            r = n % 10;
            System.out.println("Value of r is:" + r);
            rev = rev + r * r * r;
            System.out.println("Value of rev is:" + rev);
            n = n / 10;
        }

        if (rev == t){
          System.out.println("\nThe Number is ArmStrong :" + t);
        }else{
          System.out.println("\nThe Number is Not ArmStrong :" + t);
        }

    }
}