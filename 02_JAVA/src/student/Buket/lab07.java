package Buket;

public class lab07 {
    //Write a return method that can concate two arrays
    public static int[] concatArrays(int[] a, int[] b) {

        int aLen = a.length;
        int bLen = b.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {6, 7, 8, 9};

        int[] ab = concatArrays(a,b);

        for( int i = 0; i< ab.length; i++){
            System.out.print( ab[i]+ " ");
        }

    }

}

