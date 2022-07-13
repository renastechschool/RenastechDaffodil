package student.Murat.erinc;

public class lab11 {

    public static void main(String[] args) {

        String divisible15="";
        String divisible5="";
        String divisible3="";

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5==0 && i%15==0){
                divisible15+=i+" , ";
            }else if (i%5==0 && i%15!=0){
                divisible5+=i+" , ";
            }else if (i%3==0 && i%15!=0){
                divisible3+=i+" , ";
            }else{

            }

        }
        System.out.println("divisible15 = " + divisible15);
        System.out.println("divisible5 = " + divisible5);
        System.out.println("divisible3 = " + divisible3);


    }
}
