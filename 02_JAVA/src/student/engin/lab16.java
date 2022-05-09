package student.engin;

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
        String abc="Abc12#";
        System.out.println("isPasswordOK(abc) = " + isPasswordOK(abc));

    }

    public static boolean isPasswordOK (String str){
        boolean passwordIsOk=false;
        int upperCase=0;
        int lowerCase=0;
        int digit=0;
        int specialCharacter=0;

        if (str.length()>5){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                upperCase++;
            }
            if (str.charAt(i)>=97 && str.charAt(i)<=122){
                lowerCase++;
            }
            if (str.charAt(i)>=48 && str.charAt(i)<=57){
                digit++;
            }
            if (str.charAt(i)>=33 && str.charAt(i)<=47){
                specialCharacter++;
            }
        }
        }
        if (upperCase>0 && lowerCase>0 && digit>0 && specialCharacter>0){
            passwordIsOk=true;
        }
        return passwordIsOk;
    }
}
