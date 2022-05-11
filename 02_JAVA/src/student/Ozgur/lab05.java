package student.Ozgur;

public class lab05 {
    public static void main(String[] args) {
        //Write a method that can find the maximum number from an int Array
        int [] n={3,9,12,45,23};
    max(n);
    }

    public static void max(int[] n){


int max=n[0];
        for (int i = 0; i < n.length; i++) {

            if(n[i]>max)
               max=n[i];


        }
        System.out.println(max);
    }


}
