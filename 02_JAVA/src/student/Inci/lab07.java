package student.Inci;

public class lab07 {
    //Write a return method that can concate two arrays

    public static void main(String[] args) {
      String str1="gulsen";
      String str2="inci";
        System.out.println(concate(str1,str2));

    }

    public static String concate(String str1, String str2){
        String x="";
       x= str1.concat(str2);
        return x;

    }


}


