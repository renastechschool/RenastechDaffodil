package code.day34_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class c1_Map {

    //Data Structure :
    //    Array (fixed, primitives & objects)
    //    Collection (dynamic, only objects)
    //    Map (dynamic, only objects)
    //
    //Map Interface: accepts key and value. cannot be primitives.
    //                key MUST be unique
    //Map methods:
    //    put(key, value): inserts key and value to map
    //    get(key): returns the value of the given key
    //    remove(key): removes the given key and it's value from the map
    //    size():
    //    containsKey(key): checks if the key is contained in the map. boolean
    //    containsValue(Value): checks if the value is contained in the map. boolean
    //    clear(): clears everything
    //    isEmpty(): boolean
    //    keySet(): returns all the keys from the map as Set
    //    values(): returns all the values from the map as Collection
    //    setEntry():

    // HashMap: does not keep the insertion order
    //         accepts null
    // HashTable: is synchronized, thread-safe ==> one thread at a time
    //             slower
    //             does not accept null
    // LinkedHashMap: keeps the insertion order as it's.
    //             put & remove are faster
    //             accepts null
    // TreeMap: sorts the keys in ascending (sorted map)
    //         does not accept null

    public static void main(String[] args) {
        Map<String,Integer> studentInfo=new LinkedHashMap<>();
        //key :will be String that we will use for student names
        //key has to be unique

        //value : will be Integer and we will use for student numbers
        //only accepts object types

        //    put(key, value): inserts key and value to map
        studentInfo.put("ACP",20);
        studentInfo.put("MBA",47);

        System.out.println(studentInfo);

        System.out.println("studentInfo.size() = " + studentInfo.size());

        //    get(key): returns the value of the given key
        System.out.println("studentInfo.get(\"ACP\") = " + studentInfo.get("ACP"));

        //    remove(key): removes the given key and it's value from the map
        studentInfo.remove("MBA");
        System.out.println(studentInfo);

        studentInfo.put("SY",21);
        studentInfo.put("I" ,21);
        studentInfo.put("SY",45);
        studentInfo.put("GB",45);

        System.out.println(studentInfo);

        //if you want to use map you will need to have 2 parameters
        //first one will be key and has to be unique
        //second one will be value and this can be dublicate

        //LinkedHashMap<String , double> list =  //map only accepts objects not primitives
        LinkedHashMap<String , Double> studentsAges = new LinkedHashMap<>();

        studentsAges.put("LA",31.2);
        studentsAges.put("TMT",27.0);
        studentsAges.put("MBA",32.3);
        studentsAges.put("OU",30.99);


        System.out.println(studentsAges);
        System.out.println("studentsAges.get(\"OU\") = " + studentsAges.get("OU"));
        System.out.println("studentsAges.get(27.0) = " + studentsAges.get(27.0)); // null we dont have 27.0 as a ke

        //get method will only accept key
        //and if key is present in your map you will see the value of the key
        //if key is not present in your map result will be null


        //    containsKey(key): checks if the key is contained in the map. boolean
        //    containsValue(Value): checks if the value is contained in the map. boolean

        Boolean b1 = studentsAges.containsKey("LA");//true
        boolean b2 = studentsAges.containsKey("L"); //false
        boolean b3 = studentsAges.containsKey("la"); //false
        boolean b4 = studentsAges.containsValue("LA"); //false
        boolean b5 = studentsAges.containsValue(30.99); //true
        boolean b6 = studentsAges.containsValue(30.9); //false

        System.out.println(b1 + " / " + b2 + " / " + b3 + " / " + b4 + " / " + b5 + " / " + b6);

        //    clear(): clears everything
        //    isEmpty(): boolean

        System.out.println(studentsAges);
        studentsAges.clear();
        System.out.println(studentsAges);
        System.out.println("studentsAges.isEmpty() = " + studentsAges.isEmpty());


    }
}
