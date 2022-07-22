package student.Bunyamin;

public class lab_03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {
        removeDuplicates("AAABBBCCC");
    }
    public static String removeDuplicates(String str){

        String result="";

        System.out.println("Before removing= "+str);
        int i=0;
        while(i<str.length()){
            if((!result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
                System.out.println(result);
            }
            i++;
        }
        System.out.println("After removing duplicates = "+result);
        return result;
    }
}
