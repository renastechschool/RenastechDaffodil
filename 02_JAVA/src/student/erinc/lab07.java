package student.erinc;

import java.util.Arrays;

public class lab07 {

    //Write a return method that can concate two arrays
    public static void main(String[] args) {

        String[] arr1={"Hello","world"};
        String[] arr2={"what","is","that"};
        concat(arr1,arr2);


    }

    public static void concat(String[] arr1,String [] arr2){

        String[] arr3=new String[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length ; i++) {
            arr3[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];

        }
        System.out.println(Arrays.toString(arr3));






    }
}
