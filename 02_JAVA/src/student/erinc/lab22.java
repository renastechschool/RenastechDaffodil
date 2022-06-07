package student.erinc;

public class lab22 {

    //Write a return method that can reverse negative number and return it as int

    public static void main(String[] args) {
       int num=-1234;
        System.out.println(reverseNegative(num));


    }

    public static int reverseNegative(int number){

        String str=new StringBuilder(""+number).reverse().toString();
        if (number<0){
            str="-"+str.substring(0,str.length()-1);
        }
        return Integer.valueOf(str);



    }

}
