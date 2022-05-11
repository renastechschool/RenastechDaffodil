package student.sezar;

public class lab3 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {
        String sample = "AAABBBCCC";
        String result =  removeDup(sample);
        System.out.println("result = " + result);
    }
    public static String removeDup(String a)
    {
        String result = "";
        for(int i =0;i<a.length();i++)
        {
            if(!(result.contains(""+a.charAt(i))))
            {
                result+=""+a.charAt(i);
            }
        }
        return result;
    }
}
