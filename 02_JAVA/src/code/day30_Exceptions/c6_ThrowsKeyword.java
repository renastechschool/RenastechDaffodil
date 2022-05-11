package code.day30_Exceptions;

public class c6_ThrowsKeyword {

    //there is 2 way to handle exceptions so they dont stop compiler from running
    //first you can use try/catch blocks to handle
    //second you can use throws keyword to handle

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");
        //throws keyword will be assigned to your method signuature
        Thread.sleep(2000);
        System.out.println("Wait for 2");

        Thread.sleep(3000);
        System.out.println("3 extra second");
    }

}
