package student.Oscar;

public class lab11 {
    public static void main(String[] args) {
        divisibleBy(100);
    }

    static void divisibleBy(int n){
        for (int i=0; i<=n; i++ ){
            if (i%3==0 && i%5==0 && i%15==0){
                System.out.println(i+" Divisible by 15");
            } else if (i%3==0 && i%15!=0){
                System.out.println(i+" Divisible by 3");
            } else if (i%5==0 && i%15!=0){
                System.out.println(i+" Divisible by 5");
            }
        }

    }
}
