import java.util.*;
class BankAccount
{
	String account_holder;
	int account_number;
	String account_type;
	int amount;
	void asign(String account,int account_no,String ac_type,int money)
	{
		account_holder=account;
		account_number=account_no;
		account_type=ac_type;
		amount=money;
	}
	void deposit()
	{
		Scanner obj=new Scanner(System.in);
		System.println("Enter Amount that how much you want to Deposit");
		int cash=obj.nextInt();
		amount=amount+cash;
		
	}
	void withdraw()
	{
		System.out.println("Enter Money that how much you want to withdraw");
		int withdraw=obj.nextInt();
		amount=amount-withdraw;
	}
	void show()
	{
		System.out.println("Name of Account holder is:"+account_holder);
		System.out.println("Balance is :"+amount);
	}
}
class Saving_Account extends BankAccount
{
	void asign()
	{
		super.asign();
	}
	void deposit()
	{
		super.deposit();
	}
	void withdraw()
	{
		super.withdraw();
		
	}
	void show()
	{
		super.show()
	}
	void compute()
	{
		int one=cash*1/100;
	}
}
class Current_Account extends BankAccount
{
	
	void show()
	{
		super.show();
		if(amount<500)
		{
			int penalty=amount*3/100;
			amount=amount-penalty;
			System.out.println("Amount in the account");
		}
		
	}
}
class Bank
{
	Scanner ob=new Scanner(System.in);
	Saving_Account save=new Saving_Account();
	Current_Account current=new Current_Account();
	System.out.println("Enter Account type");
	int ch=ob.nextInt();
	if(ch==1)
	{
		save.asign();
		save.deposit();
		save.withdraw();
		save.show();
	}
	if(ch==2)
	{
		current.asign();
		current.deposit();
		current.withdraw();
		
		current.show();
	}
}