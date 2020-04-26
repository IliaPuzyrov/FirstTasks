package oopWithClasses.house;

public class House {
    private int id;
    private int numberFlat;
    private int s;
    private int floor;
    private int numberRooms;
    private String street;
    private String type;
    private int timeUsing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTimeUsing() {
        return timeUsing;
    }

    public void setTimeUsing(int timeUsing) {
        this.timeUsing = timeUsing;
    }

    public House(int id, int numberFlat, int s, int floor, int numberRooms, String street, String type, int timeUsing) {
        this.id = id;
        this.numberFlat = numberFlat;
        this.s = s;
        this.floor = floor;
        this.numberRooms = numberRooms;
        this.street = street;
        this.type = type;
        this.timeUsing = timeUsing;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numberFlat=" + numberFlat +
                ", s=" + s +
                ", floor=" + floor +
                ", numberRooms=" + numberRooms +
                ", street='" + street + '\'' +
                ", type='" + type + '\'' +
                ", timeUsing=" + timeUsing +
                '}';
    }
}
