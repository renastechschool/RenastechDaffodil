package code.day34_Maps;

public class c4_GarbageCollector {

    public static void main(String[] args) throws Throwable {

        String str = new String("Hello"); // will be removed by garbage collactor
        str = new String("world");
        //after i removed reference from hello by reassing str to "World"
        //java garbage collater will remove hello from the memory

        Integer number =new Integer(20);//will be collected by garbage collector
        number = new Integer(11);

        c4_GarbageCollector garbage1=new c4_GarbageCollector();
        new c4_GarbageCollector();// this will be collected by java garbage collacter

        //reason  is to have garbage collector is to keep mememory reausable

        Byte b1=new Byte((byte) 3);//3 will be collected
        b1=null;

        c4_GarbageCollector obj = new c4_GarbageCollector();
        obj.finalize();
        //finalize method is called by garbage collacter to sent our object to garbage


    }
}



//The final keyword can be used with class method and variable. A final class cannot be instantiated,
// a final method cannot be overridden and a final variable cannot be reassigned.
//
//The finally keyword is used to create a block of code that follows a try block.
// A finally block of code always executes, whether or not an exception has occurred.
// Using a finally block allows you to run any cleanup-type statements that you just wish to execute,
// despite what happens within the protected code.
//
//The finalize() method is used just before object is destroyed and can be called just
// prior to object creation.