package code.day32_Polymorphism;


public class Polymorphism {

    //it is another concept of oop

    //Polymorphism in Java is the ability of an object to take many forms.
    //    //// To simply put, polymorphism in java allows us to perform the same action in many different ways.
    //
    //    ////WebDriver driver=new ChromeDriver();
    //    ////WebDriver driver=new FirefoxDriver();

    public static void main(String[] args) {
        car car1=new car();
        BMW bmw1=new BMW();
        toyota toyota1=new toyota();
        Tesla tesla1=new Tesla();

        //Polymorphism in Java is the ability of an object to take many forms.
        car bmw2=new BMW();
        car toyota2=new toyota();

        //BMW bmw3=new car();
       // car tesla2=new Tesla();  tesla doesnt have any parent it can not take different forms

        car [] arr={car1,bmw1,toyota1,bmw2,toyota2};

        BMW [] arr2={bmw1};
        //we cant put bmw2 in bmw array because bmw2 has for of parent which is car
    }
}


class car{

}

class BMW extends car{

}

class toyota extends  car{

}

class Tesla{

}