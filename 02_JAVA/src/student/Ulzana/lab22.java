package student.Ulzana;

public class lab22 {
    public static void main(String[] args) {

        reverse_Num(-983);  // Reversed  number as integer: 389
    }



    public static int reverse_Num(int number){
        if(number<=0) {number=-number;}
        String reverse ="";
        while (number != 0) {
            int remainder=number%10;
            reverse +=""+remainder;
            number=number/10;}

        int reversedNumber= Integer.parseInt(reverse);
        System.out.println("Reversed  number as integer: "+reversedNumber);
        return reversedNumber;   }
}
