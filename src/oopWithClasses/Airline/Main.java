package oopWithClasses.Airline;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Ty-134", 1, 13.30, "14.06.2020", "moscow");
        Airline airline2 = new Airline("Ty-154", 2, 14.08, "14.06.2020", "boston");
        Airline airline3 = new Airline("Ty-204", 3, 15.10, "14.06.2020", "moscow");

        findAirlinesToTime(airline1, airline2, airline3);
        findPlase(airline1,airline2,airline3);

    }

    private static void findAirlinesToTime(Airline airline1, Airline airline2, Airline airline3) {
        if (airline1.getTime() > 14) {
            System.out.println(airline1.toString());
        }
        if (airline2.getTime() > 14) {
            System.out.println(airline2.toString());
            System.out.println(airline1.getTime()+airline1.getDestination());
            System.out.println(airline2.getTime()+airline2.getDestination());
        }
        if (airline3.getTime() > 14) {
            System.out.println(airline3.toString());
        }

    }

    private static void findPlase(Airline airline1, Airline airline2, Airline airline3) {
        ArrayList<Airline> airlines = new ArrayList<>();
        if (airline1.getDestination() == "moscow") {
            airlines.add(airline1);

        }
        if (airline2.getDestination() == "moscow") {
            airlines.add(airline2);

        }
        if (airline3.getDestination() == "moscow") {
            airlines.add(airline3);

        }
        System.out.println(airlines);


    }


}
