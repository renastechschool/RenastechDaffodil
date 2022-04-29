package student.suleyman;

public class lab03 {

    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC


    public static void main(String[] args) {

        System.out.println(dublicates("AAABBCCDFEGHS"));


    }
    public static String dublicates(String word){

        String result="";


        for (int i = 0; i <word.length() ; i++) {
            if ( ! ( result.contains("" + word.charAt(i)) )) {
                result += word.charAt(i);}}
        return result;

    }

}
