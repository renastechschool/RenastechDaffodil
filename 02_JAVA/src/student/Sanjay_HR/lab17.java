package student.Sanjay_HR;

import java.util.Arrays;

public class lab17 {
    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {
        int[] numbers={1,0,2,0,3,0,4,0};
        zerosToLastIndexes(numbers);
    }
    public static int[] zerosToLastIndexes(int[] arr){
        int[] num=new int[arr.length];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                num[index++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(num));
        return num;
    }
}
