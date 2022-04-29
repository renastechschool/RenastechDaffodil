package student.suleyman;

public class lab07 {

    //Write a return method that can concate two arrays

    public static void main(String[] args) {

        int [] array1={10,20,3,0,40,50,60,70};
        int [] array2={90,74,65,25,41,01,36,95};

        int length=array1.length +array2.length;

        System.out.println("First Array is: ");
        for (int i = 0; i <array1.length ; i++) {

            System.out.println(" " + array1[i]);

        }
        System.out.println(" ");
    }
}
