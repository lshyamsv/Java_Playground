package Vishwa_Sessions;

public class Printstar {

    public static void printStar(int value, int row){
//        for (int i= 0;i<value;i++){
//            System.out.println("**********");
//        }
        for(int i=0;i<row;i++){
            for(int j=0;j<value;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printStar(10, 4);
    }

}
