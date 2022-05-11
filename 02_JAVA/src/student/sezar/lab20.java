package student.sezar;

public class lab20 {
    // Swap two variable' values without using a third variable
    public static void main(String[] args) {
        int x=20;
        int y=30;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println( "x= "+ x+"y= "+y);

    }
}
