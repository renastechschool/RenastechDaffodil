package student.erinc;

import java.util.Arrays;

public class lab17 {

    public static void main(String[] args) {


        int[] list1={1,0,2,0,3,0,4,0};
        int[] store=new int[list1.length];


        int temp=0;

        for (int i = 0; i < list1.length ; i++) {

            if (list1[i]!=0){
                store[temp]=list1[i];
                temp++;
            }

        }
        System.out.println(Arrays.toString(store));











    }
}
