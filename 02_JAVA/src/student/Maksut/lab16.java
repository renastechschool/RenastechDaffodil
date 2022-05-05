package student.Maksut;
import java.util.ArrayList;
public class lab16 {//1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
    public static void main(String[] args) {
        String password1 = "fasdfsdAü!19";
        String password2 = "fasdfsdAü!";
        String password3 = "fasdfsdA";
        String password4 = "ABCDEFG";
        String password5 = "asdfghr";
        String password6 = "asd";
        String password7 = "Ab!456";
        System.out.println(passwordValidity(password1));
        System.out.println(passwordValidity(password2));
        System.out.println(passwordValidity(password3));
        System.out.println(passwordValidity(password4));
        System.out.println(passwordValidity(password5));
        System.out.println(passwordValidity(password6));
        System.out.println(passwordValidity(password7));
    }

    public static boolean passwordValidity(String password) {
        boolean res1=false,res2 = false,res3 = false,res4 = false,res5 = false;
        boolean finalResult = false;

        if (password.length() > 5) {
            res1=true;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    res2=true;
                }
                if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    res3=true;
                }
                if ((password.charAt(i) >= 1 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64) || (password.charAt(i) >= 91 && password.charAt(i) <= 96) || (password.charAt(i) >= 123 && password.charAt(i) <= 255)) {
                    res4=true;
                }
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    res5=true;
                }
            }
        }
        if ((res1 && res2 && res3 && res4 && res5)){finalResult=true;}
        return finalResult;
    }
}


