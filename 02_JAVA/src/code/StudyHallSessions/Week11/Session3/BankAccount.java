package code.StudyHallSessions.Week11.Session3;

public class BankAccount {
    // Overloading in other word a Compile Time Polymorphism,
    // The compiler decide which method to run during the code execution
    int Balance = 0;

    public String Deposit(int DAmount){
        Balance = Balance + DAmount;
        return "Current Balance: " + Integer.toString(Balance);
    }

    public String WithDraw(int WAmount){
        if(Balance>=WAmount){
            Balance = Balance - WAmount;
            return "Current Balance: " + Balance;
        }
        else {
            return "Insufficient Request";
        }

    }
    public String WithDraw(int WAmount, String Note){
        if(Balance>=WAmount){
            Balance = Balance - WAmount;
            return "Current Balance: " + Integer.toString(Balance) + " "+Note;
        }
        else {
            return "Insufficient Request";
        }
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        String An = bank.Deposit(100);
        System.out.println(An);
        String WA= bank.WithDraw(50);
        System.out.println(WA);
        String Wa = bank.WithDraw(10,"Overloading ");
        System.out.println(Wa);

    }
}
