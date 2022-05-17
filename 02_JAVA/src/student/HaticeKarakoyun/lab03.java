package student.HaticeKarakoyun;

public class lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {

        String word = "AAABBBCCC";
        String result = removeDup(word);

        System.out.println("Word is = " + word);
        System.out.println("Result word = " + result);
    }

    public static String removeDup(String word){

        String result = "";
        for(int i =0; i<word.length();i++) {

            if(!(result.contains(""+ word.charAt(i)))) {
                result+=""+ word.charAt(i);
            }
        }

        return result;
    }
}
