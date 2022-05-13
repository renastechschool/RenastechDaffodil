package code.day32_Polymorphism.AbstractionPractice;
//*
// 1. create an abstract class called Phone
//            attributes: brand, model, price, size
//            abstract methods: calling(), texting()
//            instance method: toString()
//
//create sub classes called iphone and samsung
//--create a static block to assign brand at begining for iphone and samsung
//--create a constructor to assign model , prize and size for iphone and samsung
//--override abstract methods from parent Phone class

// */

//create an abstract class called Phone
//            attributes: brand, model, price, size
//            abstract methods: calling(), texting()
//            instance method: toString()
public abstract class Phone {

    public static String brand;
    public String model;
    public double price;

    public abstract void texting(long number);
    public abstract void calling(long number); // no body will be in abstract methods


    public String toString(){
        return "Phone brand : " + brand + " Phone Model " + model
                + " phone price : " + price;
    }


}

interface dowloaddable{
    public  static final boolean download=true;
    abstract void downloadApp();

}

interface appleStore extends dowloaddable{
    //below methods will be inherited in here
    //download  and downloadApp();

    String storeName="AppleStore"; //final static
}

interface playStore extends dowloaddable{
    //below methods will be inherited in here
    //download  and downloadApp();
    String storeName="PlayStore"; //final static


}