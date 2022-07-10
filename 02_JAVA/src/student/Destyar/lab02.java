package student.Destyar;

public class lab02 {
    //(String) Same Letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "cab";
        int count = 0;

        char[] result1 = s1.toCharArray();
        char[] result2 = s2.toCharArray();

        for (int i = 0; i < s1.length(); i++)
        {
            for (int j = 0; j < s2.length(); j++)
            {
                if (result1[i] == result2[j])
                {
                    count++;
                    break;
                }
            }
        }
        if (count == s1.length())
            System.out.println("True");
        else
            System.out.println("False");
        }

    }

