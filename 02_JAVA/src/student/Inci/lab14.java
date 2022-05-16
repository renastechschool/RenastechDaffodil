package student.Inci;

public class lab14 {

    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {
      //  String a="Gulsen 123, Inci 2305";
        System.out.println(sumofDigits("Gulsen 123, Inci 2305"));

    }
    public static int sumofDigits(String a){
        int sum=0;

        for (int i = 0; i < a.length(); i++) {

            int ascii = a.charAt(i);
            if (ascii <= 57 && ascii >= 48) {

                sum += Integer.parseInt(a.charAt(i)+"");
            }
        }

        return sum;

        }

    }



