package student.gule;

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
        System.out.println("verifyPassword(\"Toronto2121*\") = " + verifyPassword("Toronto2121*"));
    }

    public static boolean verifyPassword(String a)
    {

        // boolean sample = true && true && true && false;

        boolean atLeast6 = false; //completed
        boolean containSpace = false;
        boolean oneUpper = false;
        boolean oneLower = false;
        boolean oneSpecial = false;
        boolean digit=false;



        for(int i=0;i<a.length();i++)
        {

            int ascii = a.charAt(i);
            if(ascii<=90 && ascii>=65)
            {
                oneUpper = true;

            }
            else if(ascii>=97 && ascii<=122)
            {
                oneLower = true;
            }

            else if(ascii<=57 && ascii>=48)
            {
                digit = true;
            }
            else if(ascii == 32)
            {
                containSpace =true;
            }

            else
            {
                oneSpecial = true;
            }

        }
        if(a.length()>=6)
        {
            atLeast6=true;

        }

        return atLeast6 && oneUpper && oneLower && oneSpecial && digit;
    }

}

