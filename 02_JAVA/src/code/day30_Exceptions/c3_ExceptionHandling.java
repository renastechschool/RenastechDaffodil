package code.day30_Exceptions;

public class c3_ExceptionHandling {

    //there is 2 way to handle exceptions so they dont stop compiler from running
    //first you can use try/catch blocks to handle
    //second you can use throws keyword to handle
    public static void main(String[] args) {

        System.out.println("Hello Hello ");
        try {
            System.out.println("waiting 5 second start");
            Thread.sleep(5000); //checked exception
            System.out.println("5 second ended");
        }catch (InterruptedException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        int number=0;

        while (number < 60){

            System.out.println(number);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                //Exception is the parent of all the exception types
                //you can use Exception to catch all types of exception
            }

            number++;

        }




        System.out.println("Done");

    }

}
