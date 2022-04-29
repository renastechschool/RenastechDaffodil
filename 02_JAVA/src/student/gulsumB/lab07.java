package student.gulsumB;
//(Array) Concat two arrays
//Write a return method that can concate two arrays
public class lab07 {
    public static void main(String[] args) {

        System.out.println(concatTwoString("Gulsum","Bulgan"));
    }
    public static String concatTwoString(String first, String second) {
        return first.concat(" " + second);
    }

}

