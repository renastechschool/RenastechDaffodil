package code.StudyHallSessions.Week11.Session3;

public class CheckingAccount extends BankAccount{
    // Overridig is a Run Time Polymorphism,
    //The Function Call is in order of the execution.
    @Override
    public String Deposit(int DAmount) {
        return super.Deposit(DAmount) + " " + "From SubClass";
    }

    @Override
    public String WithDraw(int WAmount) {
        return super.WithDraw(WAmount);
    }
    public void Checking(){
        System.out.print("It's own Checking Balance: " +Balance);
    }

    public static void main(String[] args) {
        CheckingAccount Check = new CheckingAccount();

        String DA = Check.Deposit(100);
        System.out.println(DA);
        String WA = Check.WithDraw(50);
        System.out.println(WA);
        String WAA = Check.WithDraw(10, "Test For Overloadion");
        System.out.println(WAA);
        Check.Checking();

    }
}
