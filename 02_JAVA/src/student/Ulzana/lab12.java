package student.sezar.Ulzana;

public class lab12 {

    public static void main(String[] args) {

        System.out.println(numberODDorEven(0));
        System.out.println(numberODDorEven(33));
        System.out.println(numberODDorEven(36));
    }

    //Write a method which can identifies given number is even or odd

    public static String numberODDorEven(int number){

            String result="";
        if (number%2 == 0) {  result= number + " is EVEN number";}
           else { result= number + " is ODD number";;}

        return result;  }
}
