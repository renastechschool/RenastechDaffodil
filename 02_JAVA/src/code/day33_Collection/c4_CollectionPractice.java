package code.day33_Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class c4_CollectionPractice {

    /*
List and Set both are interfaces. They both extends Collection interface.
The important differences between set and list are:

1.Duplicate Objects
The main difference between List and Set is that List allows duplicates while
 Set doesn't allow duplicates.

2.Order
List is an ordered collection it maintains the insertion order,
which means upon displaying the list content it will display the elements in the same order in
which they got inserted into the list.

Set is an unordered collection, it doesn’t maintain any order.
 There are few implementations of Set which maintains the order
 such as LinkedHashSet (It maintains the elements in insertion order).
 treeset will sort
 hashset will sort in hashset logic

3.Null elements
List allows any number of null elements. Set can have only a single null elements at most.
--Treseet wont allow even one null
 */

    public static void main(String[] args) {
        // 1. write a program that can remove the duplicated characters from String
        // and store them into variable

        String word = "Hellowworldlllddeeoww";
        String [] letters=word.split("");
        System.out.println(Arrays.toString(letters));

        //we can store our array in the collection
        //i will need to put in a set so i can remove all dublicates
        //insertion order matters (i dont want to sort )
        //Linkhasset
        LinkedHashSet <String > result = new LinkedHashSet<>(Arrays.asList(letters));
        //i cant use any other set because they will sort it

        System.out.println(result);

        //to put back in string
        String nonDublicate="";

        for (String each : result){
            nonDublicate += each;
        }

        System.out.println(nonDublicate);

        // 2. write a program that can identify if two strings are build out of the same letters
        //String str1="abcabccabd";  //abcd
        //        String str2="dcbaccc"; //dcba  //abcd
            //first i need to remove dublicates ; any set method
            //second make sure to sort them so you can compare

        String str1="abcabccabd";
        String str2="dcbaccc";

        String [] arr1=str1.split("");
        String [] arr2=str2.split("");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        TreeSet<String> rst1=new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> rst2=new TreeSet<>(Arrays.asList(arr2));
        //treseet will take arrays and remove dublicates and sort them from smal to large

        System.out.println("rst1 = " + rst1);
        System.out.println("rst2 = " + rst2);

        System.out.println(rst1.equals(rst2));

        String newStr1=rst1.toString();
        String newStr2=rst2.toString();

        System.out.println(newStr1.equals(newStr2));
    }
}
////Data Structure :
//    //    Array (fixed, primitives & objects)
//    //    Collection (dynamic, only objects)
//    //    Map (dynamic, only objects)
//    //
//    //Map Interface: accepts key and value. cannot be primitives.
//    //                key MUST be unique
//    //Map methods:
//    //    put(key, value): inserts key and value to map
//    //    get(key): returns the value of the given key
//    //    remove(key): removes the given key and it's value from the map
//    //    size():
//    //    containsKey(key): checks if the key is contained in the map. boolean
//    //    containsValue(Value): checks if the value is contained in the map. boolean
//    //    clear(): clears everything
//    //    isEmpty(): boolean
//    //    keySet(): returns all the keys from the map as Set
//    //    values(): returns all the values from the map as Collection
//    //    setEntry():
//
//    // HashMap: does not keep the insertion order
//    //         accepts null
//    // HashTable: is synchronized, thread-safe ==> one thread at a time
//    //             slower
//    //             does not accept null
//    // LinkedHashMap: keeps the insertion order as it's.
//    //             put & remove are faster
//    //             accepts null
//    // TreeMap: sorts the keys in ascending (sorted map)
//    //         does not accept null
// nnn
//mm