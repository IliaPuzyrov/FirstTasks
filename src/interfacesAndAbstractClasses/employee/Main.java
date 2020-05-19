package interfacesAndAbstractClasses.employee;

public class Main {
    public static void main(String[] args) {
        Suprervisor suprervisor=new Suprervisor("top-top",8);
        suprervisor.dinner();
        suprervisor.ill();
        suprervisor.work();
        suprervisor.workAtHome();
        suprervisor.toString();
        Suprervisor suprervisor1=new Suprervisor("top-top",13);
        suprervisor1.toString();
        System.out.println(suprervisor.getGoHome().equals(suprervisor1.getGoHome()));
        System.out.println(suprervisor.getGoHome().hashCode());
        System.out.println(suprervisor.getGoHome().hashCode());
    }
}
