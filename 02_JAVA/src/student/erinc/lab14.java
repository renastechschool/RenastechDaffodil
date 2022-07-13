package student.erinc;

public class lab14 {

    public static void main(String[] args) {

        sumOfDigits("hell5 wo3rld4 r367");

    }



    public static void sumOfDigits(String str){

        int result=0;

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)>=48 && str.charAt(i)<=57){
                result+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }

        }
        System.out.println(result);




    }
}
