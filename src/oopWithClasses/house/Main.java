package oopWithClasses.house;

import Utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(14, 2, 400, 2, 8, "Puzyrov street", "townHouse", 0);
        House house2 = new House(16, 3, 50, 5, 2, "Muhosranskaya", "Stalinka", 123);
        House house = new House(13, 7, 56, 8, 3, "zolotaya Gorka", "stalinka", 55);
        finByRooms(house1, house2, house);
        System.out.println("Список квартир с заданным этажом:");
        System.out.println(findByFloor(house1, house2, house));
        System.out.println("Список квартир с заданной площадью:");
        System.out.println(findByS(house1, house2, house));
    }

    private static void finByRooms(House house1, House house2, House house) {
        int a = Util.scan("введите кол-во комнат  ");
        ArrayList<House> list = new ArrayList<>();
        System.out.println("Список квартир с заданным количеством комнат:");
        if (house1.getNumberRooms() >= a) {
            list.add(house1);

        }
        if (house2.getNumberRooms() >= a) {
            list.add(house2);

        }
        if (house.getNumberRooms() >= a) {
            list.add(house);

        }
        System.out.println(list);

    }

    private static List<House> findByFloor(House house1, House house2, House house) {
        int a = Util.scan("введите этаж");
        List<House> list = new ArrayList<>();
        if (house1.getNumberRooms() >= a && house1.getFloor() < a) {
            list.add(house1);
        }
        if (house2.getNumberRooms() >= a && house2.getFloor() < a) {
            list.add(house2);

        }
        if (house.getNumberRooms() >= a && house.getFloor() < a) {
            list.add(house);

        }
        return list;

    }

    private static List<House> findByS(House house1, House house2, House house) {
        int a = Util.scan("введите желаемую площадь");
        List<House> list = new ArrayList<>();
        System.out.println("Список квартир с заданной площадью:");
        if (house1.getS() > a) {
            list.add(house1);
        }
        if (house2.getS() > a) {
            list.add(house2);

        }
        if (house.getS() > a) {
            list.add(house);

        }
        return list;

    }

}
