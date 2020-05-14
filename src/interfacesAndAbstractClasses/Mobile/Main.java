package interfacesAndAbstractClasses.Mobile;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Model("3G", 40);
        Mobile(mobile);
    }

    private static void Mobile(Mobile mobile) {
        System.out.println("телефон"+mobile);
    }
}
