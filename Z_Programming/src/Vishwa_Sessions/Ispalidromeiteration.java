package Vishwa_Sessions;

public class Ispalidromeiteration {

    public static boolean isPalindrome(String s){
        char [] c = s.toCharArray();
        if(s.length()<=1 ||s==null)
        return false;


        char [] newc = new char[s.length()];
        int j=0;
        for(int i=c.length-1;i>=0;i--){
            newc[j]=c[i];
            j++;

        }
        for(int i=0;i<c.length;i++){
            if(c[i]==newc[i]){
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));

    }
}
