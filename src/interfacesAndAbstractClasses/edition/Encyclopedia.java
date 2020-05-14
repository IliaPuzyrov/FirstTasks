package interfacesAndAbstractClasses.edition;

public class Encyclopedia extends Book {
    private String name;
    private int quantityOfPages;
    private int quantityOfChapter;

    @Override
    public void read() {
        super.read();
        System.out.println("Гарри Поттер");
    }

    @Override
    public void right() {
        super.right();
        System.out.println("Аркадий Паровозов");
    }

    @Override
    public int getQuantittyPages(int n) {
        this.quantityOfPages = n;
        return super.getQuantittyPages(n);
    }

    public int quantityOfChapter(int quantityOfChapter) {
        this.quantityOfPages = quantityOfChapter;
        return quantityOfChapter;

    }

    public Encyclopedia(String name, int quantityOfPages, int quantityOfChapter) {
        this.name = name;
        this.quantityOfPages = quantityOfPages;
        this.quantityOfChapter = quantityOfChapter;
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

    public int getQuantityOfChapter() {
        return quantityOfChapter;
    }

    public void setQuantityOfChapter(int quantityOfChapter) {
        this.quantityOfChapter = quantityOfChapter;

    }

    @Override
    public String toString() {
        return "Encyclopedia{" +
                "name='" + name + '\'' +
                ", quantityOfPages=" + quantityOfPages +
                ", quantityOfChapter=" + quantityOfChapter +
                '}';
    }
}
