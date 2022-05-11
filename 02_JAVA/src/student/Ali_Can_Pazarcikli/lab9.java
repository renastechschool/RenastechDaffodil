package student.Ali_Can_Pazarcikli;

import java.util.Arrays;

public class lab9 {
    public static void main(String[] args) {

        int [] array=new int []{1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                int number=0;
                if (array[i] > array[j]){
                    number=array[i];
                    array[i]=array[j];
                    array[j]=number;
                }
            }
        }
        for (int i = 0; i <array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println("\n"+Arrays.toString(array));
    }
}
