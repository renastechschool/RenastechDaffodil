package student.TaylanTonka;

public class  lab02 {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:
    public static void main(String[] args) {
        String a = "abc";
        String b = "cab";
        String c = "dab";
        System.out.println("a and b contains same letters ? = " + sameLetters(a,b));
        System.out.println("b and c contains same letters ? = " + sameLetters(b,c));
    }

    public static boolean sameLetters(String a,String b)
    {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        boolean finalResult = true;
        for(int i =0;i<first.length;i++)
        {
            boolean result = false;
            for(int z=0;z<second.length;z++)
            {
                if(first[i]==second[z])
                {

                    result=true;
                }
            }
            if (result==false)
            {
                finalResult = false;

            }
        }
        return finalResult;
    }



}
