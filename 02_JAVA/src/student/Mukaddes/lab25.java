package student.Mukaddes;

public class lab25 {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method
    public static void main(String[] args) {

        Integer[] numbers={90, 40, 70, 80, 20, 10};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                    int temp = numbers[i];
                    int tempj=numbers[j];
                    if(temp>tempj){
                        numbers[i]=tempj;
                        numbers[j]=temp;
                    }
            }
        }
        for (int a:numbers) {

            System.out.print(" "+a);
        }
    }
}
