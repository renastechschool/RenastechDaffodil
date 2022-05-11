package student.Ozgur;

public class lab12 {
    //Write a method which can identifies given number is even or odd

    public static void main(String[] args) {
        System.out.println(givenNumber(0));
    }


    public static String givenNumber(int a){
        String result;
        if ( a%2==0){
      result="even";
        } else{
            result="odd";
        }
return result;
    }

}