package Buket;


public class lab05 {
      //(Array) Find Maximum
    //Write a method that can find the maximum number from an int Array
      //Lab 05- (Array) Find Maximum
//Write a method that can find the maximum number from an int Array
      public static void main(String[] args) {

      }

    public static int getMaximum(int[] a) {
        int temp;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[len - 1];
    }


    {

        int a[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Maximum: " + getMaximum(a));
        System.out.println("Maximum: " + getMaximum(b));

    }
}







