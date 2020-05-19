package interfacesAndAbstractClasses.building;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre(200, "yyyyyyyy");
        theatre.build();
        theatre.shatter();
        System.out.println(theatre);
    }
}
