package student.Mukaddes;

import java.util.Arrays;

public class lab07 {

    //Write a return method that can concate two arrays
    public static void main(String[] args){
        int [] x={1,2,3};
        int[] y={4,5,6};
        ConcateArray(x,y);
    }
    public static int[] ConcateArray(int[] first, int[] second){
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










