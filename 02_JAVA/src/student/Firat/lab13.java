package student.Firat;

public class lab13 {
    public static void main(String[] args) {
        System.out.println(rept("Toronto"));
    }

    public static String rept(String a){
        String result="";
        a=a.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int j = 0; j < a.length(); j++) {

                if (a.charAt(i) == a.charAt(j)) {

                    count++;


                }



            }
            result+= "" + a.charAt(i)+"-" + count+"," ;


        }

        return result;

    }
}
