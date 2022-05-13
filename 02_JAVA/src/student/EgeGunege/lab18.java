package student.EgeGunege;

public class lab18 {
    public static void factorial(int i){
        int fact=1;
        for (int j = 1; j <= i; j++) {
            fact*=j;
        }
        System.out.println("Factorial of "+i+"="+fact);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
