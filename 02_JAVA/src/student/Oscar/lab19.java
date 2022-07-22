package student.Oscar;

public class lab19 {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int d = 10;

        System.out.print(a+" "+b);
        for (int i=2; i<d; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
    }

