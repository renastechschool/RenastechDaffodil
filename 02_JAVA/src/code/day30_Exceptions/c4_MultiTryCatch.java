package code.day30_Exceptions;

import java.util.NoSuchElementException;

public class c4_MultiTryCatch {

    public static void main(String[] args) {

        try {
            System.out.println(10/0); // uncheked excp .  arithmetic exception

        }catch (NoSuchElementException e){
            System.out.println("No such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" array excep");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exc");
        }catch (RuntimeException e){
            System.out.println("runtime");

        }catch (Exception e){
            System.out.println("exception ");
        }

        //to be able to catch exception you need use same level exception or parents of exceptions
        //for ex : handling arithmetic exceptions will be handled with arithmetic,runtime,exceptions

        //in multi catch as soon as block catch it wont check other catch blocks
    }
}
