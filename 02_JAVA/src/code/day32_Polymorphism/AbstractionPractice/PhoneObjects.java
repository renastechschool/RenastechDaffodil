package code.day32_Polymorphism.AbstractionPractice;

import code.MyUtils.GenericUtils;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone obj1=new Iphone("iphone5",200);
        //as soon as we create an obj from iphone
        //i will have access to everything inside iphone class (unless if they are priavate)

        System.out.println(obj1);
        obj1.texting(235345436);
        obj1.calling(345354353);
        obj1.downloadApp();
        obj1.iMessage(234234234);

        GenericUtils.Stars();

        Samsung obj2 = new Samsung("Samsung Galaxy" , 100);
        System.out.println(obj2);
        obj2.calling(234234);
        obj2.texting(23423432);
        obj2.downloadApp();
        obj2.helloSamsung();
    }
}
