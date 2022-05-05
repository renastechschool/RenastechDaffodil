package student.Maksut;
public class lab05 {
    public static void maxNumberFromArray(int[] arr) {
        int max=arr[0];
        for (int i:arr) {if (max<i){max=i;}
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] xp={1,2,3,9,-4,0};
        maxNumberFromArray(xp);
    }
}
