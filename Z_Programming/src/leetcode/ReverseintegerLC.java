package leetcode;

class Solutions {
    public int reverse(int x) {
        int reverse = 0;
        while (x!=0)
        {
            x=x/10;
            reverse = (reverse*10)+(x%10);
        } 
        return reverse;
    }
    
}