package code.day29_Inheritence_Owerrting.day33_Collection;

import java.util.*;

// DAta Structurs
//        1 Array (fixed)
//        2 Collection (Dynamic)
//        3 Map
//                  *Arraylist is coming from collection.
public class c1_List {

    //  //list is parent of arraylist linkedlist and the vector
    //    //list is an interface its not class so you cant create object from list
    //    //
    //    //        Collection (I) : extended by List(I),Set(I),Queue(I)
    ////
    ////        Lıst(I): implemented by ArrayList(C),LınkedList(C),Vector(C)
    ////
    ////        ArrayList(C): Internally uses array, singly linked
    ////                Singly linked == retrieving is faster (get)
    ////
    ////        LinkedList(C): each object are doubly linked.
    ////                Doubly linked == removing adding functions are faster
    ////
    ////        Vector(C): array based class, is synchronized  ,only prefer in multi thread
    ////              Synchronized: used for achiving thread-safety
    ////                      adv=thread safe
    ////                      disadv= slower
    ////                 thread: process of operating system scheduling object
    ////             --extended by Stack(C) : array based class ,is synchorized,last in first out order
    ////        pop(): LIFO, returns the last object from the stack and removes it from stack
    //
    //
    //    //list general points ;
    //    //1.List are allowing dublicates objects
    //    //2.order : list will keep the insertion order.
    //    //3null elements : list will allow you to use any number of null elements;
    //    //4.list has dynamic size

    public static void main(String[] args) {

//        List<Integer> numberlist  = new List<Integer>() {
//        }   you cant create object from interfaces

        List<Integer> numberList = new ArrayList<>(); // polymorphism
        System.out.println(numberList);
        numberList.add(25);
        System.out.println(numberList); //   //    //4.list has dynamic size
        numberList.add(25);

        System.out.println(numberList); ////1.List are allowing dublicates objects

        ArrayList<String> words =new ArrayList<>();
        words.add("Hello");// //2.order : list will keep the insertion order.
        words.add("Java");
        words.add("Hello");
        words.add(null);
        words.add(null);
        words.add(null);////3null elements : list will allow you to use any number of null elements;

        System.out.println(words); //


        List<Integer> list2 = new LinkedList<>();
        list2.add(20);
        list2.add(10);
        list2.add(20);
        list2.add(15);
        list2.add(15);

        System.out.println(list2);
        list2.remove(0);
        System.out.println(list2);

        List<Integer> list3=new Vector<>();
        list3.add(20);
        list3.add(20);
        list3.add(40);
        list3.add(40);

        System.out.println(list3);

        Stack<Integer> numbers = new Stack<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers);

        ////        pop(): LIFO, returns the last object from the stack and removes it from stack

        Integer num=numbers.pop();
        System.out.println("num = " + num);
        System.out.println(numbers);


    }
}


//    //list general points ;
//    //1.List are allowing dublicates objects
//    //2.order : list will keep the insertion order.
//    //3null elements : list will allow you to use any number of null elements;
//    //4.list has dynamic size