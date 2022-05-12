package student.sezar.Ulzana;

public class lab14 {

    public static void main(String[] args) {


        System.out.println(sumOfNumInString("2022- RenasTech"));

    }

//Write a method that can return the sum of the digits in a string

    public static int sumOfNumInString(String word){

        int result=0;
        for(int i = 0; i< word.length(); i++){

            if(word.charAt(i)>47 && word.charAt(i)<58){
             result+=Integer.parseInt(String.valueOf(word.charAt(i)));}}

        return result;    }






// More ways to solve it
//    public static void sumOfNumInString(String word, int secondExample ){
//
//        int firstWayResult=0;
//        int secondWayResult=0;
//        char [] eachLetter=word.toCharArray();
//
//        for(int i = 0; i< word.length(); i++){
//
//            if(eachLetter[i]>47 && eachLetter[i] <58){
//                firstWayResult+=Integer.parseInt(""+ eachLetter[i]); }
//
//            if(eachLetter[i]>47 && eachLetter[i] <58){
//                secondWayResult+=Integer.valueOf(""+ eachLetter[i]); }}
//
//
//        System.out.println(firstWayResult);
//        System.out.println(secondWayResult);
//        }


}
