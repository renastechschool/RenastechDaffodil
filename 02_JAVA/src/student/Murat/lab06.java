package Murat;

public class lab06 {
    public static void main(String[] args) {
        int[] list={20,300,-500,400,99,-600};
        minNumber(list);
    }
    public static void minNumber(int [] list){
        int min=list[0];
        for (int i=0 ; i<list.length ; i++){
            if (list[i]<min){
                min=list[i];}}
        System.out.println("min = " + min);
    }
}