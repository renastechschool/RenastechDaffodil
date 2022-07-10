package student.Destyar;

public class lab04 {
    //(String) Find the unique
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";

        public static void findUniqueChar (String str){
            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    // checking if two characters are equal
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count = 1;
                        break;
                    }
                }
                if (count == 0)
                    System.out.print(str.charAt(i));
            }
        }
        public static void main (String[]args){

            String s = "AAABBBCCCDEF";
            findUniqueChar(s);
        }
    }



