package code.StudyHallSessions.Week11.Session2;

// create an abstract class called Phone
public abstract class Phone {

    //attributes: brand, model, price, size
    static String brand;
    String model;
    double price;
    int size;



   // abstract methods: calling(), texting()

    public abstract void calling();
    public abstract void texting();


    // instance method: toString()
    public String toString(){

        return "brand is : "+brand +" model is :  "+model+" price : "+price+"$$ , size : "+size;

    }

    /*



--create a constructor to assign model , price and size for iphone and samsung

create a phoneobject class
to create 5 iphone object and 5 samsung object
use all the methods for all objects
plus you can create extra special methods for iphone and samsung classes
     */
}
//create sub classes called iphone

class iphone extends Phone {

    //--create a static block to assign brand at begining for iphone and samsung

    static {

        brand="Apple";

    }


    //--override abstract methods from parent Phone class
    public void calling(){
        System.out.println("Calling from Iphone !!");
    }

    public void texting(){
        System.out.println("Texting from Iphone !! ");

    }


    //--create a constructor to assign model , price and size for iphone and samsung

    public iphone(){

    }

    public iphone(String model, double price , int size){

        this.model=model;
        this.price=price;
        this.size=size;

    }

}

////create sub classes called samsung

class samsung extends Phone {

    //  //--create a static block to assign brand at begining for iphone and samsung

    static {
        brand="Samsung";
    }


    @Override
    public void calling() {
        System.out.println("Calling from samsung !!");

    }

    @Override
    public void texting() {
        System.out.println("Texting from samsung !!");

    }

    public samsung() {
    }


    ////--create a constructor to assign model , price and size for iphone and samsung
    public samsung(String model , double price , int size){

        this.model=model;
        this.price=price;
        this.size=size;

    }
}

class phoneobject{

    public static void main(String[] args) {

        samsung s1=new samsung();
        System.out.println(s1.price); //0.0 , because we didn't update attributes

        System.out.println(s1.brand); // Samsung
        System.out.println(s1.model); //null

        samsung s2=new samsung("S5",20,5);
        System.out.println(s2.price);//20.0

        s2.calling();//Calling from samsung !!
        s2.texting();// Texting from samsung !!

        System.out.println("***********************");

        iphone iphone1=new iphone();
        System.out.println(iphone1.brand); // Apple

        iphone1.calling(); //Calling from Iphone !!
        iphone1.texting();//Texting from Iphone !!

        System.out.println(iphone1); //brand is : Apple model is :  null price : 0.0$$ , size : 0

        iphone iphone2=new iphone("iphone 11",900.00,10);

        System.out.println(iphone2);//brand is : Apple model is :  iphone 11 price : 900.0$$ , size : 10


    }
}
