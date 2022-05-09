package student.engin;

public class lab03 {
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC
public static void main(String[] args) {
    String str="AAABBBCCC";
    removeDublicates(str);
    
}
    

public static void removeDublicates(String a) {
    int count=0;
    for (int i = 0; i < a.length(); i++) {
        count=0;
        for (int j = i; j < a.length(); j++) {
            if (a.charAt(i)==a.charAt(j)) {
                count++;
            }
        }
        if (count==1) {
            System.out.print(a.charAt(i));
        }
        
    }

    
}

    
}
