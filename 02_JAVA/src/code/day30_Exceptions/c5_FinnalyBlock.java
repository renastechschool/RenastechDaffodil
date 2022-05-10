package code.day30_Exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class c5_FinnalyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(10/0); // uncheked excp .  arithmetic exception

        }catch (NoSuchElementException e){
            System.out.println("No such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" array excep");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Arithmetic exc");
        }catch (RuntimeException e){
            System.out.println("runtime");

        }catch (Exception e){
            System.out.println("exception ");
        }finally {
            System.out.println("finally block");
        }

        //how finally blocks works
        //finally block will get executed no matter where try catch will catch execption.
    }
}
