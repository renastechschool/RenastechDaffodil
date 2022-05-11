package student.engin;

public class lab02 {
 //Write a return method that check if a string is build out of the same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false


    public static void main(String[] args) {
        String str="abc";
        String str2="bcad";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i)==str2.charAt(j) ) {
                    count++;
                }
            }
            
        }
        if (count==1) {
            System.out.println("contains same letters");
            
        } else System.out.println("NOT contains same letters");
    
    }
    
    
}
