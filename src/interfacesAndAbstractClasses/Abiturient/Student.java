package interfacesAndAbstractClasses.Abiturient;

public abstract class Student implements Abiturient{
    @Override
    public void learn() {
        System.out.println("учись хорошо");
    }

    @Override
    public void doingHomework() {
        System.out.println("не забывай делать д/з");

    }

    @Override
    public void sittingInMobilePhone() {
        System.out.println("не играй на уроках");

    }
}
