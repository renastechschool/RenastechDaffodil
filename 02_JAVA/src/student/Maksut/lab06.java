package student.Maksut;
public class lab06 {
    public static void minNumberFromArray(int[] arr) {
        int min=arr[0];
        for (int i:arr) {if (min>i){min=i;}
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[] xp={1,2,3,-9863,9,-4,0};
        minNumberFromArray(xp);
    }
}
