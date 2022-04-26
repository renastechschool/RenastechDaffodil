package code.day25_StaticKeyword;

public class BMW {

    //brand        static
    //modelYear   == instance
    //price      ==  instance
    //color      instance
    //miles    instance
    //hasEngine     static
    //horsePower    instance
    //......

    //if you are not going to create multiple copy from object better to use static variables
    // ex : folderPaths , enviromentName , specific url

    static String brand = "BMW" ;
    static boolean hasEngine=true;
    int modelYear;
    double price;
    //....

    public void setCarInfo(int modelYear , double price){
        this.modelYear=modelYear;
        //this keyword is used for define my instance variable in the class
        this.price=price;
    }

    //create a method that returns only price
    public double getPrice(){
        return price;
    }

    //to return has engine
    public static boolean isHasEngine(){
        return hasEngine;
    }

    public String toString(){
        return brand + "----" + modelYear + " has engine " + hasEngine +"======"+ price;
    }



}
