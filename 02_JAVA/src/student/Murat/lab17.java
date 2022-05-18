package student.Murat;

import java.util.ArrayList;
import java.util.Arrays;

public class lab17 {

    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0,
    public static void main(String[] args) {

        int [] numbers={10,05,0,6,74,0,65,0,0,4,13,84};
        System.out.println(Arrays.toString(moveTwo(numbers)));
    }

    public static int [] moveTwo( int [] number){

        ArrayList<Integer>list= new ArrayList<>();
        int count=0;

        for (int each: number){
            list.add(each);
            count+=(each==0)?1:0;
        }

        list.removeAll(Arrays.asList(0));
        number=new int[number.length];
        for (int i = 0; i <number.length-count ; i++) {
            number[i]=list.get(i);
        }
        return number;
    }
}