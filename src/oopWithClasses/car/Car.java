package oopWithClasses.car;

public class Car implements MovableProperty {
    private int year;


    private int speed;
    private String mark;
    private String model;
    private String color;

    public Car(int year, int speed, String mark, String model, String color) {
        this.year = year;
        this.speed = speed;
        this.model = model;
        this.mark = mark;
        this.color = color;

    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "год =" + year +
                ", скорость машины =" + speed +
                ", mark ='" + mark + '\'' +
                ", model ='" + model + '\'' +
                ", цвет ='" + color + '\'' +
                '}';
    }

    @Override
    public void doBip() {
        System.out.println("Бибип");
    }
}
