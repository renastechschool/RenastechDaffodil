package student.Bunyamin;

public class lab_05 {//Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] arr = {1,2,64,-123213,6};
        int min = findMax(arr);
        System.out.println("min = " + min);

    }
    public static int findMax(int[] arr)
    {
        int min = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
