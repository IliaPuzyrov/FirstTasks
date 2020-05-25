package interfacesAndAbstractClasses.Furniture;

public abstract class Cupboard implements Furniture{
    @Override
    public void door() {
        System.out.println("тук-тук");
    }

    @Override
    public void shelf() {
        System.out.println("бах!");

    }

    @Override
    public void doorHandle() {
        System.out.println("кхр");

    }
}
