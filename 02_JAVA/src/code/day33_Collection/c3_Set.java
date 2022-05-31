package code.day33_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class c3_Set {


    public static void main(String[] args) {


        //all type of sets are not going to accept dublicates

        //if you have the list of numbers that you dont want to store dublicate ones  which collection type you will use ?
        //set will be prefered

        Set<String> letters=new HashSet<>();

        //Hashset
        //accept null values
        //it doesnt accept dublicates
        //it has sort logic but it is not always from small to large

        letters.add("a");
        letters.add("a");
        letters.add("c");
        letters.add("e");
        letters.add("b");
        letters.add("d");
        letters.add("d");
        letters.add("a");
        letters.add("x");
        letters.add(null);
        letters.add(null);

        System.out.println(letters);

        Set<String> letters2=new LinkedHashSet<>();
        //linkhasset
        //it doesnt accept dublicates
        //it does not sort
        //accept null values

        letters2.add("a");
        letters2.add("a");
        letters2.add("c");
        letters2.add("e");
        letters2.add("b");
        letters2.add("d");
        letters2.add("d");
        letters2.add("a");
        letters2.add("x");
        letters2.add(null);
        letters2.add(null);

        System.out.println(letters2);

        Set<String> letters3=new TreeSet<>();
        //Treseet
        //it doesnt accept dublicate values
        //it does not accept null values
        //it is going to sort from small to large

        letters3.add("a");
        letters3.add("a");
        letters3.add("c");
        letters3.add("e");
        letters3.add("b");
        letters3.add("d");
        letters3.add("d");
        letters3.add("a");
        letters3.add("x");
//        letters3.add(null);  //NullPointerException
//        letters3.add(null);

        System.out.println(letters3);//[a, b, c, d, e, x]

    }
}

//i want to store list of numbers in one collection type
                 //that is not going to accept dublicates
                 //also it will sort (from smallest to largest)

            //treeset ; list ; hashset
                //list will accept dublicates you cant use any type of list
                //queue cant be used beacuse it accepts dublicates
                //hashset : has sort logic but not always from small to llarge
                //treeset

//accept dublicate and keep insertion order
            //queue ;  list  ; set
            //we cant use any set (set doesnt accept dublicate values)
            //list and queue accept dublicates
            // list is correct answer
            // any type of list will work
            // and you can use  dequee (not prefered )

//i want to store list of numbers in one collection type
//that is not going to accept dublicates
//it will accept one null keyword
            //sets : hashset ; linkhasset ; treeset
                //result : hashset or linkhasset
