package student.Sanjay_HR;

public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static void main(String[] args) {
        String letters="AABBBAACCCCB";
        frequencyOfCharacters(letters);
    }
    public static String frequencyOfCharacters(String str){
        int count=0,flag=0;
        int len=str.length();
        for(int i=0;i<len;++i) {
            count=0;
            for(int j=0;j<len;++j)
                if(str.charAt(j)==str.charAt(i))
                    count++;
            for(int k=0;k<i;++k)
                if(str.charAt(k)==str.charAt(i))
                    flag=1;
            if(flag!=1)
                System.out.println(str.charAt(i)+": "+count);
            flag=0;
        }return str;
    }
}
