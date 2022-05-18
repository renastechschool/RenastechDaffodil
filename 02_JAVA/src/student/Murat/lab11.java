package Murat;

import java.util.ArrayList;

public class lab11 {

    public static void main(String[] args) {
        div_3_5_15();
    }

    public static void div_3_5_15(){
        ArrayList<Integer> divisibleBy_15=new ArrayList<>();
        ArrayList<Integer> divisibleBy_3=new ArrayList<>();
        ArrayList<Integer> divisibleBy_5=new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            if (i%15==0){
                divisibleBy_15.add(i);
            }
            else if (i%3==0){
                divisibleBy_3.add(i);
            }
            else if (i%5==0){
                divisibleBy_5.add(i);
            }
        }
        System.out.println("divisibleBy_15 = " + divisibleBy_15);
        System.out.println("divisibleBy_3 = " + divisibleBy_3);
        System.out.println("divisibleBy_5 = " + divisibleBy_5);
    }


}
