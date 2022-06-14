package student.engin;

public class lab21 {
   //  Write a method that can divide two numbers without using division operator
   public static void main(String[] args) {

       int a=21;
       int b=5;
       int count=0;

       while (a>b){
           a-=b;
           count++;
       }
       System.out.println("division is "+count + " and remainder is "+ a);
   }
}
