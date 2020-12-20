package Vishwa_Sessions;

public class Armstrongnumber {
    public static boolean armstrongNumber(int n) {
//        int i=1;
        int j = n;
        int arm = 0;
        int mod =0;
     //   for (j=1;j<500;j++) {
            while (j > 0) {
                mod = j % 10; //153%10 = 3 // 15%10 = 5 //1%10
                //   arm = arm + (mod ^ 3); // 0+ 3^3 = 27 //27 + 5^3 = 125+27 = 152 // 152 +1 = 153
                arm = (int) (arm + Math.pow(mod, 3));
                j = j / 10; // n =n/10 =15 //n = n/10 = 15/10 =1 // n=1/10 =0;
            }
           // System.out.println(n);
           // System.out.println(arm);
            if (arm == n) {
                System.out.println(arm);
                  return true;
            }
            //   n++;
            //  return arm;
              return false;
    }
    public static void main(String[] args) {

        System.out.println(armstrongNumber(153));
    }

}
