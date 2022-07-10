package student.Murat.erinc;

public class lab05 {

    public static void main(String[] args) {

        //Write a method that can find the maximum number from an int Array

        int [] numbers={5,6,7,45,32,12};

        int max=numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if (max< numbers[i]){
                max=numbers[i];
            }

        }
        System.out.println(max);





    }



}
