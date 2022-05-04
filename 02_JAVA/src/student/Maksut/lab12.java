package student.Maksut;
public class lab12 {//Write a method which can identifies given number is even or odd
    public static void oddEven(int num) {
        if (num%2==0){
            System.out.println(num+" is an even number.");
        }
        else {System.out.println(num+" is an odd number.");}
    }
    public static void main(String[] args) {
        int givenNumber= 1008; int givenNumber2= 73;
        oddEven(givenNumber);
        oddEven(givenNumber2);
    }
}
