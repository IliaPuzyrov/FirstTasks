package interfacesAndAbstractClasses.edition;

public abstract class Book implements Edition{
    @Override
    public void read() {
        System.out.println("три богатыря");
    }

    @Override
    public void right() {
        System.out.println("Пушкин");
    }

    @Override
    public int getQuantittyPages(int n) {
        return n;
    }
}
