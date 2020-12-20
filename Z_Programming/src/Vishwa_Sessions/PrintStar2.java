package Vishwa_Sessions;

public class PrintStar2 {

        public static void printStar2(int value){
            for (int i= 0;i<=value;i++){
                for(int j =0;j<i;j++)
                //if(i==value)
                {
                    System.out.print(" ");
                }
                System.out.println("* ");
            }

        }


        public static void main(String[] args) {
            printStar2(5);
        }

    }
