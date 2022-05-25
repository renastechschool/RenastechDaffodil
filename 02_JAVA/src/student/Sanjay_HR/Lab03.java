package student.Sanjay_HR;

public class Lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {
        removeDuplicate("AAABBBCCC");
    }
    public static String removeDuplicate(String str){
        String result="";
        System.out.println("String = "+str);
        int i=0;
        while(i<str.length()){
            if(!(result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
            }
            i++;
        }
        System.out.println("After duplicated characters removed = "+result);
        return result;
    }
}
