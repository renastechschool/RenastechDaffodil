package student.Mukaddes;

public class lab01 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String word="ABCD";
        String x="";
        char ch;
        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {
            ch=word.charAt(i);
            x+=ch;
        }
        System.out.println("reversed word "+ x);
        String str="ABCD";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String str1=sb.toString();
        System.out.println("original word: "+str);
        System.out.println("reversed : "+str1);


    }
}



