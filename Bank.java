import java.util.*;
class BankAccount
{
	String account_holder;
	int account_number;
	String account_type;
	int amount;
	int cash;
	void asign(String account,int account_no,String ac_type,int money)
	{
		account_holder=account;
		account_number=account_no;
		account_type=ac_type;
		amount=money;
	}
	void data()
	{
		System.out.println("Account Holder name is:"+account_holder);
		System.out.println("Account number is:"+account_number);
		System.out.println("Account  type :"+account_type);
		System.out.println("Balance is :"+amount);
	}
	
	void deposit()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Your Balance is:"+amount);
		System.out.println("Enter Amount that how much you want to Deposit");
		 cash=obj.nextInt();
		amount=amount+cash;
		System.out.println("After deposit amount  is:"+amount);
		
	}
	void withdraw()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Money that how much you want to withdraw");
		int withdraw=obj.nextInt();
		amount=amount-withdraw;
		System.out.println("Amount after withdraw :"+amount);
	}
	void show()
	{
		System.out.println("Name of Account holder is:"+account_holder);
		System.out.println("Balance is :"+amount);
	}
}
class Saving_Account extends BankAccount
{
	
	void asign(String account,int account_no,String ac_type,int money)
	{
		super.asign("Kashif",5520,"saving",20000);
		
	}
	
	void deposit()
	{
		super.deposit();
		System.out.println(" After Deposit amount:"+amount);
	}
	void withdraw()
	{
		super.withdraw();
		System.out.println("Remaing amount is:"+amount);
		
	}
	void show()
	{
		super.show();
	}
	void compute()
	{
		super.deposit();
		
		int one=cash*1/100;
	}
}
class Current_Account extends BankAccount
{
	
	void asign(String account,int account_no,String ac_type,int money)
	{
		super.asign("Kashif",5520,"saving",20000);
		
	}
	void deposit()
	{
		super.deposit();
		System.out.println(" After Deposit amount:"+amount);
	}
	void withdraw()
	{
		super.withdraw();
		System.out.println("Remaing amount is:"+amount);
		
	}
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
	public static void main(String arg[])
	{
	Scanner ob=new Scanner(System.in);
	
	BankAccount bank=new BankAccount();
	//System.out.println("amount is:"+bank.amount);
	Saving_Account save=new Saving_Account();
	Current_Account current=new Current_Account();
	System.out.println("1.Saving Account");
	System.out.println("2.Current Account");
	System.out.println("Enter Account type");
	int ch=ob.nextInt();
	if(ch==1)
	{
		
		bank.asign("Kashif",5520,"saving",20000);
		bank.data();
		save.asign("Kashif",5520,"saving",20000);
		Scanner obj=new Scanner(System.in);
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Compute and deposit interest");
		System.out.println("4.show");
		System.out.println("Entre Your choice");
		int choice=obj.nextInt();
		if(choice==1)
		{
			
		save.deposit();
		}
		if(choice==2)
		{
		save.withdraw();
		}
		if(choice==3)
		{
			save.compute();
		}
		if(choice==4)
		{
			save.show();
		}
	}
	if(ch==2)
	{
		
		bank.asign("Kashif",5520,"Current",20000);
		current.asign("Kashif",5520,"current",20000);
		bank.data();
		Scanner obj=new Scanner(System.in);
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.show and Penalty");
		System.out.println("Entre Your choice");
		int choice=obj.nextInt();
		if(choice==1)
		{
		current.deposit();
		}
		if(choice==2)
		{
		current.withdraw();
		}
		if(choice==3)
		{
		current.show();	
		}
		
	}
	}
}