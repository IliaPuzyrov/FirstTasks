package oopWithClasses.Airline;

import java.util.Date;

public class Airline {
    private String type;
    private int numberFlight;
    private double time;
    private String dateFlight;
    private String destination;

    public Airline(String type, int numberFlight, double time, String dateFlight, String destination) {
        this.type = type;
        this.numberFlight = numberFlight;
        this.time = time;
        this.dateFlight = dateFlight;
        this.destination = destination;

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberFlight() {
        return numberFlight;
    }

    public void setNumberFlight(int numberFlight) {
        this.numberFlight = numberFlight;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getDateFlight() {
        return dateFlight;
    }

    public void setDateFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "type='" + type + '\'' +
                ", numberFlight=" + numberFlight +
                ", time=" + time +
                ", dateFlight=" + dateFlight + ", destination= " + destination +
                '}';
    }
}
