package student.Ali_Can_Pazarcikli;

import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String value:");
        String str=scan.nextLine();
        System.out.println("Enter a particular character:");
        char character=scan.nextLine().charAt(0);
        int count=0;

        for (int i = 0; i <str.length(); i++) {
            if (character == str.charAt(i)){
                count ++;
            }
        }
        System.out.println("Frequency of the given character is: "+count);

    }
}
