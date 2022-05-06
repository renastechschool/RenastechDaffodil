package student.Firat;

import java.util.Arrays;

public class lab15 {
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"

    public static void main(String[] args) {
       String alphanumeric =  "DC501GCCCA098911";
       char [] splitted = alphanumeric.toCharArray();
        System.out.println(Arrays.toString(splitted));
        String [] one = new String[splitted.length];
        int index = 0;

        for (char each: splitted) {

          do {
              if (each>57){
                  one[index] =each + "";
                  index++;
              }
          }while(each>47&&each<57);
            System.out.println(each);


            do {
                if (each>47&&each<57){
                    one[index] =each + "";
                    index++;
                }
            }while(each>57);
            System.out.println(each);



        }
        System.out.println(Arrays.toString(one));





















    }





    }
