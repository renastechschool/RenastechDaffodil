package student.EgeGunege;

import java.util.ArrayList;

public class lab13 {
    public static void frequency(String s){
        int[] f = new int[s.length()];
        char[] c1=s.toCharArray();
        for (int l=0;l<c1.length;l++){
            f[l]=1;
            for (int j=l+1;j<c1.length;j++){
                if(c1[l]== c1[j]){
                    f[l]++;
                    c1[j]='0';
                }
            }
        }
        for (int k=0;k<f.length;k++){
            if ((c1[k]!=' ')&&(c1[k]!='0')) {
                System.out.println(c1[k]+" is "+f[k]+" times.");
            }
        }
    }

    public static void main(String[] args) {
        String test="jack be nimble jack be quick jack jump over the candlestick ";
        frequency(test);
    }
}
