package student.Murat.erinc;

public class lab06 {

    public static void main(String[] args) {
        int [] numbers={5,6,7,45,32,12};

        int min=numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if (min> numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println(min);



    }


}
