package student.Ozgur;

public class lab22 {
  //  Write a return method that can reverse negative number and return it as int
//Write a return method that can reverse negative number and return it as int
  public static void main(String[] args) {
      int a=-123;
      System.out.println("reverseNegative(a) = " + reverseNegative(a));
  }
    public static int reverseNegative(int a){//-100    -001`
        int reverse=0;
        while(a!=0){
            int reminder=a%10;
            reverse=reverse*10+reminder;
            a/=10;

        }
        return reverse;
    }

}
