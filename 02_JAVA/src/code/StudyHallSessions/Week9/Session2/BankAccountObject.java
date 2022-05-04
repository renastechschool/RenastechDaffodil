package code.StudyHallSessions.Week9.Session2;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        System.out.println(bankAccount.accountNumber);
        bankAccount.accountHolder="Ozgur";
        System.out.println(bankAccount.accountHolder);
        System.out.println(bankAccount.balance+"Balance before setting up");
        bankAccount.balance=1000.00;
        bankAccount.withDraw(200.00);
        System.out.println(bankAccount.totalBalance());

        bankAccount.deposit(2000.00);
        bankAccount.withDraw(300.00);
        System.out.println(bankAccount.totalBalance());

        System.out.println(bankAccount);
    }
}
