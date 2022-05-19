package student.Gulistan;
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false
public class lab16 {
    private static boolean checkPassword(String input){

        if (input.length() >= 6
                && !input.contains(" ")
                && input.matches(".*[A-Z].*")
                && input.matches(".*[a-z].*")
                && input.matches(".*[!@#&()–[{}]:;',?/*~$^+=<>].*")
                && input.matches(".*[0-9].*"))
            return  true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("Aa!623"));
        System.out.println(checkPassword("Aa!can"));//should at least contain a digit
        System.out.println(checkPassword("Aa! 623"));// should not contain space
        System.out.println(checkPassword("Aa623"));//Password MUST be at least have 6 characters
        System.out.println(checkPassword("aa!623"));//should at least contain one upper case letter
        System.out.println(checkPassword("AA!623"));//should at least contain one lower case letter
    }
}