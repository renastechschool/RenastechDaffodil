package student.Gulistan;
//Write a method that can return the sum of the digits in a string
public class lab14 {

    public static int sumSum(String input){
    char[] myChar = input.toCharArray();
    int result = 0;

        for (int i = 0; i < input.length(); i++)
        {
            if ( myChar[i]>=48 && myChar[i]<=57)
            result += Integer.parseInt(String.valueOf(myChar[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumSum("12xp34a5678w9"));
    }
}