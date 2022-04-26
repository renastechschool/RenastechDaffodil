package code.day25_StaticKeyword;

import code.MyUtils.GenericUtils;
import code.day24_ClassessAndObject.Shoe;

import java.util.Arrays;

public class c1_ShoeObjects {

    public static void main(String[] args) {
        //how to create a shoe object
        // I need  to call my class and import in this class

        Shoe shoe1=new Shoe();
        //to be able to use any variable or  method under shoe class
        // you will need an object

        shoe1.wear();

        //setshoeinfo
        shoe1.setShoeInfo("puma",5,"red");
        shoe1.wear();
        shoe1.getShoeInfo();

        System.out.println(shoe1); // this will print toString method.
        //if you dont have toString method under shoe class
        //it will give you hashcode

        Shoe shoe2=new Shoe();
        shoe2.setShoeInfo("converse",11,"black");

        Shoe [] shoes = {shoe1,shoe2};
        System.out.println(Arrays.toString(shoes));

//        shoes[0].wear();

        GenericUtils.Stars();

        for (int i=0; i < shoes.length ; i++){

            shoes[i].wear();
            shoes[i].getShoeInfo();
        }


    }
}
