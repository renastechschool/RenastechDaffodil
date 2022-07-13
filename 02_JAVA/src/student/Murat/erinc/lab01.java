package student.Murat.erinc;

import java.util.Scanner;

public class lab01 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a name : ");
        String name=input.nextLine();

        String reversedName="";

        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName+=name.charAt(i);

        }
        System.out.println("reversedName = " + reversedName);


    }
}
