package student.sezar;

import java.util.ArrayList;

public class lab16 {
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
    public static void main(String[] args) {
        System.out.println("verifyPassword(\"Kanada1994Renas07!\") = " + verifyPassword("Kanada1994Renas07!"));
    }

    public static boolean verifyPassword(String a)
    {
        ArrayList<Boolean> arr = new ArrayList<Boolean>();
        boolean atLeast6 = false;
        boolean oneUpper =false;
        boolean oneLower = false;
        boolean oneSpecial =false;
        boolean digit = false;
        if(a.length()>=6)
        {
            System.out.println("a.length() = " + a.length());
            atLeast6=true;
        }
        for( int i=0;i<a.length();i++)
        {
            int ascii = (int) a.charAt(i);
            if(ascii<=90 && ascii>=65)
            {
                System.out.println(a.charAt(i) +" is UpperCase " + String.valueOf(a.charAt(i)));
                oneUpper = true;
            }
            else if(ascii>=97 && ascii<=122)
            {
                System.out.println(a.charAt(i) +" is LowerCase " + String.valueOf(a.charAt(i)));
                oneLower=true;
            }
            else if(ascii<=57 && ascii>=48)
            {
                System.out.println(a.charAt(i) +" is Digit " + String.valueOf(a.charAt(i)));
                digit=true;

            }
            else
            {
                System.out.println(a.charAt(i) +" is special " + String.valueOf(a.charAt(i)));
                oneSpecial=true;
            }

        }

        arr.add(atLeast6);
        arr.add(oneLower);
        arr.add(oneUpper);
        arr.add(oneSpecial);
        arr.add(digit);
        if(arr.contains(false))
        {
            return false;
        }
        else {
            return true;
        }
    }
}
