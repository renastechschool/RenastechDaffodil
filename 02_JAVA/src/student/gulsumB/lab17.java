package student.gulsumB;

import java.util.Arrays;

//Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//Ex:
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]
public class lab17 {
    public static void main(String[] args) {
        int[] num={1,0,2,0,3,0,4,0};
        int[] input=new int[num.length];
        int temp=0;
        for (int i = 0; i < num.length ; i++) {
            if (num[i]!=0){
               input[temp]=num[i];
                temp++;}
        }
        System.out.println(Arrays.toString(input));

    }
}
