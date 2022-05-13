package code.day32_Polymorphism.AbstractionPractice;

public class Samsung extends Phone implements playStore{
    //after we extending phone
    //brand,model,price    inherited
    //texting,calling       inherited   --- abstract methods  (you need owerride )
    //tostring            inherited

    //after we implement the playstore
    //storename
    //download
    //downloadApp method -- abstract (you need owerride )

    static {
        brand = " ----- Samsung -------";
    }

    //--create a constructor to assign model ,
    // prize and size for iphone and samsung
    public Samsung(String model , double price){
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

    public void helloSamsung(){
        System.out.println(brand + model + " is here ");
    }
}
