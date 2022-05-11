package student.Ali_Can_Pazarcikli;

public class lab12 {
    public static void main(String[] args) {
        EvenOddNumbers(3);
        EvenOddNumbers(4);

    }
    public static void EvenOddNumbers(int a){
        if(a %2 ==0){
            System.out.println(a+" is an even number.");
        }else{
            System.out.println(a+" is an odd number.");
        }
    }
}
