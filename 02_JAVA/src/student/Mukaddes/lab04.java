package student.Mukaddes;

public class lab04 {
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        for (int i = 0; i < str.length(); i++) {
            int flag=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag = 1;
                    break;

                }
            }
                if(flag==0)
                    System.out.println(str.charAt(i));

            }

        }
    }

