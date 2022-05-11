package student.sezar;

public class lab14 {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args)
    {
        System.out.println("returnSum(\"T6a2y1lan1994\") = " + returnSum("T6a2y1lan1994"));
    }
    public static int returnSum(String a)     {
        int sum =0;
        for(int i =0;i<a.length();i++) {
            int ascii = (int) a.charAt(i);

            if (ascii <= 57 && ascii >= 48) {
                sum +=
                        Integer.parseInt(a.charAt(i) + "");
            }
        }
                return sum;     }}

