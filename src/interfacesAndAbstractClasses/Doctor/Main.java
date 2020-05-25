package interfacesAndAbstractClasses.Doctor;

public class Main {
    public static void main(String[] args) {
        Neurosurgeon neurosurgeon=new Neurosurgeon("да-да я скоро прийду домой");
        neurosurgeon.doingOperations();
        neurosurgeon.speakWithPatient();
        neurosurgeon.treat();
        neurosurgeon.workWithOutDinner();
    }


}
