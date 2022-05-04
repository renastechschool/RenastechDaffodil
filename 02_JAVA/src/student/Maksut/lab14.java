package student.Maksut;
public class lab14 { //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        String abc="14593fsdgdfs15dsg234";
        System.out.println(sum(abc));
    }
    public static int sum(String str) {
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>48&&str.charAt(i)<58){
                sum+=(str.charAt(i)-48);
            }
        }
        return sum;
    }
}