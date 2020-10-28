package assignment4;
import java.util.*;

class Account{
	int accno;
	String name,type;
	double balance;
	
	Account(){
		System.out.println("constructor of class Account");

	}
	void DisplayAcDetails() {
		System.out.println("account number= "+accno+"\nName= "+name+"\n Account Type= "+type+"\nAccount Balance= "+balance);
	}
}

class SavingAccount extends Account{
	final int minbal=100;
	int withdrawlimit=30000;
	double interest=2.0;
	
	SavingAccount(){
		System.out.println("class SavingAccount constructed");
	}
	SavingAccount(int no,String name,String accountType,int bal){
		
		
	}
	
	void DisplayAcDetails() {
		accno=9872;
		this.name="Rishabh";
		type="Saving Account";
		
		super.DisplayAcDetails();
		
	}
	void Deposit() {
		System.out.println("enter amount you want to deposit: ");
		Scanner sc=new Scanner(System.in);
		int depositAmt=sc.nextInt();
		
		balance=balance+depositAmt;
		System.out.println("Amount deposited successfully..!!\n your Saving Account balance is= "+balance);
		System.out.println();
	}
	void Withdraw() {
		System.out.println("enter amount you want to withdraw: ");
		Scanner sc=new Scanner(System.in);
		int withdrawAmt=sc.nextInt();
		
		if(withdrawAmt>minbal && withdrawAmt<=withdrawlimit && withdrawAmt<=balance)
		{
			balance=balance-withdrawAmt;
			System.out.println("amount withdraw suffessfull");
			System.out.println("your saving balance is= "+balance);
		}
		else {
			System.out.println("Enter amount greater than 100 and less than withdrawl limit and your saving balance amount to withdraw");
		}
		System.out.println();
	}
}

class CurrentAccount extends Account{
	int withdrawlimit=40000;
	double noofTxperday=5;
	double interest=2.5;
	
	CurrentAccount(){
		System.out.println("constructor of class CurrentAccount");
		
	}
	void DisplayAcDetails() {
		accno=234781;
		this.name="Ravi";
		type="Current Account";
		super.DisplayAcDetails();
	}
	void Deposit()
	{
		System.out.println("Enter amount to deposit in current account: ");
		Scanner sc=new Scanner(System.in);
		int depositAmt=sc.nextInt();
		balance=balance+depositAmt;
		System.out.println("Your Current Account balance is: "+balance);
		System.out.println();
	}
	void Withdraw() {
		System.out.println("Enter amount to withdraw: ");
		Scanner sc=new Scanner(System.in);
		int withdrawAmt=sc.nextInt();
		if(withdrawAmt<=balance && withdrawAmt<=withdrawlimit)
		{
			System.out.println("Withdrawl from current account is successfull..!!\n");
			balance=balance-withdrawAmt;
			System.out.println("your current Account balance is: "+balance);
			System.out.println("\n");
		}
		else {
			System.out.println("enter less amount\n");
		}
	}
}

public class BankAccount {



	public static void main(String[] args) {
	
		Account obj1=new Account();
		SavingAccount obj2=new SavingAccount();
		CurrentAccount obj3=new CurrentAccount();
		
		
		obj2.Deposit();
		obj2.Withdraw();
		
		obj1=obj2;
		
		obj3.Deposit();
		obj3.Withdraw();
		
		obj2.Withdraw();
		obj3.Withdraw();
		
		obj1=obj3;
		
		System.out.println("\n");
		
		obj2.DisplayAcDetails();
		
		System.out.println("\n");
				
		obj3.DisplayAcDetails();
		

	}

}
