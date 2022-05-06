package student.Firat;

public class lab16 {
    //(String) Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
    public static void main(String[] args) {
        System.out.println(Password("Firat62@"));
        System.out.println(Password("Besiktas62."));
        System.out.println(Password("Besiktas12"));
        System.out.println(Password("besiktas62,"));
        System.out.println(Password("Besiktas62."));

    }
    public static boolean Password(String key) {
        boolean b1 = key.length() >= 6 && !key.contains(" ");
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;


        for (int i = 0; i < key.length(); i++) {


            if (key.charAt(i) >= 65 && key.charAt(i) <= 90) {
                b2 =true;}
                if (key.charAt(i) >= 97 && key.charAt(i) <= 122) {
                    b3=true;}
                    if ((key.charAt(i) >= 33 && key.charAt(i) <= 47) || (key.charAt(i) >= 58 && key.charAt(i) <= 64) ||
                            (key.charAt(i) >= 91 && key.charAt(i) <= 96) || (key.charAt(i) >= 123 && key.charAt(i) <= 126)) {
                        b4=true;}
                        if (key.charAt(i) >= 48 && key.charAt(i) <= 57) {
                            b5 =true;}
                        }

        boolean result = b1 && b2 && b3 && b4 && b5;
        return result;
    }
}
