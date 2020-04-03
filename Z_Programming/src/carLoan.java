// Program to calculate car loan
public class carLoan {
	public static void main(String[] args) {

		int carLoan = 10000;
		int loanLength = 3;
		int interestRate= 5;
		int downPayment = 2000;

		if (loanLength<=0 && interestRate<=0)
		{
			System.out.println("You must take out a vaild car loan");
		}
			else if (downPayment>=10000)
			{
				System.out.println("The car is paid in full");
			}
			else 
			{
				int remainingBalance = carLoan - downPayment;
				System.out.println(remainingBalance);
				int months = loanLength *12 ;
				System.out.println(months);
				int monthlyBalance = remainingBalance/36;
				System.out.println(monthlyBalance);
				int interest = (monthlyBalance*5)/100;
				System.out.println(interest);
				int monthlyPayment = monthlyBalance +interest;
				System.out.println("The monthly payment is:" + monthlyPayment );

			}
		}
}