package student.gule;

//Lab 06 //(Array) Find Minimum
//Write a method that can find the maximum number from an int Array

import java.util.ArrayList;

public class lab06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(17);
        list.add(-78);
        list.add(45);
        list.add(-121);
        System.out.println("Min : " + min(list));

    }
    public static int min(ArrayList<Integer>list){
        int min = list.get(0);
        for(int i =0; i<list.size();i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        return min;
    }
}
