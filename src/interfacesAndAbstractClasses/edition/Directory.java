package interfacesAndAbstractClasses.edition;

public class Directory extends Book {
    private String name;
    private int quantityOfPages;

    @Override
    public void read() {
        super.read();
        System.out.println("три богатыря");
    }

    @Override
    public void right() {
        super.right();
        System.out.println("Пушкин");
    }

    @Override
    public int getQuantittyPages(int n) {
        this.quantityOfPages = n;
        return super.getQuantittyPages(n);
    }

    public Directory(String name, int quantityOfPages) {
        this.name = name;
        this.quantityOfPages = quantityOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", quantityOfPages=" + quantityOfPages +
                '}';
    }
}
