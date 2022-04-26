package code.day25_StaticKeyword;

public class BMWObjects {

    public static void main(String[] args) {
        //
        BMW car1=new BMW();

        System.out.println(car1);

        car1.setCarInfo(2010 , 25300.55);
        System.out.println( car1.modelYear);
        car1.getPrice();
        //getprice is instance method we need call with object from bmw class


        System.out.println(BMW.brand);
        System.out.println(BMW.isHasEngine());
        //brand or hasEngine methods are static no need to create an object to call it
        //you can call by className
        System.out.println(car1);

        BMW car2=new BMW();

        System.out.println(car2);

    }
}
