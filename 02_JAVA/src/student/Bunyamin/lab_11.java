package student.Bunyamin;

import java.util.ArrayList;

public class lab_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer>divisibleBy3=new ArrayList<>();
        ArrayList<Integer>divisibleBy5=new ArrayList<>();
        ArrayList<Integer>divisibleBy15=new ArrayList<>();
        for (int i=1;i<=100;i++){
            if(i%3==0){
                list.add(i);
            }else if(i%5==0){
                list.add(i);
            }else if(i%15==0){
                list.add(i);
            }
        }
        for (Integer each:list){
            if((each%3==0)&&(each%5==0)&&(each%15==0)){
                divisibleBy15.add(each);
            }else if((each%3==0)&&(each%15!=0)){
                divisibleBy3.add(each);
            }else if((each%5==0)&&(each%15!=0)){
                divisibleBy5.add(each);
            }
        }
        System.out.println("Divisible By 15 = " + divisibleBy15);
        System.out.println("Divisible By 5 = " + divisibleBy5);
        System.out.println("Divisible By 3 = " + divisibleBy3);
    }
}
