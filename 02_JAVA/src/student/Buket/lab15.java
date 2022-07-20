package Buket;

public class lab15 {
    //## Lab 15 - //(String) Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"

        public static void sortAlphaNumericString() {
            String s = "DC501GCCCA098911";
            int a = 0;
            int i;
            int j = 0;

            for (i = j; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    if (Character.isAlphabetic(s.charAt(i + 1))) {
                        break;
                    }

                    a++;
                }
            }
            System.out.println(s.substring(j, a));
        }

        public static void main(String[] args) {
            sortAlphaNumericString();
        }

    }


