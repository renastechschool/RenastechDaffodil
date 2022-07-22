package student.Oscar;

import java.util.Arrays;

public class lab02 {

    public static void sameLetters(String a, String b){

        char [] one = a.toCharArray();
        char [] two = b.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one, two)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        sameLetters("renastech1" , "tech1renas");
    }
}
