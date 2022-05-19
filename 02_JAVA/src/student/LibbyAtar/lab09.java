package student.LibbyAtar;

import java.util.Arrays;

public class lab09 {

    public static void main(String[] args) {
        //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10,20,7, 8, 90};
        //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(descend(arr)));
        System.out.println("Yay");
    }

    public static int[]descend(int[]descend){

       int num=0;
        for (int i = 0; i <descend.length ; i++) {

            for (int j = 0; j < descend.length; j++) {

                if (descend[i] > descend[j]) {
                    num=descend[i];
                    descend[i]=descend[j];
                    descend[j]=num;


                }}}


        return descend;


}}
