package student.Destyar;

public class lab20 {
    //(Numbers) Swap Numbers
    //Swap two variable' values without using a third variable

    public static void swapValues(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping!");
        System.out.println("Value of x = "+x+" and Value of y = "+y);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        System.out.println("Value of x = "+x+" and Value of y = "+y);
        swapValues(x,y);
    }
}



