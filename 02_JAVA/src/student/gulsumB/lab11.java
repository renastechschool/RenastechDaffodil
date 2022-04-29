package student.gulsumB;

public class lab11 {
    //Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    //if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
    //if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
    //if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
    //ex:
    //OutPut:
    //Divisible By 15 15 30 45 60 75 90
    //Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    //Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
    public static void main(String[] args) {
    String divisibleby15="";
    String divisibleby3="";
    String divsibleby5="";

    int i=1; //this my starting point
    while(i<=100){
        i++;
        if(i%3==0 && i%5==0 && i%15==0){
            divisibleby15 += " "+i;
        }else if(i%3==0 && i%15!=0){
            divisibleby3 += " "+i;
        }else if(i%5==0 && i%15!=0){
            divsibleby5 += " "+i;
        }
    } System.out.println("divisibleby 15 ="+divisibleby15);
        System.out.println("divisibleby 3 ="+divisibleby3);
        System.out.println("divisibleby 5 ="+divsibleby5);

}}


