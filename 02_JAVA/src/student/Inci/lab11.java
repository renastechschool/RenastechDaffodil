package student.Inci;

public class lab11 {

    //Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    //if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
    //if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
    //if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

    public static void main(String[] args) {

        String d3 = " ";
        String d5 = " ";
        String d15 = " ";
        int i = 1;

        while (i<= 100) {
            i++;
            if (i % 15 == 0 && i % 5 == 0 && i % 3 == 0) {
                d15 += i+",";
            }if (i % 3 == 0 && i % 15 != 0) {
                d3 += i+"," ;
            }if (i % 5 == 0 && i % 15 != 0) {
                d5 += i+",";

            }

        }
        System.out.println("\n\tDivisibleBy15  :" + d15 + "\n\tDivisibleBy5  :" + d5 + "\n\tDivisibleBy3  :" + d3);


    }


}


