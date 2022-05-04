package student.Maksut;
import java.util.Scanner;
public class lab01 {
//*****************************************************************************************
        public static StringBuilder reverseString(){
        Scanner myObj=new Scanner(System.in);
        StringBuilder reverseGiven= new StringBuilder();
        System.out.println("Enter a string to reverse write to that string: ");
        String given=myObj.nextLine();
        reverseGiven.append(given);
        reverseGiven.reverse();
        System.out.println(reverseGiven);
        return reverseGiven;}
//*****************************************************************************************
        public static void main(String[] args) {
        reverseString();
    }
}
