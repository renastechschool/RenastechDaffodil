package student.Sanjay_HR;

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
        System.out.println(passwordCheck("Helloworld123"));
        System.out.println(passwordCheck("HelloWorld123!"));
    }
    public static boolean passwordCheck(String password){
        boolean b1=false, b2=false, b3=false, b4=false; int i=0;
        if(password.length()>=6 && !password.contains(" ")){
            while(i<password.length()) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 95) {
                    b1 = true;
                }
                if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    b2 = true;
                }
                if ((password.charAt(i) >= 33 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64) ||
                        (password.charAt(i) >= 91 && password.charAt(i) <= 96) || (password.charAt(i) >= 123 && password.charAt(i) <= 126)) {
                    b3 = true;
                }
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    b4 = true;
                }
                i++;
            }
            }else{
            return false;
        }
        return b1&&b2&&b3&&b4;
    }
}
