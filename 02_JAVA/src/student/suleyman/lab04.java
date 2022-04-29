package student.suleyman;



public class lab04 {

    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {

        System.out.println(FindUnique("AAABBBCCCDEF"));

    }


    public static String FindUnique(String word){

        String result="";
        for (int i = 0; i <word.length() ; i++) {
            int count=0;
            for (int j = 0; j <word.length() ; j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                result+=word.charAt(i);
            }
        }
        return result;
    }
}
