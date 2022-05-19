package student.Gulistan;
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
// print "FIN" instead of the number and for numbers which are a multiple of 5,
// print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
// print "FINRA" instead of the number.
public class lab10 {

    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers()
    {
        for(int i=3;i<=30;i+=3)
        {
            if(i%3==0&&i%5 ==0)
                System.out.println(i+"RA");
            else if(i%5==0)
                System.out.println(i+"FIN");
            else
                System.out.println(i+"FINRA");


        }
    }
}
