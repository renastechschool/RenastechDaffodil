package student.engin;

import java.util.ArrayList;
import java.util.Arrays;

public class lab26 {
    //  Write a method that can sort the ArrayList in descending order without using the sort method
    public static void main(String[] args) {
        ArrayList<Integer> arrlIST1 = new ArrayList<>();
        arrlIST1.addAll(Arrays.asList(1, 200, 3, 5,7, 400, 5, 600));

        System.out.println("sortDecending(arrlIST1) = " + sortDescending(arrlIST1));
    }

    public static ArrayList<Integer> sortDescending(ArrayList<Integer> arr1) {
        int[] arr=new int[arr1.size()];

        for (int i = 0; i < arr1.size(); i++) {
            arr[i]=arr1.get(i);
        }

        ArrayList<Integer> result= new ArrayList<>();
        int max=0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i]>arr[j]){
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;}
            }
        }
        for (int k:arr){
            result.add(k);
        }
        return result;
    }

}
