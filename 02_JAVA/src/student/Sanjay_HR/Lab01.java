package student.Sanjay_HR;

public class Lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        reverseString("ABCD");
    }
    public static String reverseString(String str){
        System.out.println("String: "+str);
        String reversedStr=""; int i=str.length()-1;
//        for (int j = str.length()-1; j >=0 ; j--) {
//            reversedStr+=str.charAt(i);
//        }
        while(i>=0){
            reversedStr+=str.charAt(i);
            i--;
        }System.out.println("reversedStr: "+reversedStr);
        return reversedStr;
    }
}
