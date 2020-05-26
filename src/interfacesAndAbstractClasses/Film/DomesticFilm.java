package interfacesAndAbstractClasses.Film;

public abstract class DomesticFilm implements Film{
    @Override
    public void watch() {
        System.out.println("алаля");
    }

    @Override
    public void year() {
        System.out.println("старичок");

    }
}
