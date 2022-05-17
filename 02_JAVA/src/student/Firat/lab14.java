package student.Firat;

public class lab14 {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        System.out.println(sumania("jg2fghh3h"));
    }


    public static int sumania(String a ){
        int result=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>47 && a.charAt(i)<58){
                result+=Integer.parseInt(String.valueOf(a.charAt(i)));
            }

        }public class lab14 {
            //Write a method that can return the sum of the digits in a string
            public static void main(String[] args) {
                System.out.println(sumania("jg2fghh3h"));
            }


            public static int sumania(String a ){
                int result=0;
                for (int i = 0; i < a.length(); i++) {
                    if(a.charAt(i)>47 && a.charAt(i)<58){
                        result+=Integer.parseInt(String.valueOf(a.charAt(i)));
                    }

                }

                return result;

            }



        }

        return result;

    }



}
