package com.chrisz;

public class Main {

    public static void main(String[] args) {

        // Benefit of interface is being able to define different classes as a type of interface
        //      that has the same behavior, see https://www.youtube.com/watch?v=8hfDDCt9Y7I&index=1&list=PLEH2kL-crMGFy3lpZGTNE2ega_d598oI9
        // Have to overwrite all methods from Interface in class using it
        // Interfaces are typically named with capital I first


        ITelephone timsPhone;
        timsPhone = new DeskPhone(12345);
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();

        System.out.println("*******************************");
        timsPhone = new MobilePhone(1245);
        timsPhone.powerOn();
        timsPhone.callPhone(1245);
        timsPhone.answer();
    }
}
