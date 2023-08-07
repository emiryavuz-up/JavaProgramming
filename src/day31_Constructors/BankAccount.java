package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString(){
        return "Bank account\n" + "Account Holder = " + accountHolder + "\nAccount Number = " + accountNumber + "\nAccount Balance = $" + balance;
    }
    public void checkBalance(){ // created method as instance to display the message for that specific bank account // an action added to custom class
        System.out.println("Your available balance is: $" + balance);
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method if the amount is invalid
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
            return; // to exit the function
        }

        if(amount <= 0){
            System.out.println("Withdrawing amount can not be negative or zero"); // if the amount is less than zero this will be printed
            return; // exit the function if the above statement is true
        }

        balance -= amount;
    }




}
/*
			BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount

 */
