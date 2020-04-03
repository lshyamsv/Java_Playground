class Prime
{
	public static void main (String[] args)
	{		
		int i =0;
		int num =0;
		String  primeNumbers = "";
		for (i = 1; i <= 6; i++)         
		{ 		  	  
			int counter=0; 	 
			System.out.println("The counter value is "+ counter);
			for(num =i; num>=1; num--)
			{
				System.out.println("The number value is: "+num);
				if(i%num==0)
				{
					System.out.println("\nThe number value inside IF : "+num);
					counter = counter + 1;
					System.out.println("The counter value in this loop is "+ counter);
					
				}
			}
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
				System.out.println("\nThe prime number is : "  + primeNumbers);
			}	
		}	
		System.out.println("\n Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}
