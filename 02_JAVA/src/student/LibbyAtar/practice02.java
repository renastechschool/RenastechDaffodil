package student.LibbyAtar;

public class practice02 {
    public static void main(String[] args) {
        //    Write a program that checks if a string is build-out of the same letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:

        String[] str ={"abc","cab"};
        String []str2={"abc","abb"};


        System.out.println("Does Str equals to Str2 ?"  + str.toString().equalsIgnoreCase(str2.toString()));

    }

}
