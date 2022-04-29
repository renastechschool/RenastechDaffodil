package student.EgeGunege;

public class lab03 {
    public static String removeDub(String w){
        String result="";
        for (int i=0;i<w.length();i++){
            if(!(result.contains(""+w.charAt(i)))){
                result+=w.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String sample="AAABBBCCC";
        System.out.println(removeDub(sample));
    }
}
