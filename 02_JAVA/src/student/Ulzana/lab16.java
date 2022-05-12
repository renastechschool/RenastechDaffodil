package student.sezar.Ulzana;

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

        System.out.println( validPassword("Apple13"));      //false
        System.out.println( validPassword("1appLe13$"));    //TRUE
        System.out.println( validPassword("apple"));        //false
        System.out.println( validPassword("APPLE"));        //false
        System.out.println( validPassword("Apple "));       //false
        System.out.println( validPassword("APPLE13"));      //false
        System.out.println( validPassword("A!PpLE13"));     //TRUE
        System.out.println( validPassword("apple13"));      //false
        System.out.println( validPassword("APPLE13$"));     //false
        System.out.println( validPassword("apple13$"));     //false
        System.out.println( validPassword("applE13$"));     //TRUE
    }

    public static boolean validPassword ( String password) {

        boolean b1 = password.length() >= 6 && !password.contains(" ");
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;

          for (int i = 0; i < password.length(); i++) {

            if (password.charAt(i) >= 65 && password.charAt(i) <= 90)  { b2 = true; }

            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) { b3 = true; }

            if ( ( password.charAt(i)>=33 &&  password.charAt(i)<=47) || ( password.charAt(i)>=58 &&   password.charAt(i)<=64)
                && ( password.charAt(i)>=91 &&   password.charAt(i)<=96) ||  ( password.charAt(i)>=123 &&   password.charAt(i)<=126)){
                b4=true;}

            if ( password.charAt(i)>=48 &&  password.charAt(i)<=57){ b5=true; }  }

        boolean result = b1 && b2 && b3 && b4 && b5;
         return result;   }


}


