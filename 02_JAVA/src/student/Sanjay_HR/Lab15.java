package student.Sanjay_HR;
import java.util.Arrays;
public class lab15 {
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"
    public static void main(String[] args) {
        password("DC501GCCCA098911GHTP");  //out: CD015ACCCG011899
    }
    public static void password(String str) {
        String output = ""; //create output to store sorted string
        int stringLen=str.length();// length of input string

        for (int i = 0; i < str.length(); i++) {
            output += str.charAt(i); //goes through and store string into an output
            if (Character.isLetter(str.charAt(i)) && i < str.length() - 1) { //(i-1)- starts from previous then goes moves to (i+1)
                if (Character.isDigit(str.charAt(i + 1))) {
                    output += "-"; //add dot when a letter or digit found in string
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isLetter(str.charAt(i + 1))) {
                    output += "-"; //does same as line 19. checks again cause found digit and stops.
                }
            }
        }
        String[] arr = output.split("-"); //sort string where it see "-"
        //System.out.println(str); //sorted input string
        //str=""; //clearing output.
        //String outputString=""; //created new string for output (1st method of clearing str (not used) )

        for (int i=0; i<arr.length; i++){
            //System.out.println(arr[i]); //code check --good till here
            char [] chars= arr[i].toCharArray(); //place elements in array so original arrangement is kept
            Arrays.sort(chars); //sort every element
            //System.out.println("arrays output after sorted: "+Arrays.toString(chars));
            for (int j = 0; j <chars.length ; j++) {
                str+= chars[j]; // would show input+output
                //System.out.println("str = " + str);
            }
        }
        System.out.println(str.substring(stringLen)); //return output.
        //System.out.println("sorted output: "+outputString);
    }
}
