package oopWithClasses.car;

import Utils.Util;
import arrays.Unit1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2000, 387, "mers", "pro age", "white");
        Car car2 = new Car(1987, 140, "ford", "fgh", "blue");
        Car car3 = new Car(Util.scan("введи год"), 1009, "belarus", "трахтар", "серо-буро-малиновый");

        System.out.println("вторая" + car2.toString());
        System.out.println("первая" + car1.toString());
        System.out.println("третья" + car3.toString());


        System.out.println();
        if (car1.getYear() < car3.getYear()) {
            System.out.println("ты сделал невозможное,белоруса не победить");
        } else if (car1.getYear() > car3.getYear()) {
            System.out.println("все печаль");
        }

        car2.setSpeed(100);
        System.out.println(car2.getSpeed());


        car1.setColor("gren");
        car2.setColor("tramp");
        car3.setColor("картофельный");
        System.out.println("машины перекрашены: " + car1.getColor() + " , " + car2.getColor() + " , " + car3.getColor());


        Moto moto = new Moto();
        moto.doBip();
        car1.doBip();

    }
}
