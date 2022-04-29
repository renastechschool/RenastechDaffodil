package student.Yousef;



import java.util.Arrays;

public class lab1 {
    public static void main(String[] args) {

        //Write a return method that can reverse  String
        // Ex: Reverse("ABCD"); ==> DCBA

        String name = "ABCD";
        String reversName="";
        String [] splitName = name.split("");
        System.out.println(Arrays.toString(splitName));

        for (int i = splitName.length-1; i >= 0 ; i--) {

            reversName+=splitName[i] + " ";


        }
        System.out.println("reversName = " + reversName);






    }


}