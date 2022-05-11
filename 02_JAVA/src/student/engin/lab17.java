package student.engin;

import java.util.ArrayList;
import java.util.Arrays;

public class lab17 {
    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {
        int[] x={0,0,3,5,0,3};
        move_0_to_back(x);
    }

    public static void move_0_to_back(int[] arr){
        int length=1;
        int tem=0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i]==0 && arr.length-length!=0 ){
                 tem=arr[arr.length-length];  
                 arr[arr.length-length]=arr[i];  
                 arr[i]= tem;  
                }
             if(arr[i]==0 && arr.length-length==0 && arr.length-length-1!=0 && length < arr.length ){
                 tem=arr[arr.length-length-1];  //5
                 arr[arr.length-length-1]=arr[i];  //0
                 arr[i]= tem;  //5
                    
                }
                length++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
