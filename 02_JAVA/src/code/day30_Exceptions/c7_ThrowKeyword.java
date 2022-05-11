package code.day30_Exceptions;

import java.util.NoSuchElementException;

public class c7_ThrowKeyword {

    public static void main(String[] args) {
        //throw vs throws
        //throw will throw exception to your code
        //throws will handle exceptions

        NoSuchElementException obj=new NoSuchElementException();
        //throw obj;

        try {
            throw new ArithmeticException();

        }catch (Exception e){

        }
    }
}
