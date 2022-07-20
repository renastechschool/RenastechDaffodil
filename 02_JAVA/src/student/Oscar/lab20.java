package student.Oscar;

public class lab20 {


    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println("Before swapping " +a + " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping " + a + " "+b);
    }
}
