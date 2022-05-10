package student.Ali_Can_Pazarcikli;

public class lab14 {
    public static void main(String[] args) {

        System.out.println(sumOfDigits("abcd6712jklm3"));


    }
    static String sumOfDigits(String str){
        int result=0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)>=47 && str.charAt(i)<=58){
                result +=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return "Sum is:"+result;
    }
}
