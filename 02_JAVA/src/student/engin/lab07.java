package student.engin;

import java.util.Arrays;

public class lab07 {
//Write a return method that can concate two arrays
public static void main(String[] args) {
    int[] a={1,2,3};
    int[] b={4,5,6};
    System.out.println(Arrays.toString(concate2arr(a, b)));
    
}

public static int[] concate2arr(int[] arr1, int[] arr2){
    int[] arr3=new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
        arr3[i]=arr1[i];
        }
    for (int i = 0; i < arr2.length; i++) {
        arr3[arr1.length+i]=arr2[i];
    }
    return arr3;   
}

}
