package student.TaylanTonka;

public class lab12 {
    //Write a method which can identifies given number is even or odd
    public static void main(String[] args) {
        System.out.println("isEven(2) = " + isEven(2));
        System.out.println("isEven(3) = " + isEven(3));
    }

    public static boolean isEven(int a)
    {

        if(a %2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
