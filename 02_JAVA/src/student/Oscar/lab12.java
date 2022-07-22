package student.Oscar;

public class lab12 {
    public static void main(String[] args) {
        evenOdd(23);
    }

    static void evenOdd(int n){
        if (n%2==0){
            System.out.println(n+ " This number is even");
        } else
            System.out.println(n+ " This number is odd");
    }
}
