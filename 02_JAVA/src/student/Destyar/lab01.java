package student.Destyar;

public class lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        String word ="ABCD";
        char[] result= word.toCharArray();
        for (int i = word.length()-1; i >=0 ; i--){
            System.out.print(result[i]);
        }



    }

}
