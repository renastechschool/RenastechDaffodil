package student.engin;

public class lab12 {
    //Write a method which can identifies given number is even or odd
    public static void main(String[] args) {
        System.out.println(even_odd(10));
        System.out.println("even_odd(9) = " + even_odd(9));
    }

    public static String even_odd(int x) {
        String str = "";
        if (x % 2 == 0) {
            str = x + " is an even number";
        } else {
            str = x + " is an odd number";
        }
        return str;
    }
}