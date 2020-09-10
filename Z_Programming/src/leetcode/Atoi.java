package leetcode;

public class Atoi {

	public int aToi(String str)
	{
		// "123" = 123
		// "+123" = 123
		// -123 = -123

		
		if(str==null||str.length()==0){
			return 0;
		}
		str = str.trim();
		double result = 0;
		boolean isNegative = false;
		int startIndex = 0;

		if(str.charAt(0)=='+'||str.charAt(0)=='-')
		{
			startIndex++;
		}
		if(str.charAt(0)=='-')
		{
			isNegative = true;
		}

		// normal case 123


		for(int i=startIndex;i<=str.length();i++)
		{
			if(str.charAt(i)<'0'||str.charAt(i)>'9')
			{
				break;
			}
			int digit = str.charAt(i)-'0';
			result = result *10 +digit;
		}

		if(isNegative)
		{
			result = -result;
		}

		if(result >Integer.MAX_VALUE)
		{
			return Integer.MAX_VALUE;
		}
		if(result < Integer.MIN_VALUE)
		{
			return Integer.MIN_VALUE;
		}

		return (int) result;
	}

}
