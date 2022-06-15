package student.engin;

public class lab22 {
    // Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {

        int a=-12345;

        System.out.println("reverse(a) = " + reverse(a));

    }
        public static int reverse(int number){
            String reverse = "";
            String num = String.valueOf(number);
            String total =""; // -543;
            String first = num.charAt(0) + ""; // === - ;
            for (int i = num.length()-1;  i > 0; i--){
                reverse += num.charAt(i);
            }
            total = first + reverse;
            int b = Integer.parseInt(total);
            return b;
    }

}
