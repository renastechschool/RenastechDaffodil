package student.EgeGunege;

public class lab12 {
    public static void evenOdd(int i){
        String result=(i%2==0)?i+" is Even Number":i+" is Odd Number";
        System.out.println(result);
    }

    public static void main(String[] args) {
        evenOdd(2);
        evenOdd(3);
    }
}
