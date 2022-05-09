package code.StudyHallSessions.Week10.Session3;

public class OverLoadingAndOverRiding {


    public static void sum(int i1, int i2){
        System.out.println(i1 +" + "+i2+ " = "+(i1+i2));

    }

    public static void sum(int i1, int i2, int i3){

        System.out.println(i1+ " + "+i2+" + "+ i3+" = "+(i1+i2+i3));

    }

    public static void sum(int i1, int i2, int i3 ,int i4){

        System.out.println(i1+ " + "+i2+" + "+ i3+ " + "+i4 +" = "+(i1+i2+i3+i4));

    }


}
