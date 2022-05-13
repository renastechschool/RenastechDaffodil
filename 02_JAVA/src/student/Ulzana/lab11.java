package student.Ulzana;

public class lab11 {

    public static void main(String[] args) {

        divisible(1,100);
    }

    public static void divisible(int startingNumber , int endingNumber){
        String divisibleBy15= "";
        String divisibleBy5= "";
        String divisibleBy3= "";

        for (int i = startingNumber; i <= endingNumber; i++) {

            if (i%3==0 && i%5 ==0 || i%15 == 0)   { divisibleBy15 += i + " "; }
            if (i%3==0 && i%15 !=0)  {  divisibleBy3 += i + " "; }
            if (i%5==0 && i%15 !=0)  {  divisibleBy5 += i + " "; }  }


        System.out.println("Divisible by 15 : "+divisibleBy15);
        System.out.println("Divisible by 3 : "+divisibleBy3);
        System.out.println("Divisible by 5 : " + divisibleBy5);  }

}
