package leetcode;

public class ReversearrayLC {
	public void reverseString(char[] s) {   
		reverseStrin(s,0,s.length-1);	
	}
		public void reverseStrin(char[]s, int i, int j)
		{
		while(i < j)
		{
			int tmp = s[i];
			s[i] = s[j];
			s[j]=(char) tmp;
			i++;
			j--;
		}
		}

	public static void main(String[] args) {
		ReversearrayLC rev = new ReversearrayLC();
		char [] arr = new char[] {'h','e','l','l','o'};
		rev.reverseString(arr);
//		System.out.println(arr);
	}

}
