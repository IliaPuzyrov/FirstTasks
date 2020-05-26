package interfacesAndAbstractClasses.Film;

public class Main {
    public static void main(String[] args) {
        Comedy comedy=new Comedy("интересный фильмец");
        Comedy comedy1=new Comedy("фуфел");
        comedy.watch();
        comedy.year();
        System.out.println(comedy.equals(comedy1));
    }
}
