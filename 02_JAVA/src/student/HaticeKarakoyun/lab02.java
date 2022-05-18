package student.HaticeKarakoyun;

public class lab02 {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";
        String str3 = "abb";

        System.out.println("str1 and str2 has same letters = " + sameLetters(str1,str2));
        System.out.println("str2 and str3 has same letters = " + sameLetters(str2,str3));

    }

    public static boolean sameLetters(String str1,String str2) {
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        boolean finalResult = true;

        for(int i =0; i<first.length; i++) {
            boolean result = false;

            for(int j=0; j<second.length; j++) {
                if(first[i]==second[j])
                {

                    result=true;
                }
            }
            if (result==false) {
                finalResult = false;

            }
        }
        return finalResult;
    }

}
