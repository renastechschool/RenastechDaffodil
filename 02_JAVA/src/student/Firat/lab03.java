package student.Firat;

public class lab03 {
    public static void main(String[] args) {
        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        String name = "AAABBBCCC";
        System.out.println(removeDup(name));

    }

    public static String removeDup(String name) {
        String result = "";

        for (int i = 0; i < name.length(); i++) {

            if(!(result.contains("" +name.charAt(i)))){
                result +=name.charAt(i);

            }


        }
        return result;
    }



}