package student.Mukaddes;

import java.util.Arrays;

public class lab05 {
//Write a method that can find the maximum number from an int Array
public static void main(String[] args) {
    int [] number={5,9,-1,-6,-5};
    Arrays.sort(number);
    System.out.println("max: "+number[number.length-1]);
}
}
