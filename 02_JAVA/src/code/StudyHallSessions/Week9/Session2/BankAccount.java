package code.StudyHallSessions.Week9.Session2;

public class BankAccount {

//    practice task:
//    create a custom class for bank account
//    attrubutes: accountHolder(String), accountNumber(long), balance(double)
//    actions: totalBalance(), withDraw( amount ), deposit( amount )
//    toString()
//    create a class called bankAccountObject to call BankAccount methods,variables.
//    Ex : if i deposit 50 dollars my balance should increase 50 dollars
//  : if i withdraw 100 dollars my balance should decrease for 100 dollars
//  : to check the balance use totalBalance method

    String accountHolder;
    Long accountNumber;
    Double balance;
    Double totalBalance(){
        return balance;
    }
    void withDraw(Double withdrawalAmount){
        this.balance=balance;
        balance=balance-withdrawalAmount;
        System.out.println("Withdrawal amount is "+withdrawalAmount+"New Balance is "+balance);
    }
    void deposit(Double deposit){
        this.balance=balance;
        balance=balance+deposit;
        System.out.println("Withdrawal amount is "+deposit+"New Balance is "+balance);
    }
    public String toString(){
        return "Full Name is "+accountHolder+"The Account balance is "+ totalBalance();
    }

}
