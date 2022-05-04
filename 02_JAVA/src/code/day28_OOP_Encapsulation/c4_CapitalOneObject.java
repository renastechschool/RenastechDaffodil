package code.day28_OOP_Encapsulation;

public class c4_CapitalOneObject {

    public static void main(String[] args) {
        c3_BankAccountCapitalOne account1=new c3_BankAccountCapitalOne("L","A");

        System.out.println("account1.getAccountHolder() = " + account1.getAccountHolder());
        System.out.println(account1.firstName);
        //System.out.println(account1.accountHolder); we use getter method

        System.out.println("account1.getBalance() = " + account1.getBalance());
        account1.setBalance(200);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.deposit(10);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.deposit(0.1);
        account1.deposit(500);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.withdraw(300);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.avaliableBalance();

        System.out.println(account1);
        account1.setAccountNumber(342354245);
        System.out.println("account1.getAccountNumber() = " + account1.getAccountNumber());

        c3_BankAccountCapitalOne account2=new c3_BankAccountCapitalOne("G","B");
        account2.avaliableBalance();
        System.out.println(account2);

        account2.deposit(300);
        System.out.println(account2);
    }
}
