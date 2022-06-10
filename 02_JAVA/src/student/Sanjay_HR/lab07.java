package student.Sanjay_HR;

import java.util.Arrays;

public class lab07 {
    //Write a return method that can concate two arrays
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,3};
        concatedArray(a,b);
    }
    public static int[] concatedArray(int[] first,int[] second){
        int firstLength=first.length;
        int secondLength=second.length;
        int newLength=firstLength+secondLength;
        int [] both=new int[firstLength+secondLength];
        for (int i = 0; i < newLength; i++) {
            if(i<firstLength){
                both[i]=first[i];
            }else{
                both[i]=second[i-firstLength];
            }
        }
        System.out.println(Arrays.toString(both));
        return both;
    }
}
