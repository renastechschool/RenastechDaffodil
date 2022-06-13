package student.gule;
//Lab 05 -  //(Array) Find Maximum
//Write a method that can find the maximum number from an int Array

import java.util.ArrayList;

public class lab05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(45);
        list.add(-78);
        list.add(121);
        list.add(160);
        System.out.println("Max : " + max(list));
    }
    public static int max(ArrayList<Integer>list){
        int max = list.get(0);
        for(int i =0; i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
}
