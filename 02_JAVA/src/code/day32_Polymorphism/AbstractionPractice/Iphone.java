package code.day32_Polymorphism.AbstractionPractice;

public class Iphone extends Phone implements appleStore{
    //after we extending phone
    //brand,model,price    inherited
    //texting,calling       inherited   --- abstract methods  (you need override )
    //tostring            inherited

    //after we implement the applestore
    //storename
    //download
    //downloadApp method -- abstract (you need override )

    static {
        brand = "-----Apple------";
    }

    public Iphone(String model, double price){
        this.model=model;
        this.price=price;
    }

    @Override
    public void texting(long number) {
        System.out.println(brand +  " " + model + " is texting " + number);
    }

    @Override
    public void calling(long number) {
        System.out.println(brand +  " " + model + " is calling " + number);
    }

    @Override
    public void downloadApp() {
        System.out.println(brand +  " " + model + " is downloading  from  " + storeName);
    }

    public void iMessage(long number){
        System.out.println(brand +  " " + model + " is iMessaging to " + number);
    }
}
