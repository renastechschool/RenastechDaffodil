package student.erinc;

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
        System.out.println(PasswordValidation("Hello1@"));

    }

    public static boolean PasswordValidation(String password) {

        String lC = "(.*[a-z].*)";
        String uC = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String character = "(.*[ -/, :-@].*)";


        boolean containLower = password.matches(lC);
        boolean containUpper = password.matches(uC);
        boolean containDigits = password.matches(numbers);
        boolean containCharacter = password.matches(character);
        boolean valid = false;

        if (password.length() >= 6 && !password.contains(" "))

            if (containLower && containUpper && containDigits && containCharacter)
                valid = true;

        return valid;
    }
}
