package student.engin;

import java.util.Arrays;

public class lab08 {
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex:
//      int[] arr = {10, 9, 8, 7};
//
//       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
public static void main(String[] args) {
    int[] arr = {10, 9, 8, 7};
    System.out.println(Arrays.toString(descanding(arr)));
}

public static int[] descanding(int[] c){
    int tem=0;
    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c.length; j++) {
            if (c[i]<c[j]) {    
                tem=c[i];    
                c[i]=c[j];   
                c[j]=tem;   
            }
        }
    }
    return c;
}

}