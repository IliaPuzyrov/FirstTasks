package interfacesAndAbstractClasses.edition;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Машины мира",189);
        Encyclopedia encyclopedia = new Encyclopedia("История книг",158,14);
        System.out.println("справочник: ");
        directory.read();
        directory.right();

        System.out.println("энциклопедия: ");
        encyclopedia.getQuantittyPages(encyclopedia.getQuantityOfPages());
        encyclopedia.read();
        encyclopedia.right();
    }

}
