package student.Ulzana;

public class lab21 {
    public static void main(String[] args) {

        divisionWithoutOperator(3456,99); //  3456 / 99 =  34.90
    }



    public static void divisionWithoutOperator(int number1, int number2){

        if (number2==0) {System.out.println("Invalid Number");}
        else{
            System.out.print(number1 +" / "+number2 +" =  ");
            int count =0;
            while(number1 >= number2) { //  150>=9     141>=9
                number1 -= number2;     // 141=150-9   132=141-9
                count++;    }           // 1            2
       System.out.print(count+"."+number1);   }     }

}