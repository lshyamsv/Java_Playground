package vishwa_sessions;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t){

        int [] count = new int[26];
     //   System.out.println(s);
     //   System.out.println(t);


        if(s.length()!=t.length()||s==null||t==null)
            return false;
        for(int i=0;i<s.length();i++){

            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i :count){
            if(i!=0){
                return false;
            }
        } return true;

    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));

    }
}
