package student.Mukaddes;

import java.util.Scanner;

public class lab20 {
    //Swap two variable' values without using a third variable
    public static void main(String[] args) {

        System.out.println("enter the values");
        Scanner number=new Scanner(System.in);
        int x=number.nextInt();
        int y=number.nextInt();
        System.out.println("before swap: "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swap: "+x+" "+y);


    }
}
