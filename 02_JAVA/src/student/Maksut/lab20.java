package student.Maksut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab20 {
//    Swap two variable' values without using a third variable

    public static void main(String[] args) {
        int a=2;
        int b=3;
        swapWithMath(a,b);
//        swapWithCollection(a,b);
    }

    public static void swapWithMath(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void swapWithCollection(int a,int b) {
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(a,b));
        Collections.swap(arrayList,0,1);
        System.out.println("a = " + arrayList.get(0));
        System.out.println("b = " + arrayList.get(1));
    }
}
