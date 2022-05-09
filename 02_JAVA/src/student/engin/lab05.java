package student.engin;

public class lab05 {
//Write a method that can find the maximum number from an int Array
public static void main(String[] args) {
        
int[] arr1={5,4,6,7,10,9,6,4};
max(arr1);

    }

    public static void max (int [] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    

}
