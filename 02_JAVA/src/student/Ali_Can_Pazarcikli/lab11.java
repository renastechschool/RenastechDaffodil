package student.Ali_Can_Pazarcikli;

public class lab11 {
    public static void main(String[] args) {
        String DivisibleBy15 = "";
        String DivisibleBy3 = "";
        String DivisibleBy5 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                DivisibleBy15 +=" " + i;
            } else if (i % 3 == 0 && i % 15 != 00) {
                DivisibleBy3 += " " + i;
            } else if (i % 5 == 0 && i % 15 != 0) {
                DivisibleBy5 += " " + i;
            } else {
            }
            i++;
        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
    }
}