package student.gulsumB;
//Write a method that can return the sum of the digits in a string
public class lab14 {
    public static void main(String[] args)
    {
        String str = "1865dg75dgg";
        System.out.println(Sum(str));
    }
    static int Sum(String str)
    {
        String temp = "0";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

}

