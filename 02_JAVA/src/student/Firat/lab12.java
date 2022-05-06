package student.Firat;

public class lab12 {


        public static void main(String[] args) {
            System.out.println(givenNumber(55));
        }


        public static String givenNumber(int a){
            String result;
            if ( a%2==0){
                result="even";
            } else{
                result="odd";
            }
            return result;
        }

    }
