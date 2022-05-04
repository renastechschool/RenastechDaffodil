package student.Maksut;
public class lab04 {
    public static String uniqueCharFromStr(String str) {
       StringBuilder result= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){count++;}
            }
            if(count==1){
                result.append(str.charAt(i));}
        }
       return result.toString();
    }
    public static void main(String[] args) {
        String awq="AAABBBCCCDEF";
        System.out.println(uniqueCharFromStr(awq));
    }
}
