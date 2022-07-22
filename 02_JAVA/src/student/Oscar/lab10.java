package student.Oscar;

public class lab10 {
    public static void main(String[] args) {
        multiples(30);
    }

    static void multiples(int n){
        for (int i = 0; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FINRA");
            }else if (i%5==0){
                System.out.println("RA");
            } else if (i%3==0){
                System.out.println("FIN");
            } else
                System.out.println(i);
        }

    }
}
