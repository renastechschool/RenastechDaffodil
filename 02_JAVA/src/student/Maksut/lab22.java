package student.Maksut;
public class lab22 {
    /*
    (Number) Reverse Negative Number
            Write a return method that can reverse negative number and return it as int
     */
    public static void main(String[] args) {
        int int1= -1597;
        System.out.println(reverseNegative(int1));
    }

    static int reverseNegative(int a) {
        int result;
        String aStr=""+a;
        StringBuilder aStr2= new StringBuilder();
        if (a<0){
        for (int i = aStr.length()-1; i >0; i--) {
           aStr2.append(aStr.charAt(i));}
        }
        result=-1*Integer.parseInt(aStr2.toString());

        return  result;
    }
}
