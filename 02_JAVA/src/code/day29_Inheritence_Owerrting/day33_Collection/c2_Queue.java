package code.day29_Inheritence_Owerrting.day33_Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class c2_Queue {

    //  //        Queue<String> q=new Queue<String>();  Quee is interface
    //    //   Queue(I):
    //    does not have index number ,
    //    size dynamic ,
    //    it accepts duplicates,
    //    first in first out order.
    //    Pool() Poll(): removes the first object in the queue.
    public static void main(String[] args) {

        Queue<Integer> numbers=new PriorityQueue<>();
        //FIFO
        //It will sort in quee logic
        //it is not always going to sort from small to large
        //it has own sort logic

        numbers.add(20);
        numbers.add(20);
        numbers.add(12);
        numbers.add(2);
        numbers.add(1);
        numbers.add(11);
        numbers.add(200);
        numbers.add(15);
        numbers.add(3);

        System.out.println(numbers);//[1, 2, 11, 3, 12, 20, 200, 20, 15]

        //    Pool() Poll(): removes the first object in the queue.
        Integer num=numbers.poll();
        System.out.println("num = " + num);

        System.out.println(numbers);

        Queue <Integer> numbers2 =new ArrayDeque<>(); //FIFO // no sort logic

        numbers2.add(20);
        numbers2.add(20);
        numbers2.add(12);
        numbers2.add(2);
        numbers2.add(1);
        numbers2.add(11);
        numbers2.add(200);
        numbers2.add(15);
        numbers2.add(3);

        System.out.println(numbers2);

        Integer num2=numbers2.poll();
        System.out.println("num2 = " + num2); //20
        System.out.println(numbers2);

    }
}
