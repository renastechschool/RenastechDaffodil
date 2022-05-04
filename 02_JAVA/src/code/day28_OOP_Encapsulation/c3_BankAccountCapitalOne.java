package code.day28_OOP_Encapsulation;

public class c3_BankAccountCapitalOne {

    //create custom class called BankAccountCapitalOne for CapitalOne bank accounts:
    //names , account info ,, balance

    //			public variables:  bankName, firstName, lastName
    //	 		private variables: accountHolder, accountNumber, balance
    //	 		encapsulate all the private data
    //	 		create a constructor that can initialize firstName and fullName
    //
    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance

    //    //			public variables:  bankName, firstName, lastName
    public static String bankName="Capital One"; // static public
    public String firstName; // instance public
    public String lastName; // instance public

    //	 		private variables: accountHolder, accountNumber, balance
    private String accountHolder;
    private long accountNumber;
    private double balance;

    //	 		create a constructor that can initialize firstName and fullName
    //constructor  : access modifier + class name
    public c3_BankAccountCapitalOne(String firstName , String lastName){
        this.firstName =firstName;
        this.lastName = lastName;
        //first + last = Acccountholder
        this.accountHolder = firstName + " " + lastName ;

    }


    //    //	 		encapsulate all the private data
//    public void setAccountHolder(String accountHolder){
//        this.accountHolder =accountHolder;
//    } since we define this in constructor no need to define again.

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }


    //action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance

    //if i deposit money to my account my balabce should be increased

    public void deposit(double money){//balance + money
        setBalance(balance+money);
    }

    public void withdraw(double money){
        setBalance(balance - money);
    }

    public void avaliableBalance(){
        System.out.println("Avaliable Balance is  :  " + getBalance());
    }


    // toString: returns the full name and balance
    // to strint will help us to define what object means for the class
    public String toString(){
        return  " Full name is " + getAccountHolder() + " --- Balance is : " + getBalance() ;
    }

}
