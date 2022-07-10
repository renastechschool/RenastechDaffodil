package student.Murat.erinc;

public class lab03 {

    public static void main(String[] args) {

        removeDup("AAABBBCCC");
    }
    public static void removeDup(String str){

        String result="";

        for (int i = 0; i < str.length() ; i++) {

            if (!(result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
            }

        }
        System.out.println(result);



    }



}
