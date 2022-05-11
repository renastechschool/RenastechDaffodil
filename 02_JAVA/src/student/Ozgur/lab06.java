package student.Ozgur;

public class lab06 {
    //Write a method that can find the min number from an int Array
    public static void main(String[] args) {
        int [] n2={2,6,7,1,99,33};
        min(n2);
    }

 public static void min(int[] n2){

        int minnumber=n2[0];

     for (int i = 0; i < n2.length; i++) {

         if(n2[i]<minnumber){

             minnumber=n2[i];
         }
     }
     System.out.println(minnumber);

 }

}

