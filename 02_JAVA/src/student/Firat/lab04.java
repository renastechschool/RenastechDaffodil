package student.Firat;

public class lab04 {
    public static void main(String[] args) {
        //Write a return method that can find the unique characters from the String
        //Ex: unique("AAABBBCCCDEF") ==> "DEF";

                    //"AAABBBCCCDEF"
        System.out.println(unique("AAABBBCCCDEF"));


    }


    public static String unique(String word){
        String second = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                second +=word.charAt(i);
            }

        }


        return second;
    }








}
