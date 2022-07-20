package Buket;

public class lab06 {

    //Write a method that can find the min number from an int Array
    public static int getMinimum(int[] a){
        int temp;
        int len = a.length;
        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[len-1];
    }

    public static void main(String[] args) {

        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Minimum: "+getMinimum(a));
        System.out.println("Minimum: "+getMinimum(b));

    }
}





