package interfacesAndAbstractClasses.edition;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Машины мира",189);
        Encyclopedia encyclopedia = new Encyclopedia("История книг",158,14);
        Books(directory,encyclopedia);
    }private static void Books(Directory directory,Encyclopedia encyclopedia){
        System.out.println("справочник "+directory);
        System.out.println("энциклопедия "+encyclopedia);
    }

}
