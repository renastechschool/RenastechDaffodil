package student.suleyman;

public class lab14 {

    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {


        String word="Sule74y9manY21i63ldiz";

        char [] ch=word.toCharArray();

        int sum=0;

        for (int i = 0; i <ch.length ; i++) {
            if (Character.isDigit(ch[i])){
                System.out.println("Digits of the String " + ch[i]);


                int a=Integer.parseInt(String.valueOf(ch[i]));

                sum=sum + a;
            }
        }

        System.out.println("Sum of Digits is " + sum);
    }
}
