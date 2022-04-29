package student.Inci;

public class lab02 {

    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static void main(String[] args) {

        String letters1 = "abcd";
        String letters2 = "cab";
        boolean a = true;

        for (int i = 0; i < letters1.length(); i++) {
            int count = 0;
            for (int j = 0; j < letters2.length(); j++) {

                if (letters1.charAt(i) == letters2.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                a = false;

            }
        }
        if (a==false) {


            System.out.println("Not all the letters1 are in letters2  " +a);
        }else{
            System.out.println("All the letters are the same " +a);
        }

    }
}



