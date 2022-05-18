package student.Firat;
//## Lab 22 - (Number) Reverse Negative Number
//        Write a return method that can reverse negative number and return it as int
public class lab22 {
    public static void main(String[] args) {
       int a = 10;
        System.out.println(negative(a));
    }

    public static int negative(int a){
        if(a>0){
            a = a * -1;
        }
        return a;
    }


}
