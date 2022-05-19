package student.Mukaddes;

public class lab17 {
    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]

    static void pushZerosToEnd(int arr[], int n){
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;

    }
        public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0};
        int n=arr.length;
        pushZerosToEnd(arr,n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }

    }

    }

