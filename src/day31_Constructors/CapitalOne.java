package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Harry Potter", 123456789, 0);
        System.out.println(account1);

        account1.deposit(100);

        account1.checkBalance();

        account1.withdraw(50);

        account1.checkBalance();

        account1.deposit(200);

        account1.checkBalance();

        System.out.println("-------------");

        BankAccount account2 = new BankAccount();

        account2.setInfo("Smyrna", 30123, 0);

        account2.deposit(1000);

        account2.checkBalance();


    }

}
