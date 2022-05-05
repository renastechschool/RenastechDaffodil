package code.day29_Inheritence_Owerrting.CarTask;

import code.MyUtils.GenericUtils;

public class CarObject {

    public static void main(String[] args) {
        Audi audi=new Audi();
        audi.startCar();
        audi.consume();
        audi.stopCar();

        GenericUtils.Stars();

        BMW bmw=new BMW();
        bmw.startCar();
        bmw.consume();
        bmw.stopCar();

        GenericUtils.Stars();

        Tesla tesla=new Tesla();
        tesla.startCar();
        tesla.consume();
        tesla.stopCar();
    }
}
