package student.Aslihan;

public class lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static String duplicated(String x){
        String unique="";
        for (int i=0 ; i<x.length() ; i++){
            int count=0;
            for (int k=i ; k<x.length(); k++){
                if (x.charAt(i)==x.charAt(k)){
                    count++;}}
            if(count==1){
                unique+=x.charAt(i);}}
        return unique;
    }
    public static void main(String[] args) {
        System.out.println(duplicated("AAABBBCCC"));
    }
}
