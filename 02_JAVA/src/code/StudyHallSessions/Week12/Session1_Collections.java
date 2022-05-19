package code.StudyHallSessions.Week12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Session1_Collections {
    public static void main(String[] args) {

        //Collections:
       // Collections are containers that groups multiple items in a single unit;
        //and they provide some methods

        //List, Set , Queue
        //List--> List is an interface that extends the Collection and
        // contains ordered collection of element, including duplicated values

        //Arraylist, LinkedList,Vector

        ArrayList<String> sdets=new ArrayList<>();

        sdets.add("AA");
        sdets.add("bb");

        System.out.println(sdets); //[AA, bb]
        //sdets.add(90);
       // sdets.add(true);

        ArrayList objects=new ArrayList();

        objects.add(23);
        objects.add("YY");
        objects.add(true);

        System.out.println(objects);//[23, YY, true]

        car tesla=new car();

        objects.add(tesla);
        System.out.println(objects);

        ArrayList<Integer> numbers=new ArrayList<>();

        for (int i = 10; i > 0; i--) {
            numbers.add(i);

        }

        System.out.println(numbers); //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]


        numbers.add(10);
        System.out.println(numbers); //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10]

        System.out.println("-----------------------");

        //Set = A set referse to a collection that can not contain duplicate elements

        HashSet<Integer> set=new HashSet<>();

        for (int i = 10; i >0 ; i--) {
            set.add(i);

        }

        System.out.println(set);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        set.add(10);

        System.out.println(set); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        set.add(null);
        System.out.println(set);
        set.add(null);
        System.out.println(set);


        System.out.println("___________________");

        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for (int i = 10; i >0 ; i--) {
            queue.add(i);

        }

        System.out.println(queue);//[1, 2, 5, 4, 3, 9, 6, 10, 7, 8]




    }
}

class car{

}
